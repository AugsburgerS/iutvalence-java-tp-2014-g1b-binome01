package fr.iutvalence.java.tp.cluedo;

/**
 * Définition du plateau de jeu
 * @author augsburs
 */
public class Plateau
{
	/**
	 * Initialisation du plateau
	 */
	public Plateau()
	{
		Piece cuisine = new Piece("Cuisine");
		Piece terrasse = new Piece("Terrasse");
		Piece spa = new Piece("Spa");
		Piece salleAManger = new Piece("Salle à Manger");
		Piece piscine = new Piece("Piscine");
		Piece cinema = new Piece("Cinéma");
		Piece salon = new Piece("Salon");
		Piece pavillonDesInvites = new Piece("Pavillon des invités");
		Piece hall = new Piece("Hall");
		Piece observatoire = new Piece("Observatoire");
	}
}