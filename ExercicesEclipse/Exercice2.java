package projet1;
import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		// Exercice 2 Ecrire un programme java qui demande un nombre à l'utilisateur, 
		//puis qui calcule et  affiche le carré de ce nombre.

		
		
		//affichage d'un message à l'écran demandant à l'utilisateur de taper un nombre
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Veuillez saisir un entier ");
		
		// Affecter une valeur aux variable de type int 
		int a = scan.nextInt();
		int b = a*a; // calcul de la racine carré 
		 System.out.println(" le carre de "+a+" est "+ b); //Affichage dans la console 
		 scan.close();
		
		
		
		
		
		
		
		
		
		
	}

}
