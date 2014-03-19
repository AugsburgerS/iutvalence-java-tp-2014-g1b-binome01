package fr.iutvalence.java.tp.cluedo;

/**
 * Classe gérant les caractéristiques d'un joueur
 * 
 * @author augsburs
 */
public class Joueur
{
	/**
	 * Attribut correspondant au prénom du joueur
	 */
	private static String PRENOM;

	/**
	 * Attribut correspondant au pion alloué au joueur
	 */
	private static Pion PION;

	public Joueur(String prenom, Pion pion)
	{
		this.PRENOM = prenom;
		this.PION = pion;
	}
}
