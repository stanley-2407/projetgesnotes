# 🎓 Système de Gestion et Classement des Étudiants (Java)

Ce projet est une application console robuste permettant de gérer les notes des étudiants, de calculer leurs moyennes et d'exporter les résultats. Il met en application les principes fondamentaux de la **Programmation Orientée Objet (POO)**.

## 👥 Équipe de Développement
- **Willy Stanlin TAGUEDONG**
- **Thierry Pascal ZOKOU TCHOKONTHE**

## 🛠️ Architecture du Projet
Le programme repose sur une architecture modulaire composée de 6 classes et d'une interface, garantissant une séparation claire des responsabilités :

* **`GestionEtudiantsTest.java`** : Point d'entrée principal (Main) gérant le flux de travail et l'interface utilisateur.
* **`IEtudiantImporter` & `CSVEtudiantImporter`** : Gestion de la persistance des données. Utilisation d'une **interface** pour permettre une extension facile vers d'autres formats de fichiers (JSON, SQL).
* **`Etudiant.java`** : Modèle de données immuable représentant l'entité Étudiant.
* **`CalculMoyenne.java`** : Logique métier dédiée au calcul statistique (gestion des divisions par zéro et des notes invalides).
* **`Classement.java`** : Implémentation d'un **algorithme de tri par sélection** pour classer les étudiants par performance.
* **`CSVResultatExporter.java`** : Exportation des données formatées vers un fichier CSV externe.

## 🚀 Fonctionnalités Clés
- **Robustesse :** Nettoyage automatique des données (ignore les lignes vides, gestion des erreurs de saisie).
- **Immuabilité :** Sécurisation des données étudiants via des attributs finaux.
- **Interface Interactive :** Menu console simple permettant à l'utilisateur de choisir ses actions par numérotation.
- **Précision :** Exportation des moyennes formatées à deux décimales.

## 📖 Comment l'utiliser
1. Compilez le projet Java.
2. Lancez la classe `GestionEtudiantsTest`.
3. Suivez les instructions dans la console :
   - Charger le fichier CSV.
   - Calculer les moyennes.
   - Afficher le classement.
   - Exporter les résultats.
