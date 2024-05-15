package Conception_des_classes;

import java.util.Date;

public class Membre extends Personne {

	private Date dateAdhesion;
	private String status;

	public Membre(String getnom, String getprénom, int getid) {
		super(getnom, getprénom, getid);
	}

	public void afficherDetails() {
		System.out.println(" nom : " + nom + " prénom : " + prénom + " id : " + id + "date d'adhesion : " + dateAdhesion
				+ "status : " + status);

	}

}
