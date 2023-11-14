package fr.iut.editeur.document;

import junit.framework.TestCase;

public class DocumentTest extends TestCase {
    public void testAjouter() {
        Document document = new Document();
        String texte = "Test 12345";
        document.ajouter(texte);
        assertEquals(document.getTexte(), texte);
    }

    public void testRemplacer() {
        Document document = new Document();
        document.ajouter("Test 12345");
        String remplacement = "s numéros ";
        String res = "Tests numéros 12345";
        document.remplacer(4, 5, remplacement);
        assertEquals(document.getTexte(), res);
    }

    public void testClear() {
        Document document = new Document();
        document.ajouter("Test 12345");
        document.clear();
        assertEquals(document.getTexte(), "");
    }
}
