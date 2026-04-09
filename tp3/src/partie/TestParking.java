package partie;

public class TestParking {

	

	public static void main(String[] args) {
		Vehicule[] v = new Vehicule[4];
		
		v[0] = new Voiture(4, "V1-","Audi");
		v[1] = new Voiture(4, "V2-","Audi");
		v[2] = new Moto(true,"M1-","kawasaki");
		v[3] = new Camion(10000, "C1-", "volvo");
		
		 for (int i = 0; i < v.length; i++) {
	            v[i].stationner();
	            v[i].afficher();
	        }
		 
		 System.out.println("=== Seulement les voitures ===");
		 for (int i = 0; i < v.length; i++) {
	            if (v[i] instanceof Voiture) {
	                v[i].afficher();
	            }
	        }
		 
		 
		 
		 Vehicule x = new Moto(true, "11C22", "Yamaha");
		 if (x instanceof Voiture) {
	            Voiture v1 = (Voiture) x;
	            System.out.println("Downcasting réussi !");
	        } else {
	            System.out.println("Erreur : x n'est pas une Voiture !");
	        }
		 
	        
		 
		 
   
	}

}
