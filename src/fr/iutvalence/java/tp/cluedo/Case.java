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
	private final Lieu type_case;

	/**
	 * Cloisons de la case dans l'ordre  suivant : Nord, Est, Sud, Ouest
	 */
	private final Cloison[] cloisons;

	/**
	 * Constructeur permettant d'initialiser une case par son type
	 * @param typeCase le type de la case créée
	 * @param nord Type, de cloison au nord de la case
	 * @param sud Type, de cloison au sud de la case
	 * @param est Type, de cloison à l'est de la case
	 * @param ouest Type, de cloison à l'ouest de la case
	 */
	public Case(Lieu typeCase, Cloison[] cloisons)
	{
		this.type_case = typeCase;
		this.cloisons = cloisons;
	}
	
	/**
	 * Accesseur en lecture du type de la case
	 * @return TypeCase
	 */
	public final Lieu obtenirTypeCase()
	{
		return type_case;
	}

	/**
	 * Accesseur en lecture du tableau de cloisons
	 * @return cloisons
	 */
	public final Cloison[] obtenirCloisons()
	{
		return cloisons;
	}
}