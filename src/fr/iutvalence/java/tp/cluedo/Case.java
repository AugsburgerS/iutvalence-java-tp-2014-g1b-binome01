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
	private static Piece TYPE_CASE;
	
	/**
	 * Type de la cloison au Nord de la case
	 */
	private static Cloison NORD;
	
	/**
	 * Type de la cloison au SUD de la case
	 */
	private static Cloison SUD;
	
	/**
	 * Type de la cloison au EST de la case
	 */
	private static Cloison EST;
	
	/**
	 * Type de la cloison au OUEST de la case
	 */
	private static Cloison OUEST;

	/**
	 * Constructeur permettant d'initialiser une case par son type
	 * @param typeCase le type de la case créée
	 * @param nord Type, de cloison au nord de la case
	 * @param sud Type, de cloison au sud de la case
	 * @param est Type, de cloison au est de la case
	 * @param ouest Type, de cloison au ouest de la case
	 */
	public Case(Piece typeCase, Cloison nord, Cloison sud, Cloison est, Cloison ouest)
	{
		this.TYPE_CASE = typeCase;
		this.NORD = nord;
		this.SUD = sud;
		this.EST = est;
		this.OUEST = ouest;
	}
}