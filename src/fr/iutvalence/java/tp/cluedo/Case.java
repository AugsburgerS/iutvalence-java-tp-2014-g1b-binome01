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
	 * L'orientation de la case
	 */
	private static Orientation orientation;

	/**
	 * Constructeur permettant d'initialiser une case par son type
	 * @param typeCase le type de la case créée
	 */
	public Case(Piece typeCase)
	{
		this.typeCase = typeCase;
	}

	/**
	 * Constructeur initialisant une case dont le contenu est une porte
	 * @param orientation l'orientation de la case (Nord, sud, ...)
	 */
	public Case(Orientation orientation)
	{
		this.orientation = orientation;
	}
}