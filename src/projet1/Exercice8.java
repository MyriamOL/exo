package projet1;

import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 8 : Ecrire un programme java qui demande successivement X nombres à
		// l’utilisateur,
		// et qui lui dise ensuite quel était le plus grand parmi ces X nombres
		// (X étant choisi par l'utilisateur)

		Scanner scan = new Scanner(System.in);
		// affichage d'un message à l'écran demandant à l'utilisateur de taper un nombre

		int tab[]; // declaration
		int nb;
		int max = 0;
		int indexMax = 0;

		System.out.print("Veuillez saisir un nombre ");// nbre de case dans le tableau
		nb = scan.nextInt();

		tab = new int[nb]; // Reserver nb cases dans le tableau

		for (int i = 0; i < nb; i++) {

			System.out.print("Veuillez saisir un nombre ");// redemande a l'utilisateur
			tab[i] = scan.nextInt();// je le stock dans le tableau

		}
		// dans mon tableau de valeurs données par l'utilisateur
		for (int i = 0; i > nb; i++) {
			max = tab[i];
			indexMax = 1;

			if (tab[i] > max) {
				max = tab[i];
				indexMax = i;

			}
			

		}

	}

}
