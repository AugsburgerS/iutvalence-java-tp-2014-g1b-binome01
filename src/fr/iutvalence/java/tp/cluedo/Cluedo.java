package fr.iutvalence.java.tp.cluedo;

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
	 * Tableau contenant la liste des joueurs de la partie
	 */
	private Joueur[] joueurs;

	/**
	 * Plateau de jeu
	 */
	private Plateau plateau;

	private Suspects Meurtrier;
	//private Arme armeMeurtrier;
	//private CartePiece pieceMeurtre;

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
		//this.plateau.afficherPlateau();

		/**
		 * Variables intermédiaires
		 */
		int i = 0;
		String prenom;
		Pion pion;
		/**
		 * Initialisation des joueurs
		 */
		for (i = 0; i < this.nombreDeJoueurs; i++)
		{
			System.out.println("Joueur " + (i+1) + ", veuillez saisir votre prénom:");
			prenom = "Test";
			pion = Pion.BLANC;
			this.joueurs[i] = new Joueur(prenom, pion);
		}
		
		this.distribuerCartes();
	}

	/**
	 * Méthode attribuant les cartes aux joueurs et les cartes cachées
	 */
	private void distribuerCartes()
	{
		
	}
}
