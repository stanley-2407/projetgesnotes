Projet 1: Gestion de notes des étudiants.

Ce projet a été réalisé par : 
•	Willy Stanlin TAGUEDONG
•	Thierry Pascal ZOKOU TCHOKONTHE

pour faire tourner notre programme, nous avons implémenté au total six classe et une interface.

GestionEtudiantsTest.java : C'est le point d'entrée principal. Il initialise les différents services, puis exécute le flux de travail complet : lecture des données, classement des étudiants, et exportation des résultats en fonction des choix de l'utilisateur.
  
IEtudiantImporter.java et CSVEtudiantImporter.java : Ces classes gèrent la persistance des données. L'interface IEtudiantImporter définit le contrat de lecture, tandis que la classe CSVEtudiantImporter implémente ce contrat pour lire les données d'étudiants à partir d'un fichier CSV. Elle est robuste, car elle ignore les lignes vides et gère les notes invalides.

Etudiant.java : C'est le modèle de données qui représente un étudiant. Il stocke l'identifiant, le nom, le prénom et une liste de notes. Les attributs sont finaux, ce qui rend les objets étudiants immuables une fois créés.

CalculMoyenne.java : Cette classe est responsable de la logique de calcul de la moyenne d'un étudiant. Il gère le cas où un étudiant n'aurait aucune note pour éviter une division par zéro.

Classement.java : Ce service s'occupe de trier la liste des étudiants en fonction de leur moyenne. Il utilise un algorithme de tri par sélection et a une méthode afficherClassement pour imprimer les résultats triés dans la console.

CSVResultatExporter.java : Ce service exporte les résultats dans un nouveau fichier CSV. Le fichier de sortie contient l'ID de l'étudiant, son nom, son prénom et sa moyenne calculée, formatée à deux décimales.

Le fonctionnement est très simple : après le lancement de la classe contenant le main qui est la classe GestionEtudiantTest, une liste d’instructions apparait et demande à l’utilisateur action qu’il souhaite réaliser. Il lui suffit juste d’entrer le numéro correspondant à l’instruction pour l’exécuter. 
