
package persistence;

import model.Etudiant;
import service.CalculMoyenne;
import java.io.*;
import java.util.List;

public class CSVResultatExporter {
    private final CalculMoyenne moyenne;

    public CSVResultatExporter(CalculMoyenne moyenne) {
        this.moyenne = moyenne;
    }

    public void exporter(String chemin, List<Etudiant> etudiants) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(chemin))) {
            pw.println("ID,Nom,prenom,Moyenne");
            for (Etudiant e : etudiants) {
                double Moyenne = moyenne.calculerMoyenne(e);
                pw.printf("%s,%s,%.2f%n", e.getId(), e.getNom(), e.getPrenom(), Moyenne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
