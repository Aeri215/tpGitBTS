import java.util.Scanner;

public class Calculatormain {

	public static boolean test(String chaine1, String chaine2)
	{
		return chaine1.toLowerCase().equals(chaine2);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Que voulez-vous faire ?");

		System.out.println("- Addition");
		System.out.println("- Soustraction");
		System.out.println("- Division");
		System.out.println("- Multiplication");
		System.out.println("Quitter");
		
		
		String reponse;
		boolean verrou = true;
		
		
		
		while(verrou) {
			Scanner input = new Scanner(System.in);
			reponse = input.nextLine();

			if(test(reponse, "addition")) {
				
				System.out.println("J'execute l'addition");
				verrou = false;
			}
			
			if(test(reponse, "soustraction")) {
				System.out.println("J'execute la soustraction");
				verrou = false;
			}
			
			if(test(reponse, "multiplication")) {
				System.out.println("test reussi");
				verrou = false;
			}

			if(test(reponse, "division")) {
				System.out.println("test reussi");
				verrou = false;
			}
			
			if(test(reponse, "quitter")) {
				System.out.println("Au revoir :)");
				verrou = false;
			}
			
			if(verrou) {
				System.out.println("Aucune option n'existe pour ce que vous demandez.");
			}
		}
	}
	
	

}
