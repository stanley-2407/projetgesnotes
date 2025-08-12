
package service;

import model.Etudiant;

public class CalculMoyenne {

    public double calculerMoyenne(Etudiant et) {
        if (et.getNotes() == null || et.getNotes().isEmpty())
            return 0.0;
        double somme = 0.0;
        for (Double note : et.getNotes()) {
            somme += note;
        }
        return somme / et.getNotes().size();
    }
}
