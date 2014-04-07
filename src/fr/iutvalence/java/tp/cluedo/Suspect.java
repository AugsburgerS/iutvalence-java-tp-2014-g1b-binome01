package fr.iutvalence.java.tp.cluedo;

/**
 * Enumération des cartes suspects
 * @author augsburs
 */
public enum Suspect
{

    ROUGE("Mademoiselle Rose"),
    JAUNE("Colonel Moutarde"),
    BLANC("Madame Leblanc"),
    VERT("Docteur Olive"),
    BLEU("Madame Pervenche"),
    VIOLET("Professeur Violet");
    
    /**
     * Nom du suspect
     */
    private final String nom;
    
    /**
     * Constructeur d'un suspect avec son nom
     * @param nom nom du suspect
     */
    private Suspect(String nom)
    {
    	this.nom = nom;
    }
}