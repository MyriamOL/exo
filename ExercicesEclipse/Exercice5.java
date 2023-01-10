package projet1;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// *Exercice 5 : On désire écrire un programme qui, à partir d'un chiffre entré
		// au clavier,
		// permet d’afficher le jour correspondant à un chiffre allant de 1 à 7.

		Scanner scan = new Scanner(System.in);
		// affichage d'un message à l'écran demandant à l'utilisateur de taper un nombre
		System.out.print("Veuillez saisir un nombre  entre 1 et 7 : ");
		int nb = scan.nextInt();

		if (nb == 1) {

			System.out.println("Lundi");
		} else if (nb == 2) {

			System.out.println("Mardi");
		} else if (nb == 3) {

			System.out.println("Mercredi");
		} else if (nb == 4) {

			System.out.println("Jeudi");
		} else if (nb == 5) {

			System.out.println("Vendredi");
		} else if (nb == 6) {

			System.out.println("Samedi");
		} else {

			System.out.println("Mardi");
		}

		scan.close();

	}

}
