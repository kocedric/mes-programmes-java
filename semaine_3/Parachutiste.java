import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        final double g = 9.81;
        double v0 = 0;
        double t0 = 0;
        double vitesse = v0;
        double hauteur = h0;
        double accel = g;
        double surface = 2.0;
        double t = t0;
        boolean v_vitesse = true;
        boolean v_accel = true;
        boolean v_parachute = true;
        double s = surface / masse;

        System.out.format("%.0f, %.4f, %.4f, %.5f\n",
                              t, hauteur, vitesse, accel);

        while(hauteur >= 0) {
        	++t;
        	double q = Math.exp(-s * (t - t0));
        	vitesse = (g/s) * (1-q) + v0*q;
        	hauteur = h0 - (g/s) * (t-t0) - ((v0 - (g/s)) / s) * (1-q);
        	accel = g - (s*vitesse);

        	if(hauteur >= 0.0) {
        		if (vitesse > 343.0 && v_vitesse) {
        			System.out.printf("## Felix depasse la vitesse du son\n");
        			v_vitesse = false;
        		}
        		if (accel < 0.5 && v_accel) {
        			System.out.printf("## Felix a atteint sa vitesse maximale\n");
        			v_accel = false;	
        		}
        		if (hauteur < 2500.0 && v_parachute) {
        			System.out.printf("## Felix ouvre son parachute\n");
        			v_parachute = false;
        			surface = 25.0;
        			v0 = vitesse;
        			h0 = hauteur;
        			t0 = t;
        			s = surface / masse;
        		}
        		System.out.printf("%.0f, %.4f, %.4f, %.5f\n",
        						t, hauteur, vitesse, accel);
        	}
	    }


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
