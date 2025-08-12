
package model;

import java.util.List;

public class Etudiant {
    private final String id;
    private final String nom;
    private final String prenom;
    private final List<Double> notes;

    public Etudiant(String id, String nom, String prenom, List<Double> notes) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.notes = notes;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public List<Double> getNotes() {
        return notes;
    }
}
