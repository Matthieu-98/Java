package Conception_des_classes;

public class Livre {
	String titre, isbn, auteur;
	boolean disponible;

	public Livre(String settitre, String setauteur, String setisbn, boolean setdispo) {

		this.disponible = true;
		this.titre = settitre;
		this.auteur = setauteur;
		this.isbn = setisbn;

	}

	public void afficherDetails() {
		System.out.println("titre : " + this.titre + "auteur : " + this.auteur + "isbn : " + this.isbn
				+ "disponible ? : " + this.disponible + " ");
	}
}
