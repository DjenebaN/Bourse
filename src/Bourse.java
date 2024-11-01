import java.util.Scanner;

public class Bourse {
	private int numero ;
	private String nom, prenom ;
	private float solde ;
	private int nbTitres ;
	private float valeurTitre ;
	
	public Bourse() {
		this.numero =0;
		this.nom ="";
		this.prenom = "";
		this.solde = 0;
		this.nbTitres = 0;
		this.valeurTitre = 0;
			
	}
	
	public void saisir() {
		System.out.println("Donner le numéro du compte : ");
		this.numero = Console.SaisirInt();
		System.out.println("Donner le nom de la personne : ");
		this.nom = Console.SaisirString();
		System.out.println("Donner le prenom de la personne : ");
		this.prenom = Console.SaisirString();
		System.out.println("Donner le solde de la personne : ");
		this.solde = Console.SaisirFloat();
		System.out.println("Donner le nombre de titres : ");
		this.nbTitres = Console.SaisirInt();
		System.out.println("Donner la valeur des titres : ");
		this.valeurTitre = Console.SaisirFloat();
	}
	
	public void afficher() {
		System.out.println("______INFO DU COMPTE BOURSE______");
		System.out.println("Numéro compte : " + this.numero);
		System.out.println("Propriétaire : " + this.prenom + this.nom);
		System.out.println("Solde du compte : " + this.solde);
		System.out.println("Le nombre de titres est : " + this.nbTitres);
		System.out.println("Nb Titres : " + this.nbTitres + " ; Valaeur : " + this.valeurTitre);
	}
	
	public void acheter() {
		int nb;
		System.out.println("Donner le nombre de titres à acheter ");
		nb = Console.SaisirInt();
		if (this.solde < nb * this.valeurTitre) {
			System.out.println("Solde insuffisant");
		}else {
			this.solde = this.solde - nb * this.valeurTitre;
			this.nbTitres = this.nbTitres + nb ;
			System.out.println("\nOperation réussite, New solde : " + this.solde);
			System.out.println("New nb titres : " + this.nbTitres);
		}

	}
	
	public void vendre() {
		int nb;
		System.out.println("Donner le nombre de titres à vendre : ");
		nb = Console.SaisirInt();
		if (nb > this.nbTitres) {
			System.out.println("Solde insuffisant");
		}else {
			this.solde = this.solde + nb * this.valeurTitre;
			this.nbTitres = this.nbTitres - nb ;
			System.out.println("\nOperation réussite, New solde : " + this.solde);
			System.out.println("NEw nb titres : " + this.nbTitres);
		}

	}
	
	public void deposer() {
		float nb;
		System.out.println("Donner la somme à déposer : ");
		nb = Console.SaisirFloat();
		this.solde = this.solde + nb ;
		System.out.println("\nOperation réussite, New solde : " + this.solde);
	}
	
	public void retirer() {
		int nb;
		System.out.println("Donner la somme à retirer : ");
		nb = Console.SaisirInt();
		this.solde = this.solde - nb ;
		if (this.solde< nb) {
			System.out.println("Solde insuffisant");
		}else {
			this.solde = this.solde+nb;
		}
		System.out.println("\nOperation réussite, New solde : " + this.solde);
	}
	
	public void Bourse() {
		
	}
	
	public void Menu() {
		Scanner sc = new Scanner (System.in);
		int choix = 0;
		do {
			System.out.println("______GESTION DU COMPTE______");
			System.out.println("1 - Saisir les infos");
			System.out.println("2 - Afficher les infos");
			System.out.println("3 - Acheter");
			System.out.println("4 - Vendre");
			System.out.println("5 - Déposer");
			System.out.println("6 - Retirer");
			System.out.println("Votre choix");
			
			choix = Console.SaisirInt();
			switch (choix) {
			case 1 : this.saisir();break;
			case 2 : this.afficher();break;
			case 3 : this.acheter();break;
			case 4 : this.vendre();break;
			case 5 : this.deposer();break;
			case 6 : this.retirer();break;
			}
		}while (choix !=0);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public int getNbTitres() {
		return nbTitres;
	}

	public void setNbTitres(int nbTitres) {
		this.nbTitres = nbTitres;
	}

	public float getValeurTitre() {
		return valeurTitre;
	}

	public void setValeurTitre(float valeurTitre) {
		this.valeurTitre = valeurTitre;
	}
	
	//getters and setters
	

}
