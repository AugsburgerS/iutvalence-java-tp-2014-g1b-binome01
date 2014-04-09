package fr.iutvalence.java.tp.cluedo;

/**
 * Enumération des différents pions à la disponibilité des joueurs
 * @author augsburs
 */
public enum Pion
{
	/**
	 * La liste des pions disponibles
	 */
	ROUGE(Lieu.CHAMBRE),
	JAUNE(Lieu.HALL),
	BLANC(Lieu.SALLE_DE_BAINS),
	VERT(Lieu.BUREAU),
	BLEU(Lieu.CUISINE),
	VIOLET(Lieu.BIBLIOTHEQUE);
	
	/**
	 * Lieu du pion au début de la partie
	 */
	private final Lieu lieuInitialPion;
	
	/**
	 * Position du pion sur le plateau
	 */
	private Position position;
	
	/**
	 * Constructeur d'un pion avec son lieu initial sur le plateau
	 * @param lieuInitialPion lieu du pion au début de la partie
	 */
	private Pion(Lieu lieuInitialPion)
	{
		this.lieuInitialPion = lieuInitialPion;
	}
	
	/**
	 * Déplacer un pion à une certaine position
	 * @param position où va aller le pion
	 */
	public void deplacerPion(Position position)
	{
		this.position = position;
	}
}
