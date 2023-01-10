package projet1;
import java.util.Scanner;
public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*Exercice4:
		//Ecrire un programme java qui lit le prix HT d'un article, 
		//le nombre d'articles et le taux de TVA, et qui fournit le prix total TTC correspondant. 

		
		//affichage d'un message à l'écran demandant à l'utilisateur de taper un nombre
		Scanner scan=new Scanner(System.in);
		System.out.print("Veuillez saisir le prix hors taxe de l'artcile ");
		int prixHt = scan.nextInt();
		System.out.print("Veuillez saisir le nombre d'articles ");
		int nbArticle = scan.nextInt();
		System.out.print("Veuillez saisir le taux de tva ");
		float tauxTva = scan.nextFloat();
		
		float totalTtc = (prixHt* nbArticle)*(1+(tauxTva/100));
		//Affichage dans la console 
		 scan.close();
		
		System.out.println(" Pour un prix HT de "+ prixHt +  " pour "+ nbArticle + " article(s) et pour un taux de "+ tauxTva+ "Le prix TTC est de "+ totalTtc); 
		
	}

}
