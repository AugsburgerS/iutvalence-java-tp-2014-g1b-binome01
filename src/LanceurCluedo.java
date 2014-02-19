import fr.iutvalence.java.tp.cluedo.Cluedo;

/**
 * Classe principale du jeu Cluedo
 * @author augsburs
 */
public class LanceurCluedo
{
	/**
	 * @param args
	 * Méthode principale
	 */
	public static void main(String[] args)
	{
		System.out.println("Création de la partie !");
		//System.out.println("Veuillez saisir le nombre de joueurs:");
		//int nombreDeJoueurs = ...;
		Cluedo partieDeCluedo = new Cluedo(3);
		System.out.println("Démarrage de la partie, bonne chance...Noob !");
		partieDeCluedo.jouer();
		System.out.println("La partie est déjà finie... Relancez vite une nouvelle partie !");
	}
}
