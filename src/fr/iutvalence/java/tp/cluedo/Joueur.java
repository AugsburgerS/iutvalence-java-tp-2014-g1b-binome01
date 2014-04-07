package fr.iutvalence.java.tp.cluedo;

import java.util.LinkedList;
import java.util.List;

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
	 * Liste des cartes suspect que possède le joueur
	 */
	private List<Suspect> cartesSuspect = new LinkedList<Suspect>();

	/**
	 * Liste des cartes arme que possède le joueur
	 */
	private List<Arme> cartesArme = new LinkedList<Arme>();
	
	/**
	 * Liste des cartes lieu que possède le joueur
	 */
	private List<Lieu> cartesLieu = new LinkedList<Lieu>();

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
	
	/**
	 * Méthode d'ajout d'une carte suspect dans la main du joueur
	 * @param carteSuspect
	 */
	public void ajouterCarte(Suspect carteSuspect)
	{
		this.cartesSuspect.add(carteSuspect);
	}
	
	/**
	 * Méthode d'ajout d'une carte arme dans la main du joueur
	 * @param carteArme
	 */
	public void ajouterCarte(Arme carteArme)
	{
		this.cartesArme.add(carteArme);
	}
	
	/**
	 * Méthode d'ajout d'une carte lieu dans la main du joueur
	 * @param carteLieu
	 */
	public void ajouterCarte(Lieu carteLieu)
	{
		this.cartesLieu.add(carteLieu);
	}
}