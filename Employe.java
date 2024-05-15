package Conception_des_classes;

public class Employe extends Personne {

	private String poste;
	private double salaire;

	public Employe(String getnom, String getprénom, int getid) {
		super(getnom, getprénom, getid);

	}

	public String getposte() {
		String p = this.poste;
		return p;
	}

	public double getsalaire() {
		double s = this.salaire;
		return s;
	}

	public void afficherDetails() {
		System.out.println(
				" nom : " + nom + " prénom : " + prénom + " id : " + id + "poste : " + poste + "salaire : " + salaire);
	}

}
