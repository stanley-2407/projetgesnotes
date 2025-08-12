
package persistence;

import model.Etudiant;
import java.io.*;
import java.util.*;

public class CSVEtudiantImporter implements IEtudiantImport {
    private final String cheminFichier;

    public CSVEtudiantImporter(String cheminFichier) {
        this.cheminFichier = cheminFichier;
    }

    @Override
    public List<Etudiant> lire() {
        List<Etudiant> etudiants = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichier))) {
            String ligne;

            ligne = br.readLine();

            while ((ligne = br.readLine()) != null) {
                ligne = ligne.trim();
                if (ligne.isEmpty())
                    continue;

                String[] parts = ligne.split(",");
                if (parts.length < 4) {
                    System.err.println("Ligne ignorée: abscence de variables : " + ligne);
                    continue;
                }

                String id = parts[0].trim();
                String nom = parts[1].trim();
                String prenom = parts[2].trim();
                List<Double> notes = new ArrayList<>();

                for (int i = 2; i < parts.length; i++) {
                    String val = parts[i].trim();
                    try {
                        notes.add(Double.parseDouble(val));
                    } catch (NumberFormatException e) {
                        System.err.println("Note invalide ignorée : " + val);
                    }
                }

                etudiants.add(new Etudiant(id, nom, prenom, notes));
            }
        } catch (IOException e) {
            System.err.println("Erreur lecture fichier : " + e.getMessage());
        }

        return etudiants;
    }
}
