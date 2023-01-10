package projet1;
import java.util.Scanner;
public class Exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		//Exercice3 Ecrire un programme qui demande son prénom à l'utilisateur, et qui lui réponde par  « Bonjour » suivi du prénom.

		//affichage d'un message à l'écran demandant à l'utilisateur de taper un type string.
		 
		 System.out.println("Veuillez saisir votre nom : ");
		 String name = scan.next();
		 
		 System.out.println(" Bonjour "+ name); //Affichage dans la console 
		 scan.close();
		
		 
		
		

	}

}
