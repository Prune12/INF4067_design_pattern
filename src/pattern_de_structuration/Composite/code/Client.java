package pattern_de_structuration.Composite.code;

public class Client {
    public static void main(String[] args) {
        // Créer des fichiers
        Fichier fichier1 = new Fichier("Fichier1", "txt");
        Fichier fichier2 = new Fichier("Fichier2", "pdf");
        Fichier fichier3 = new Fichier("Fichier3", "txt");

        // Créer un dossier et y ajouter des fichiers
        Dossier dossier1 = new Dossier("Dossier1");
        dossier1.ajouter(fichier1);
        dossier1.ajouter(fichier2);

        // Créer un autre dossier et y ajouter le premier dossier et un fichier
        Dossier dossier2 = new Dossier("Dossier2");
        dossier2.ajouter(dossier1);
        dossier2.ajouter(fichier3);

        // Décrire le contenu du deuxième dossier
        dossier2.decrire();
    }
}

