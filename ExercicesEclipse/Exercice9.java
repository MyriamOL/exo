package projet1;
import java.util.Scanner;
public class Exercice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Ecrire un algorithme qui demande l’âge d’un enfant à l’utilisateur. Ensuite, il l’informe de sa 
		//catégorie : • "Poussin" de 6 à 7 ans • "Pupille" de 8 à 9 ans • "Minime" de 10 à 11 ans • "Cadet" après 12 ans 

		
		
		Scanner scan=new Scanner(System.in);
		
		
		
		int age;
		int i;
		
		
		
		//affichage d'un message à l'écran demandant à l'utilisateur de taper l'âge
		System.out.print("Veuillez saisir votre age ");
		age=scan.nextInt();
		
		 if(age>= 12 && age<18)
	        {
	            System.out.println("Vous etes dans la catégorie Cadet");  
	        }
		 else if (age==10 || age==11) {
			 System.out.println("Vous etes dans la catégorie Minime");  
			 
		 }
		 else if (age==8 || age==9) {
			 System.out.println("Vous etes dans la catégorie Pupille");  
			 
		 }
	 
	 else if (age==6 || age==7) {
		 System.out.println("Vous etes dans la catégorie Poussin");  
		 
	 }
	 else  {
			
			System.out.println("Vous n'êtes plus un enfant ! ");
		}
		
	}

}
