
package main;

import model.Etudiant;
import service.CalculMoyenne;
import service.Classement;
import persistence.*;

import java.util.List;
import java.util.Scanner;

public class GestionEtudiantsTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IEtudiantImport repo = new CSVEtudiantImporter(
                "C:\\Users\\USER\\Documents\\Science de Donnees Appliques\\Etape 2\\Programation avancée\\UA3\\Projet 3\\gestion-etudiantsFinal\\gestion-etudiants\\notes_etudiants_v2.csv");
        CalculMoyenne moyenne = new CalculMoyenne();
        Classement classement = new Classement(moyenne);
        CSVResultatExporter exporter = new CSVResultatExporter(moyenne);
        List<Etudiant> etudiants = null; // La liste d'étudiants sera chargée à l'étape 1

        while (true) {
            System.out.println("\n--- Menu de gestion des étudiants ---");
            System.out.println("1. Lire les données depuis le fichier CSV");
            System.out.println("2. Calculer les moyennes et afficher le classement");
            System.out.println("3. Exporter les résultats dans un nouveau fichier CSV");
            System.out.println("4. Quitter");
            System.out.print("Veuillez choisir une option : ");

            String choix = scanner.nextLine();

            switch (choix) {
                case "1":

                    etudiants = repo.lire();
                    System.out.println("Données lues avec succès. " + etudiants.size() + " étudiants chargés.");
                    break;
                case "2":
                    if (etudiants != null && !etudiants.isEmpty()) {
                        classement.afficherClassement(etudiants);
                    } else {
                        System.out.println("Veuillez d'abord lire les données (Option 1).");
                    }
                    break;
                case "3":
                    if (etudiants != null && !etudiants.isEmpty()) {
                        exporter.exporter(
                                "C:\\Users\\USER\\Documents\\Science de Donnees Appliques\\Etape 2\\Programation avancée\\UA3\\Projet 3\\gestion-etudiantsFinal\\gestion-etudiants\\resultats.csv",
                                etudiants);
                        System.out.println("Résultats exportés avec succès.");
                    } else {
                        System.out.println("Veuillez d'abord lire les données (Option 1).");
                    }
                    break;
                case "4":
                    System.out.println("Fin du programme.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }
}
