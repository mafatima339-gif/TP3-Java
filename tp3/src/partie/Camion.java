package partie;

public class Camion extends Vehicule{
	private double chargeMax;

	public Camion(double chargeMax,String matricule,String marque) {
		super(matricule,marque);
		this.chargeMax = chargeMax;
	}
	@Override
	public void stationner() {
		System.out.println("le camion se gare dans une zone pour véhicules lourds");
	}
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("Charge max :"+chargeMax);
	}

}
