package projet1;
import java.util.Scanner;
public class Exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Exercice 1:écrire un programme java permettant de demander à l'utilisateur de saisir deux entiers a et b et les afficher sur la console.
		//échanger les valeurs de a et b.
		 Scanner scan=new Scanner(System.in);
		 
		//affichage d'un message à l'écran demandant à l'utilisateur de taper un nombre.
		 
		System.out.print("Veuillez saisir un entier ");
		int a = scan.nextInt();
		
		System.out.print("Veuillez saisir un deuxieme entier ");
		int b = scan.nextInt();
		scan.close();
	
		int c;
		
		c=a;
		a=b;
		b=c;
		
	 System.out.println(a+ " est echangé avec  "+ b);
		


	}

}
