package Conception_des_classes;

public abstract class Personne  {
	
	protected String nom, prénom; 
	protected int id;
	
	public Personne (String getnom, String getprénom, int getid) {
		
		 getnom = this.nom;
		 getprénom = this.prénom;
		 getid = this.id;
		
	}

	public abstract void afficherDetails();

}