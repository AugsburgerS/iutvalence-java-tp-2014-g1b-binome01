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
	 * 
	 * @param prenom
	 *            prénom du joueur
	 * @param pion
	 *            pion attribué au joueur
	 */
	public Joueur(String prenom, Pion pion)
	{
		this.prenom = prenom;
		this.pion = pion;
	}

	/**
	 * Méthode d'ajout d'une carte suspect dans la main du joueur
	 * 
	 * @param carteSuspect
	 *            carte à ajouter
	 */
	public void ajouterCarte(Suspect carteSuspect)
	{
		this.cartesSuspect.add(carteSuspect);
	}

	/**
	 * Méthode d'ajout d'une carte arme dans la main du joueur
	 * 
	 * @param carteArme
	 *            carte à ajouter
	 */
	public void ajouterCarte(Arme carteArme)
	{
		this.cartesArme.add(carteArme);
	}

	/**
	 * Méthode d'ajout d'une carte lieu dans la main du joueur
	 * 
	 * @param carteLieu
	 *            carte à ajouter
	 */
	public void ajouterCarte(Lieu carteLieu)
	{
		this.cartesLieu.add(carteLieu);
	}

	/**
	 * Faire choisir dans la liste des lieux et renvoyer la position
	 * correspondante
	 * 
	 * @return position correspondant au lieu choisi
	 */
	public Position demanderChoixDeplacementDouble()
	{
		// TODO Demander au joueur dans quelle pièce il veut aller car il a fait
		// un double 1 ou 6
		return null;
	}

	/**
	 * Calcul des déplacements possibles suivant les dés tirés
	 * 
	 * @param plateau
	 *            plateau de la partie en cours
	 * @param depMax
	 *            déplacement maximal en nombre de cases
	 * @return un tableau de tous les déplacements possibles
	 */
	public List<Position> deplacementsPossibles(Plateau plateau, int depMax)
	{
		List<Position> positionsPossibles = new LinkedList<Position>();
		int ligneJoueur = this.pion.demanderPosition().ligne;
		int colonneJoueur = this.pion.demanderPosition().colonne;
		Case[][] cases = plateau.demanderCasesPlateau();

		/* Deplacements possibles à l'ouest */
		for (int ligne = ligneJoueur; ligne > 0; ligne--)
		{
			Cloison[] cloisonsCaseCour = cases[ligne - 1][colonneJoueur].obtenirCloisons();
			boolean positionPrise = false;
			if (cloisonsCaseCour[3] == Cloison.OUVERT || cloisonsCaseCour[3] == Cloison.PORTE)
			{
				for (Pion pion : Pion.values())
					if (pion.demanderPosition().ligne == ligne - 1)
						positionPrise = true;
				if (positionPrise == false)
					positionsPossibles.add(new Position(ligne-1, colonneJoueur));
			}
			if (positionPrise == true)
				break;
		}

		/* Deplacements possibles au nord */
		for (int colonne = colonneJoueur; colonne > 0; colonne--)
		{
			Cloison[] cloisonsCaseCour = cases[ligneJoueur][colonne-1].obtenirCloisons();
			boolean positionPrise = false;
			if (cloisonsCaseCour[0] == Cloison.OUVERT || cloisonsCaseCour[0] == Cloison.PORTE)
			{
				for (Pion pion : Pion.values())
					if (pion.demanderPosition().colonne == colonne - 1)
						positionPrise = true;
				if (positionPrise == false)
					positionsPossibles.add(new Position(ligneJoueur, colonne-1));
			}
			if (positionPrise == true)
				break;
		}

		/* Deplacements possibles à l'est */
		for (int ligne = ligneJoueur; ligne < Plateau.NB_LIGNES; ligne++)
		{
			Cloison[] cloisonsCaseCour = cases[ligne + 1][colonneJoueur].obtenirCloisons();
			boolean positionPrise = false;
			if (cloisonsCaseCour[1] == Cloison.OUVERT || cloisonsCaseCour[1] == Cloison.PORTE)
			{
				for (Pion pion : Pion.values())
					if (pion.demanderPosition().ligne == ligne + 1)
						positionPrise = true;
				if (positionPrise == false)
					positionsPossibles.add(new Position(ligne+1, colonneJoueur));
			}
			if (positionPrise == true)
				break;
		}

		/* Deplacements possibles au sud */
		for (int colonne = colonneJoueur; colonne < Plateau.NB_COLONNES; colonne++)
		{
			Cloison[] cloisonsCaseCour = cases[ligneJoueur][colonne+1].obtenirCloisons();
			boolean positionPrise = false;
			if (cloisonsCaseCour[2] == Cloison.OUVERT || cloisonsCaseCour[2] == Cloison.PORTE)
			{
				for (Pion pion : Pion.values())
					if (pion.demanderPosition().colonne == colonne + 1)
						positionPrise = true;
				if (positionPrise == false)
					positionsPossibles.add(new Position(ligneJoueur, colonne+1));
			}
			if (positionPrise == true)
				break;
		}
		
		return positionsPossibles;
	}

	/**
	 * Demande au joueur où il veut aller parmi les déplacements possibles
	 * 
	 * @param depPossJoueurCourant
	 *            tableau des positions possibles
	 * @return position choisie par le joueur
	 */
	public Position demanderChoixDeplacement(List<Position> depPossJoueurCourant)
	{
		// TODO Affiche toutes les cases possibles, le joueur choisi où il veut
		// aller
		return null;
	}

	/**
	 * Déplacer le pion du joueur à une certaine position
	 * 
	 * @param position
	 *            position sur laquelle déplacer le pion
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
		/*
		 * TODO Le joueur formule une hypothèse: - Le lieu dans lequel il est -
		 * une arme (à déplacer dans ce lieu) - un suspect (déplacer son pion
		 * dans ce lieu)
		 * 
		 * Ensuite il demande à chaque joueur si il a au moins UNE de ces cartes
		 * Si oui le joueur concerné lui montre une de ces cartes Le joueur
		 * coche dans son carnet les résultats de son hypothèse
		 */
	}

	/**
	 * Formulation d'une accusation par le joueur
	 * 
	 * @param meurtrier
	 *            meurtrier de la partie en cours
	 * @param armeMeurtrier
	 *            arme utilisée pour la partie en cours
	 * @param lieuMeurtre
	 *            lieu du meurtre de la partie en cours
	 * @return false si le meurtrier n'a pas été découvert, true sinon
	 */
	public boolean formulerAccusation(Suspect meurtrier, Arme armeMeurtrier, Lieu lieuMeurtre)
	{
		Suspect suspectAccusation = null;
		Arme armeAccusation = null;
		Lieu lieuAccusation = null;
		// TODO Demander une accusation au joueur (lieu, arme, suspect)

		if (suspectAccusation.equals(meurtrier) && armeAccusation.equals(armeMeurtrier)
				&& lieuAccusation.equals(lieuMeurtre))
			return true;
		else
			return false;
	}
}