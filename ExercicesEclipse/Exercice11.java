package projet1;
import java.util.Scanner;
public class Exercice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//Exercice 11 : Afficher le minimum, le maximum et la moyenne des éléments du tableau
		
		
		
		//je declare mes variables 
		int tab[];
		int nb;
		int som = 0;
		int min = 0;
		int moy = 0;
		int max = 0; 

		Scanner scan = new Scanner(System.in);
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
					
					if (tab[i])< max)
					max = tab[i];
					if (tab[i])> min)
					min = tab[i];


				}

				System.out.println("\nValeur minimal est " + min);
				System.out.println("\nValeur maximal est " + max);


	}

}
