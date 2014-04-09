package fr.iutvalence.java.tp.cluedo;

/**
 * Classe gérant une position sur le plateau composée d'une ligne et d'une colonne
 * 
 * @author Sebastien
 */
public class Position
{
	/**
	 * Colonne de la position sur le plateau
	 */
	public int colonne;

	/**
	 * Ligne de la position sur le plateau
	 */
	public int ligne;

	/**
	 * Constructeur d'une position en fonction de sa ligne/colonne sur le plateau
	 * @param colonne la colonne de la position sur le plateau
	 * @param ligne la ligne de la position sur le plateau
	 */
	public Position(int colonne, int ligne)
	{
		this.colonne = colonne;
		this.ligne = ligne;
	}
}
