package fr.iutvalence.java.tp.cluedo;

// TODO (fait) écrire un commentaire plus précis
/**
 * Classe gérant une partie de Cluedo
 * @author augsburs
 */
public class Cluedo
{
	/**
	 * Variable correspondant au nombre de joueurs de la partie
	 */
	private int nombreDeJoueurs;
	
	// TODO (fait) écrire un commentaire plus précis
	/**
	 * Constructeur d'initialisation d'une partie avec un nombre de joueurs défini
	 * @param nombreDeJoueurs nombre de joueurs
	 */
	public Cluedo(int nombreDeJoueurs)
	{
		this.nombreDeJoueurs = nombreDeJoueurs;
	}
	
	/**
	 * Jouer la partie
	 */
	public void jouer()
	{
		Plateau plateau = new Plateau();
	}
}
