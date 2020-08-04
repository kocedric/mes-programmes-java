import java.util.Scanner;
import java.util.Locale;

class Pret {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int 	montant_total		=	0;
		int 	remboursement_fixe 	=	0;
		int 	somme_restant		=	0;
		int 	nbr_annee			=	0;
		double 	taux_interet		=	0;
		double 	interet_variable 	= 	0;


		do {
			System.out.print("Entrez le montant de votre empreint (euros): ");
			montant_total = input.nextInt();
			System.out.print("Entrez le montant à rembourser tous les mois (euros): ");
			input.useLocale(Locale.ENGLISH);
			remboursement_fixe = input.nextInt();

			if(montant_total <= 0) {
				System.out.println("Le montant de votre empreint doit être superieur à 0.\n");
			}
			if(remboursement_fixe <= 0) {
				System.out.println("Le montant de votre remboursement doit être superieur à 0.\n");
			}
		} while(montant_total <= 0 || remboursement_fixe <= 0);

		do {
			System.out.print("Entrez le taux d'interêt (entre 0 et 1): ");
			taux_interet = input.nextDouble();
			if(taux_interet <= 0 || taux_interet >= 1) {
				System.out.println("Le taux d'interêt doit être compris entre 0 et 1\nRéssayez !\n");
			}
		} while (taux_interet <= 0 || taux_interet >= 1);

		somme_restant = montant_total;
		while (somme_restant >= remboursement_fixe) {
			interet_variable += taux_interet * somme_restant;
			somme_restant -= remboursement_fixe;
			++nbr_annee;
		}

		if (somme_restant > 0 && somme_restant < remboursement_fixe) {
			interet_variable += taux_interet * somme_restant;
		}

		System.out.println("La somme des intérêts encaissés (sur " + nbr_annee + " mois) est alors de " 
							+ (int)interet_variable + " euros.");
	}
}