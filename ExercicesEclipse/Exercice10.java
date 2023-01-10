package projet1;

import java.util.Scanner;

public class Exercice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 10 : créer un tableau de 10 entiers et afficher la somme
		// Les éléments du tableau sont à saisir par l'utilisateur

		Scanner scan = new Scanner(System.in);

		// Je declare mes variables de type entier

		int tab[];
		int nb;
		int som = 0;

		/// affichage d'un message à l'écran demandant à l'utilisateur de taper un
		/// nombre.

		System.out.print("Veuillez saisir un nombre ");// nbre de case dans le tableau
		nb = scan.nextInt();

		tab = new int[10]; // Reserver nb cases dans le tableau

		for (int i = 0; i < tab.length; i++) {
			// Je demande les 10 entier à l'utilisateur
			System.out.print("Veuillez saisir un nombre ");

			tab[i] = scan.nextInt();// je stock ses reponses dans mon tableau

		}

		for (int i = 0; i < tab.length; i++) {

			som = som + tab[i];

		}

		System.out.println(" La somme  est " + som);

	}

}
