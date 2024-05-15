package Conception_des_classes;

public abstract class Personne  {
	
	protected String nom, prénom; 
	protected int id;
	
	public Personne (String setnom, String setprénom, int setid) {
		
		 this.nom = setnom;
		 this.prénom = setprénom;
		 this.id = setid;
		
	}
	
	public String getnom() {
		String name = this.nom;
		return name;
	}

	public String getprénom() {
		String firstname = this.prénom;
		return firstname;
	}
	
	public int getid() {
		int identifiant = this.id;
		return identifiant;
		
	}


	public abstract void afficherDetails();

}