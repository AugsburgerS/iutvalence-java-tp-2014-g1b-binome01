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
	 * Variable correspondant au nombre de joueurs de la partie
	 */
	private int nombreDeJoueurs;

	/**
	 * Tableau contenant la liste des joueurs de la partie (Le joueur à l'indice
	 * 0 est le meurtrier)
	 */
	private Joueur[] joueurs;

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
		// this.plateau.afficherPlateau();

		this.initialiserJoueurs();
		this.distribuerCartes();
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
			this.joueurs[i] = new Joueur(this.saisirPrenom(i), pion);
		}
	}

	/**
	 * Saisie clavier du prénom d'un joueur
	 * 
	 * @param numeroJoueur
	 *            numéro du joueur auquel demander le prénom
	 * @return prenom le prenom entré au clavier
	 */
	private String saisirPrenom(int numeroJoueur)
	{
		System.out.println("Joueur n°" + (numeroJoueur) + ", veuillez saisir votre prénom:");
		// TODO Demander au joueur (console) de rentrer son prénom
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

		for (int i = 0; i < this.nombreDeJoueurs; i++)
		{
			switch (generateurDeNombresAleatoires.nextInt(3))
			{
			case 0:
				int numeroCarteSuspect = generateurDeNombresAleatoires.nextInt(listeSuspects.size());
				Suspect carteSuspect = listeSuspects.remove(numeroCarteSuspect);
				this.joueurs[i].ajouterCarte(carteSuspect);
				break;
			case 1:
				int numeroCarteArme = generateurDeNombresAleatoires.nextInt(listeArmes.size());
				Arme carteArme = listeArmes.remove(numeroCarteArme);
				this.joueurs[i].ajouterCarte(carteArme);
				break;
			case 2:
				int numeroCarteLieu = generateurDeNombresAleatoires.nextInt(listeLieux.size());
				Lieu carteLieu = listeLieux.remove(numeroCarteLieu);
				this.joueurs[i].ajouterCarte(carteLieu);
				break;
			}
		}
	}
}