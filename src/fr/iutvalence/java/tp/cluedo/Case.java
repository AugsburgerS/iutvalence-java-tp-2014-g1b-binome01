package fr.iutvalence.java.tp.cluedo;

/**
 * Classe dans laquelle sont déclarées toutes les cases différentes possibles
 * @author augsburs
 */
public class Case
{
	/**
	 * Le type de la case
	 */
	private static Piece typeCase;
	
	/**
	 * La coordonnée X de la case sur le plateau
	 */
	private static int coordX;
	
	/**
	 * La coordonnée Y de la case sur le plateau
	 */
	private static int coordY;
	
	/**
	 * L'orientation de la case
	 */
	private static Orientation orientation;

	/**
	 * Constructeur permettant d'initialiser une case par son type et ses coordonnées
	 * @param typeCase
	 * @param coordX
	 * @param coordY
	 */
	public Case(Piece typeCase, int coordX, int coordY)
	{
		this.typeCase = typeCase;
		this.coordX = coordX;
		this.coordY = coordY;
	}

	/**
	 * Constructeur initialisant une case dont le contenu est une porte 
	 * @param coordX la coordonnée X de la case sur le plateau
	 * @param coordY la coordonnée Y de la case sur le plateau
	 * @param orientation l'orientation de la case (Nord, sud, ...)
	 */
	public Case(Orientation orientation, int coordX, int coordY)
	{
		this.orientation = orientation;
		this.coordX = coordX;
		this.coordY = coordY;
	}
}