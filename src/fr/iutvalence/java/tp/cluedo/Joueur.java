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
	private final String prenom;

	/**
	 * Attribut correspondant au pion alloué au joueur
	 */ 
	private final Pion pion;
	
	/**
	 * Liste des cartes suspects que possède le joueur
	 */
	public Suspects[] cartesSuspects;

	/**
	 * Liste des cartes armes que possède le joueur
	 */
	public Armes[] cartesArmes;
	
	/**
	 * Liste des cartes lieux que possède le joueur
	 */
	public Lieux[] cartesLieux;

	/**
	 * Constructeur d'un joueur en fonction de son prénom et de son pion 
	 * @param prenom prénom du joueur
	 * @param pion pion attribué au joueur
	 */
	public Joueur(String prenom, Pion pion)
	{
		this.prenom = prenom;
		this.pion = pion;
	}
}