import fr.iutvalence.java.tp.cluedo.Cluedo;


// TODO (fait) corriger le commentaire (c'est une application)
/**
 * Application qui lance une partie de Cluedo
 * @author augsburs
 */
public class LanceurCluedo
{
	// TODO (fait) corriger le commentaire
	/**
	 * @param args
	 * Méthode principale gérant une partie de Cluedo
	 */
	public static void main(String[] args)
	{
		System.out.println("Création de la partie !");
		//System.out.println("Veuillez saisir le nombre de joueurs:");
		//int nombreDeJoueurs = ...;
		Cluedo partieDeCluedo = new Cluedo(3);
		System.out.println("Démarrage de la partie, bonne chance... !");
		partieDeCluedo.jouer();
		System.out.println("La partie est déjà finie... Relancez vite une nouvelle partie !");
	}
}
