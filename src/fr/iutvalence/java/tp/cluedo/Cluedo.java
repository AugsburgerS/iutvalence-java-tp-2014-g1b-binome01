package fr.iutvalence.java.tp.cluedo;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// TODO (fait) écrire un commentaire plus précis
/**
 * Classe gérant une partie de Cluedo
 * 
 * @author augsburs
 */
public class Cluedo
{
	/**
	 * Constante égale au nombre de cartes distribuées à chaque joueur
	 */
	private static final int NB_CARTES_PAR_JOUEUR = 3;

	/**
	 * Variable correspondant au nombre de joueurs de la partie
	 */
	private int nombreDeJoueurs;
	
	/**
	 * Booléen caractérisant l'état de la partie en cours
	 */
	private boolean finDeLaPartie = false;
	
	/**
	 * Le numéro du tour en cours, le premier tour de la partie est le tour 1
	 */
	private int numeroTour;

	/**
	 * Collection des joueurs de la partie
	 */
	private List<Joueur> listeJoueurs = new LinkedList<Joueur>();

	/**
	 * Plateau de jeu
	 */
	private Plateau plateau;

	private Suspect meurtrier;
	private Arme armeMeurtrier;
	private Lieu lieuMeurtre;

	// TODO (fait) écrire un commentaire plus précis
	/**
	 * Constructeur d'initialisation d'une partie avec un nombre de joueurs
	 * défini
	 * 
	 * @param nombreDeJoueurs
	 *            nombre de joueurs
	 */
	public Cluedo(int nombreDeJoueurs)
	{
		this.nombreDeJoueurs = nombreDeJoueurs;
		this.plateau = new Plateau();
	}

	/**
	 * Jouer la partie
	 */
	public void jouer()
	{
		/* Initialisation de la partie */
		this.initialiserJoueurs();
		this.distribuerCartes();
		this.placerPionsJoueurs();
		this.numeroTour = 0;
		Random generateurLanceDe = new Random();
		List<Position> depPossJoueurCourant = new LinkedList<Position>();
		
		/* Début de la partie */
		while (!this.finDeLaPartie)
		{
			this.numeroTour++;
			for (Joueur joueurCourant : this.listeJoueurs)
			{
				int de1 = generateurLanceDe.nextInt(6);
				int de2 = generateurLanceDe.nextInt(6);
				Position posiChoisie;
				
				/* Cas où le dé est un double 6 ou double 1 */
				if ((de1 == 6 && de2 == 6) || (de1 == 1 && de2 == 1))
					posiChoisie = joueurCourant.demanderChoixDeplacementDouble();
				else
				{
					depPossJoueurCourant.addAll(joueurCourant.deplacementsPossibles(this.plateau, de1 + de2));
					posiChoisie = joueurCourant.demanderChoixDeplacement(depPossJoueurCourant);
				}
				joueurCourant.deplacerPion(posiChoisie);
				
				/* Formulation d'une hypothèse par le joueur */
				joueurCourant.formulerHypothese();
				
				/* Formulation d'une accusation par le joueur, si il a tout juste la partie est gagnée */
				this.finDeLaPartie = joueurCourant.formulerAccusation(this.meurtrier, this.armeMeurtrier, this.lieuMeurtre);
			}
		}
	}

	/**
	 * Place tous les pions sur le plateau (ceux n'étant pas attribués à un joueur servant pour les hypothèses
	 */
	private void placerPionsJoueurs()
	{
		for (Pion pion : Pion.values())
		{
			pion.deplacerPion(pion.lieuInitialPion().positionsDuLieu().get(0));
		}
	}

	/**
	 * Initialisation des joueurs : attribution d'un pion et d'un nom
	 */
	private void initialiserJoueurs()
	{
		List<Pion> listePions = new LinkedList<Pion>();
		Random generateurDeNombresAleatoires = new Random();

		for (Pion pion : Pion.values())
			listePions.add(pion);

		for (int i = 0; i < this.nombreDeJoueurs; i++)
		{
			int numeroDuPion = generateurDeNombresAleatoires.nextInt(listePions.size());
			Pion pion = listePions.remove(numeroDuPion);
			this.listeJoueurs.add(new Joueur(this.saisirPrenom(i), pion));
		}
	}

	/**
	 * Saisie clavier du prénom d'un joueur
	 * 
	 * @param numeroJoueur numéro du joueur auquel demander le prénom
	 * @return prenom le prenom entré au clavier
	 */
	private String saisirPrenom(int numeroJoueur)
	{
		System.out.println("Joueur n°" + (numeroJoueur) + ", veuillez saisir votre prénom:");
		// TODO Demander au joueur de rentrer son prénom
		return null;
	}

	/**
	 * Méthode attribuant les cartes aux joueurs et les cartes cachées
	 */
	private void distribuerCartes()
	{
		Random generateurDeNombresAleatoires = new Random();
		List<Suspect> listeSuspects = new LinkedList<Suspect>();
		List<Arme> listeArmes = new LinkedList<Arme>();
		List<Lieu> listeLieux = new LinkedList<Lieu>();

		for (Suspect suspect : Suspect.values())
			listeSuspects.add(suspect);

		for (Arme arme : Arme.values())
			listeArmes.add(arme);

		for (Lieu lieu : Lieu.values())
			if (!Lieu.CLUEDO.equals(lieu) && !Lieu.VIDE.equals(lieu) && !Lieu.COULOIR.equals(lieu))
				listeLieux.add(lieu);

		/* Attribution du meurtrier et suppression de la carte */
		int numeroSuspect = generateurDeNombresAleatoires.nextInt(listeSuspects.size());
		this.meurtrier = listeSuspects.get(numeroSuspect);
		listeSuspects.remove(numeroSuspect);

		/* Attribution de l'arme du meurtre et suppression de la carte */
		int numeroArme = generateurDeNombresAleatoires.nextInt(listeArmes.size());
		this.armeMeurtrier = listeArmes.get(numeroArme);
		listeArmes.remove(numeroArme);

		/* Attribution du lieu du meurtre et suppression de la carte */
		int numeroLieu = generateurDeNombresAleatoires.nextInt(listeLieux.size());
		this.lieuMeurtre = listeLieux.get(numeroLieu);
		listeLieux.remove(numeroLieu);

		for (Joueur joueurCourant : this.listeJoueurs)
			for (int j = 0; j < NB_CARTES_PAR_JOUEUR; j++)
				switch (generateurDeNombresAleatoires.nextInt(3))
				{
				case 0:
					int numeroCarteSuspect = generateurDeNombresAleatoires.nextInt(listeSuspects.size());
					Suspect carteSuspect = listeSuspects.remove(numeroCarteSuspect);
					joueurCourant.ajouterCarte(carteSuspect);
					break;
				case 1:
					int numeroCarteArme = generateurDeNombresAleatoires.nextInt(listeArmes.size());
					Arme carteArme = listeArmes.remove(numeroCarteArme);
					joueurCourant.ajouterCarte(carteArme);
					break;
				case 2:
					int numeroCarteLieu = generateurDeNombresAleatoires.nextInt(listeLieux.size());
					Lieu carteLieu = listeLieux.remove(numeroCarteLieu);
					joueurCourant.ajouterCarte(carteLieu);
					break;
				default:
					break;
				}
	}
}