package fr.iut.editeur.document;

/**
 * Classe simulant un document contenant du texte
 */
public class Document {
    /**
     * Texte du Document
     */
    private String texte;

    public Document() {
        this.texte = "";
    }

    /**
     * Renvoie le texte actuel
     * @return le texte actuel
     */
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Remplace le texte actuel de start à end par remplacement
     * @param start Position de début
     * @param end Position de fin
     * @param remplacement Texte qui sera mis à la place de l'actuel
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /**
     * Met en majuscule le texte de start à end en utilisant la méthode {@link #remplacer}
     * @param start Position de début
     * @param end Position de fin
     */
    public void majuscules(int start, int end) {
        remplacer(start, end, texte.substring(start, end).toUpperCase());
    }

    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }

    public void clear() {
        texte = "CPT";
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
