package fr.iutvalence.java.tp.cluedo;

/**
 * Classe permettant de manipuler les différentes pièces et couloirs
 * 
 * @author augsburs
 */
public enum Piece
{

	/**
	 * La pièce cuisine
	 */
	CUISINE("C"),

	/**
	 * La pièce chambre
	 */
	CHAMBRE("A"),

	/**
	 * La pièce salle de bains
	 */
	SALLE_DE_BAINS("D"),

	/**
	 * La pièce salle à manger
	 */
	SALLE_A_MANGER("M"),

	/**
	 * La pièce salle de jeux
	 */
	SALLE_DE_JEUX("J"),

	/**
	 * La pièce bibliothèque
	 */
	BIBLIOTHEQUE("L"),

	/**
	 * La pièce bureau
	 */
	BUREAU("B"),

	/**
	 * La pièce hall
	 */
	HALL("H"),

	/**
	 * La pièce salon
	 */
	SALON("S"),

	/**
	 * La pièce cluedo
	 */
	CLUEDO("O"),

	/**
	 * Le type porte
	 */
	PORTE("P"),

	/**
	 * La case couloir
	 */
	COULOIR("R"),

	/**
	 * La case vide
	 */
	VIDE("V");
	
	/**
	 * Constante correspondant au symbole d'une pièce
	 */
	public final String symbole;

	/**
	 * Constructeur d'une pièce initialisant le symbole de la dite pièce
	 * @param caractere
	 */
	private Piece(String symbole)
	{
		this.symbole = symbole;
	}

	/**
	 * Obtenir le symbole associé à la pièce
	 * @return le symbole associé à la pièce
	 */
	public String obtenirSymbole()
	{
		return this.symbole;
	}
}