package fr.iutvalence.java.tp.cluedo;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe permettant de manipuler les différentes pièces et couloirs du jeu
 * @author augsburs
 */
public enum Lieu
{

	/**
	 * La pièce cuisine
	 */
	CUISINE(),

	/**
	 * La pièce chambre
	 */
	CHAMBRE(),

	/**
	 * La pièce salle de bains
	 */
	SALLE_DE_BAINS(),

	/**
	 * La pièce salle à manger
	 */
	SALLE_A_MANGER(),

	/**
	 * La pièce salle de jeux
	 */
	SALLE_DE_JEUX(),

	/**
	 * La pièce bibliothèque
	 */
	BIBLIOTHEQUE(),

	/**
	 * La pièce bureau
	 */
	BUREAU(),

	/**
	 * La pièce hall
	 */
	HALL(),

	/**
	 * La pièce salon
	 */
	SALON(),

	/**
	 * La pièce cluedo
	 */
	CLUEDO,

	/**
	 * Le type porte
	 */
	PORTE,

	/**
	 * La case couloir
	 */
	COULOIR,

	/**
	 * La case vide
	 */
	VIDE;
	
	//TODO Initialiser les collections des pièces avec leurs positions
	private List<Position> positionsSalon = new LinkedList<Position>();
	private List<Position> positionsHall = new LinkedList<Position>();
	private List<Position> positionsBureau = new LinkedList<Position>();
	private List<Position> positionsBibliotheque = new LinkedList<Position>();
	private List<Position> positionsSalleDeJeux = new LinkedList<Position>();
	private List<Position> positionsSalleAManger = new LinkedList<Position>();
	private List<Position> positionsSalleDeBains = new LinkedList<Position>();
	private List<Position> positionsChambre = new LinkedList<Position>();
	private List<Position> positionsCuisine = new LinkedList<Position>();
	
	
	/**
	 * Collection des positions de la pièce
	 */
	private List<Position> positionsDuLieu = new LinkedList<Position>();

	/**
	 * Constructeur de lieu sans nécessité de connaitre ses positions
	 */
	private Lieu()
	{
		this.positionsDuLieu = null;
	}

	/**
	 * Constructeur de lieu
	 * @param positionsDuLieu Collection des positions de la pièce
	 */
	private Lieu(List<Position> positionsDuLieu)
	{
		this.positionsDuLieu = positionsDuLieu;
	}
	
	/**
	 * Accesseur en lecture sur les positions d'un lieu
	 * @return la collection des positions du lieu
	 */
	public List<Position> positionsDuLieu()
	{
		return this.positionsDuLieu;
	}
	
}