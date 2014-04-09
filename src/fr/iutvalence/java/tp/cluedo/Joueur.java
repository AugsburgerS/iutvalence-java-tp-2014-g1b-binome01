package fr.iutvalence.java.tp.cluedo;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe gérant les caractéristiques d'un joueur
 * 
 * @author augsburs
 */
public class Joueur
{
	/**
	 * Attribut correspondant au prénom du joueur
	 */
	private final String prenom;

	/**
	 * Attribut correspondant au pion alloué au joueur
	 */ 
	private final Pion pion;
	
	/**
	 * Liste des cartes suspect que possède le joueur
	 */
	private List<Suspect> cartesSuspect = new LinkedList<Suspect>();

	/**
	 * Liste des cartes arme que possède le joueur
	 */
	private List<Arme> cartesArme = new LinkedList<Arme>();
	
	/**
	 * Liste des cartes lieu que possède le joueur
	 */
	private List<Lieu> cartesLieu = new LinkedList<Lieu>();

	/**
	 * Constructeur d'un joueur en fonction de son prénom et de son pion 
	 * @param prenom prénom du joueur
	 * @param pion pion attribué au joueur
	 */
	public Joueur(String prenom, Pion pion)
	{
		this.prenom = prenom;
		this.pion = pion;
	}
	
	/**
	 * Méthode d'ajout d'une carte suspect dans la main du joueur
	 * @param carteSuspect carte à ajouter
	 */
	public void ajouterCarte(Suspect carteSuspect)
	{
		this.cartesSuspect.add(carteSuspect);
	}
	
	/**
	 * Méthode d'ajout d'une carte arme dans la main du joueur
	 * @param carteArme carte à ajouter
	 */
	public void ajouterCarte(Arme carteArme)
	{
		this.cartesArme.add(carteArme);
	}
	
	/**
	 * Méthode d'ajout d'une carte lieu dans la main du joueur
	 * @param carteLieu carte à ajouter
	 */
	public void ajouterCarte(Lieu carteLieu)
	{
		this.cartesLieu.add(carteLieu);
	}

	/**
	 * Faire choisir dans la liste des lieux et renvoyer la position correspondante
	 * @return position correspondant au lieu choisi
	 */
	public Position demanderChoixDeplacementDouble()
	{
		// TODO Demander au joueur dans quelle pièce il veut aller car il a fait un double 1 ou 6
		return null;
	}

	/**
	 * Calcul des déplacements possibles suivant les dés tirés
	 * @param de1 résultat aléatoire du dé 1
	 * @param de2 résultat aléatoire du dé 2
	 * @return un tableau de tous les déplacements possibles
	 */
	public Position[] deplacementsPossibles(int de1, int de2)
	{
		/* TODO Renvoyer un tableau de positions possibles avec les deux dés donnés
		 * Un pion ne peut se déplacer que verticalement/horizontalement
		 * Ne peut sauter un autre pion
		 * Nb de cases <= somme des dés
		 */
		return null;
	}

	/**
	 * Demande au joueur où il veut aller parmi les déplacements possibles
	 * @param depPossJoueurCourant tableau des positions possibles
	 * @return position choisie par le joueur
	 */
	public Position demanderChoixDeplacement(Position[] depPossJoueurCourant)
	{
		// TODO Affiche toutes les cases possibles, le joueur choisi où il veut aller
		return null;
	}

	/**
	 * Déplacer le pion du joueur à une certaine position
	 * @param position position sur laquelle déplacer le pion
	 */
	public void deplacerPion(Position position)
	{
		this.pion.deplacerPion(position);
	}

	/**
	 * Demande au joueur de formuler son hypothèse
	 */
	public void formulerHypothese()
	{
		/* TODO Le joueur formule une hypothèse:
		 * 	- Le lieu dans lequel il est
		 * 	- une arme (à déplacer dans ce lieu)
		 * 	- un suspect (déplacer son pion dans ce lieu)
		 * 
		 * Ensuite il demande à chaque joueur si il a au moins UNE de ces cartes
		 * Si oui le joueur concerné lui montre une de ces cartes
		 * Le joueur coche dans son carnet les résultats de son hypothèse
		 */
	}

	/**
	 * Formulation d'une accusation par le joueur
	 * @param meurtrier meurtrier de la partie en cours
	 * @param armeMeurtrier arme utilisée pour la partie en cours
	 * @param lieuMeurtre lieu du meurtre de la partie en cours
	 * @return false si le meurtrier n'a pas été découvert, true sinon
	 */
	public boolean formulerAccusation(Suspect meurtrier, Arme armeMeurtrier, Lieu lieuMeurtre)
	{
		Suspect suspectAccusation = null;
		Arme armeAccusation = null;
		Lieu lieuAccusation = null;
		// TODO Demander une accusation au joueur (lieu, arme, suspect)
		
		if (suspectAccusation.equals(meurtrier) && armeAccusation.equals(armeMeurtrier) && lieuAccusation.equals(lieuMeurtre))
			return true;
		else
			return false;
	}
}