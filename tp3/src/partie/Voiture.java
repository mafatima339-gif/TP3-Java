package partie;

public class Voiture extends Vehicule {
	private int nbPortes;
	
	public Voiture(int nbPortes, String matricule,String marque) {
		super(matricule,marque);
		this.nbPortes = nbPortes;
		
	}
	@Override
	public void stationner() {
		System.out.println("la voiture se gare dans une place standard");
	}
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("Le nombre de portes:"+nbPortes);
	}
	

}
