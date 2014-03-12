package fr.iutvalence.java.tp.cluedo;

/**
 * Classe gérant le plateau de jeu
 * 
 * @author augsburs
 */
public class Plateau
{
	/**
	 * Nombre de cases par ligne
	 */
	private static final int NB_COLONNES = 24;

	/**
	 * Nombre de cases par colonne
	 */
	private static final int NB_LIGNES = 26;

	/**
	 * Tableau du plateau (Chaque case contient une pièce, un couloir ou une
	 * porte)
	 */
	private Case[][] cases;

	/**
	 * Initialisation d'un plateau de Cluedo
	 */
	public Plateau()
	{
		this.cases = new Case[this.NB_LIGNES][this.NB_COLONNES];
		
		// Initialisation de toutes les cases du plateau
		// Ligne 1
		this.cases[0][0] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][1] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][2] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][3] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][4] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][5] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][6] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][7] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][8] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][9] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][10] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][11] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][12] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][13] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][14] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][15] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][16] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][17] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][18] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][19] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][20] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][21] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][22] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[0][23] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 2
		this.cases[1][0] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][1] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][2] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][3] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][4] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][5] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][6] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][9] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][10] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][11] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][12] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][13] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][14] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][17] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][18] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][19] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][20] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][21] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][22] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[1][23] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 3
		this.cases[2][0] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][1] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][2] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][3] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][4] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][5] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][6] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][8] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][9] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][10] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][11] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][12] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][13] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][14] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][15] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][18] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][19] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][20] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][21] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][22] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[2][23] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 4
		this.cases[3][0] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][1] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][2] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][3] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][4] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][5] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][6] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][8] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][9] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][10] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][11] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][12] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][13] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][14] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][15] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][18] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][19] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][20] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][21] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][22] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[3][23] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 5
		this.cases[4][0] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][1] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][2] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][3] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][4] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][5] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][6] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][8] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][9] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][10] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][11] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][12] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][13] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][14] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][15] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][18] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][19] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][20] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][21] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][22] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[4][23] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 6
		this.cases[5][0] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][1] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][2] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][3] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][4] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][5] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][6] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][8] = new Case(Cloison.OUEST, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][9] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][10] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][11] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][12] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][13] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][14] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][15] = new Case(Cloison.EST, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][18] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][19] = new Case(Cloison.OUEST, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][20] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][21] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][22] = new Case(Piece.SALLE_DE_BAINS, Cloison, Cloison, Cloison, Cloison);
		this.cases[5][23] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 7
		this.cases[6][0] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][1] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][2] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][3] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][4] = new Case(Cloison.SUD, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][5] = new Case(Piece.CUISINE, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][6] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][8] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][9] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][10] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][11] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][12] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][13] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][14] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][15] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][18] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][19] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][20] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][21] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][22] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[6][23] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 8
		this.cases[7][0] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][1] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][2] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][3] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][4] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][5] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][6] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][8] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][9] = new Case(Cloison.SUD, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][10] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][11] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][12] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][13] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][14] = new Case(Cloison.SUD, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][15] = new Case(Piece.CHAMBRE, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][18] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][19] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][20] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][21] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][22] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[7][23] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 9
		this.cases[8][0] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][1] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][2] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][3] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][4] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][5] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][6] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][9] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][10] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][11] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][12] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][13] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][14] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][18] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][19] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][20] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][21] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][22] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[8][23] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 10
		this.cases[9][0] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][1] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][2] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][3] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][4] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][5] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][6] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][9] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][10] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][11] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][12] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][13] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][14] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][18] = new Case(Cloison.OUEST, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][19] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][20] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][21] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][22] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[9][23] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 11
		this.cases[10][0] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][1] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][2] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][3] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][4] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][5] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][6] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][9] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][10] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][11] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][12] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][13] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][14] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][18] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][19] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][20] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][21] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][22] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[10][23] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 12
		this.cases[11][0] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][1] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][2] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][3] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][4] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][5] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][6] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][7] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][9] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][10] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][11] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][12] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][13] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][14] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][18] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][19] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][20] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][21] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][22] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[11][23] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 13
		this.cases[12][0] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][1] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][2] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][3] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][4] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][5] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][6] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][7] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][9] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][10] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][11] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][12] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][13] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][14] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][18] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][19] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][20] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][21] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][22] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[12][23] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 14
		this.cases[13][0] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][1] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][2] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][3] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][4] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][5] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][6] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][7] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][9] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][10] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][11] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][12] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][13] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][14] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][18] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][19] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][20] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][21] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][22] = new Case(Cloison.SUD, Cloison, Cloison, Cloison, Cloison);
		this.cases[13][23] = new Case(Piece.SALLE_DE_JEUX, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 15
		this.cases[14][0] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][1] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][2] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][3] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][4] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][5] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][6] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][7] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][9] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][10] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][11] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][12] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][13] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][14] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][18] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][19] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][20] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][21] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][22] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[14][23] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 16
		this.cases[15][0] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][1] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][2] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][3] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][4] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][5] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][6] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][7] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][9] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][10] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][11] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][12] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][13] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][14] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][18] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][19] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][20] = new Case(Cloison.NORD, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][21] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][22] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[15][23] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 17
		this.cases[16][0] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][1] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][2] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][3] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][4] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][5] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][6] = new Case(Cloison.SUD, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][7] = new Case(Piece.SALLE_A_MANGER, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][9] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][10] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][11] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][12] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][13] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][14] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][17] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][18] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][19] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][20] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][21] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][22] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[16][23] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 18
		this.cases[17][0] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][1] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][2] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][3] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][4] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][5] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][6] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][9] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][10] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][11] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][12] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][13] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][14] = new Case(Piece.CLUEDO, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][17] = new Case(Cloison.OUEST, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][18] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][19] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][20] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][21] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][22] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[17][23] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 19
		this.cases[18][0] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][1] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][2] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][3] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][4] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][5] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][6] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][9] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][10] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][11] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][12] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][13] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][14] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][17] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][18] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][19] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][20] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][21] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][22] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[18][23] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 20
		this.cases[19][0] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][1] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][2] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][3] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][4] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][5] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][6] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][9] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][10] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][11] = new Case(Cloison.NORD, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][12] = new Case(Cloison.NORD, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][13] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][14] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][18] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][19] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][20] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][21] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][22] = new Case(Piece.BIBLIOTHEQUE, Cloison, Cloison, Cloison, Cloison);
		this.cases[19][23] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 21
		this.cases[20][0] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][1] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][2] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][3] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][4] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][5] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][6] = new Case(Cloison.NORD, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][9] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][10] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][11] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][12] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][13] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][14] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][18] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][19] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][20] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][21] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][22] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[20][23] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 22
		this.cases[21][0] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][1] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][2] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][3] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][4] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][5] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][6] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][9] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][10] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][11] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][12] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][13] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][14] = new Case(Cloison.EST, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][17] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][18] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][19] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][20] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][21] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][22] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[21][23] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 23
		this.cases[22][0] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][1] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][2] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][3] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][4] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][5] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][6] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][9] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][10] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][11] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][12] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][13] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][14] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][17] = new Case(Cloison.NORD, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][18] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][19] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][20] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][21] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][22] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[22][23] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 24
		this.cases[23][0] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][1] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][2] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][3] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][4] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][5] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][6] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][9] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][10] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][11] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][12] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][13] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][14] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][17] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][18] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][19] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][20] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][21] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][22] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[23][23] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 25
		this.cases[24][0] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][1] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][2] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][3] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][4] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][5] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][6] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][8] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][9] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][10] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][11] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][12] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][13] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][14] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][15] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][17] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][18] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][19] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][20] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][21] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][22] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[24][23] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		
		// Ligne 26
		this.cases[25][0] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][1] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][2] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][3] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][4] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][5] = new Case(Piece.SALON, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][6] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][7] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][8] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][9] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][10] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][11] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][12] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][13] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][14] = new Case(Piece.HALL, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][15] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][16] = new Case(Piece.COULOIR, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][17] = new Case(Piece.VIDE, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][18] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][19] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][20] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][21] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][22] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
		this.cases[25][23] = new Case(Piece.BUREAU, Cloison, Cloison, Cloison, Cloison);
	}
	
	/**
	 * Méthode affichant le plateau (en console pour le moment)
	 */
	public void afficherPlateau()
	{
		for(int ligne = 0; ligne < NB_LIGNES; ligne++)
		{
			for(int colonne = 0; colonne < NB_COLONNES; colonne++)
				System.out.println(cases[ligne][colonne]);
		}
	}
}