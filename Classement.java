
package service;

import model.Etudiant;
import java.util.Comparator;
import java.util.List;

public class Classement {
    private final CalculMoyenne moyenne;

    public Classement(CalculMoyenne moyenne) {
        this.moyenne = moyenne;
    }

    public void trier(List<Etudiant> etudiants) {
        int n = etudiants.size();
        for (int i = 0; i < n - 1; i++) {
            int indexMax = i;
            for (int j = i + 1; j < n; j++) {
                if (moyenne.calculerMoyenne(etudiants.get(j)) > moyenne.calculerMoyenne(etudiants.get(indexMax))) {
                    indexMax = j;
                }
            }
            if (indexMax != i) {
                Etudiant temp = etudiants.get(i);
                etudiants.set(i, etudiants.get(indexMax));
                etudiants.set(indexMax, temp);
            }
        }
    }

    public void afficherClassement(List<Etudiant> etudiants) {
        trier(etudiants);
        int rang = 1;
        for (Etudiant e : etudiants) {
            System.out.printf("%d. %s - Moyenne : %.2f%n",
                    rang++, e.getNom(), moyenne.calculerMoyenne(e));
        }
    }
}
