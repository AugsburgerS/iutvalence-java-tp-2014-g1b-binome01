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
	private Random aleatoire = new Random();
	
	/**
	 * Variable correspondant au nombre de joueurs de la partie
	 */
	private int nombreDeJoueurs;

	/**
	 * Tableau contenant la liste des joueurs de la partie
	 * (Le joueur à l'indice 0 est le meurtrier)
	 */
	private Joueur[] joueurs;
	
	/**
	 * Plateau de jeu
	 */
	private Plateau plateau;

	private Suspects meurtrier;
	private Armes armeMeurtrier;
	private Lieux lieuMeurtre;

	List<Pion> listePions = new LinkedList<Pion>();
	List<Suspects> listeSuspects = new LinkedList<Suspects>();
	List<Armes> listeArmes = new LinkedList<Armes>();
	List<Lieux> listeLieux = new LinkedList<Lieux>();

	// TODO (fait) écrire un commentaire plus précis
	/**
	 * Constructeur d'initialisation d'une partie avec un nombre de joueurs défini
	 * @param nombreDeJoueurs nombre de joueurs
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
		//this.plateau.afficherPlateau();
		
		this.initialiserJoueurs();
		this.distribuerCartes();
	}

	/**
	 * Initialisation des joueurs : attribution d'un pion et d'un nom
	 */
	private void initialiserJoueurs()
	{
		this.listePions.clear();
		for(Pion pion : Pion.values())
		{
			this.listePions.add(pion);
		}
		for (int i = 0; i < this.nombreDeJoueurs; i++)
		{
			this.joueurs[i] = new Joueur(this.saisirPrenom(i), this.attribuerPion());
		}
	}

	private Pion attribuerPion()
	{
		int indice = this.aleatoire.nextInt() % (this.listePions.size() + 1);
		Pion pion = this.listePions.get(indice);
		this.listePions.remove(indice);
		return pion;
	}

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
		this.listeSuspects.clear();
		for(Suspects suspect : Suspects.values())
		{
			this.listeSuspects.add(suspect);
		}
		
		this.listeArmes.clear();
		for(Armes arme : Armes.values())
		{
			this.listeArmes.add(arme);
		}
		
		this.listeLieux.clear();
		for(Lieux lieu : Lieux.values())
		{
			if (!Lieux.CLUEDO.equals(lieu) && !Lieux.VIDE.equals(lieu) && !Lieux.COULOIR.equals(lieu))
			{
				this.listeLieux.add(lieu);
			}
		}
		
		this.initialiserMeurtrier();
		
	}

	private void initialiserMeurtrier()
	{
		int indiceSuspects = this.aleatoire.nextInt() % (this.listeSuspects.size() + 1);
		int indiceArmes = this.aleatoire.nextInt() % (this.listeArmes.size() + 1);
		int indiceLieux = this.aleatoire.nextInt() % (this.listeLieux.size() + 1);
		meurtrier = this.listeSuspects.get(indiceSuspects);
		armeMeurtrier = this.listeArmes.get(indiceArmes);
		lieuMeurtre = this.listeLieux.get(indiceLieux);
		this.listeSuspects.remove(indiceSuspects);
		this.listeArmes.remove(indiceArmes);
		this.listeLieux.remove(indiceLieux);
	}
}
