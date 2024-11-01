import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	
	/*Cette classe va remplacer la classe Scanner et améliorera les méthodes :

		next() --> saisirString()
		nextInt() --> saisirInt()
		nextFloat --> saisirFloat()
		nextDouble() --> saisirDouble()
		nextChar --> saisirCHar
	*/
	
	//instanciation du fichier de lecture du clavier
	
	private static BufferedReader entree = new BufferedReader (new InputStreamReader(System.in));
	//static : appel la méthode sans creer d'objets
	
	
	
	public static int SaisirInt () {
		String chaine ="";
		int nb = 0;
		
		boolean ok = false;
		do {

		
		
			try {
					//lecture de la chaine à partir du clavier
					chaine = entree.readLine();
					nb = Integer.parseInt(chaine);
					//parseInt : convertit chaine en entier
					ok = true;
				}
			
			catch (IOException exp) { //lever l'exception
				System.out.println ("Erreur de la lecture du clavier !");
				//exp.printStackTrace();
				ok = false;
			}
			
			catch(NumberFormatException exp) { //lever l'exception sur le format du nombre
				System.out.println("Erreur sur le format du nombre saisi !");
				ok = false;
			}
			
		}while (ok == false);
			
			
		return nb;
		
	}


	
	
	
	public static float SaisirFloat () {
		String chaine ="";
		float nb = 0;
		
		boolean ok = false;
		do {

		
		
			try {
					//lecture de la chaine à partir du clavier
					chaine = entree.readLine();
					nb = Float.parseFloat(chaine);
					//parseInt : convertit chaine en entier
					ok = true;
				}
			
			catch (IOException exp) { //lever l'exception
				System.out.println ("Erreur de la lecture du clavier !");
				//exp.printStackTrace();
				ok = false;
			}
			
			catch(NumberFormatException exp) { //lever l'exception sur le format du nombre
				System.out.println("Erreur sur le format du nombre saisi !");
				ok = false;
			}
			
		}while (ok == false);
			
			
		return nb;
	}
	
	
	
	public static double SaisirDouble () {
		String chaine ="";
		double nb = 0;
		
		boolean ok = false;
		do {

		
		
			try {
					//lecture de la chaine à partir du clavier
					chaine = entree.readLine();
					nb = Double.parseDouble(chaine);
					//parseInt : convertit chaine en entier
					ok = true;
				}
			
			catch (IOException exp) { //lever l'exception
				System.out.println ("Erreur de la lecture du clavier !");
				//exp.printStackTrace();
				ok = false;
			}
			
			catch(NumberFormatException exp) { //lever l'exception sur le format du nombre
				System.out.println("Erreur sur le format du nombre saisi !");
				ok = false;
			}
			
		}while (ok == false);
			
			
		return nb;	
	}
	
	public static String SaisirString () {
		String chaine = "";
		try {
			chaine = entree.readLine();
		}
		catch (IOException exp) {
			System.out.println("Erreur de lecture sur le clavier !");
		}
		return chaine;
	}

	
	
	public static char SaisirChar () {
		String chaine = "";
		try {
			chaine = entree.readLine();
		}
		catch (IOException exp) {
			System.out.println("Erreur de lecture sur le clavier !");
		}
		return chaine.charAt(0); // on retourne le premier caractère
	}
	}
