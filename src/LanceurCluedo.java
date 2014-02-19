
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
		Cluedo partieDeCluedo = new Cluedo();
		System.out.println("Démarrage de la partie !");
		partieDeCluedo.jouer();
		System.out.println("La partie est déjà finie... Relancez vite une nouvelle partie !");
	}
}
