import java.util.Scanner;

public class Paques {
	private static Scanner CLAVIER = new Scanner(System.in);

	public static int demanderAnnee() {
		int annee = 0;
		do {
			System.out.println("Entrez une annee (1583-4000) : ");
			annee = CLAVIER.nextInt();
		} while (annee < 1583 || annee > 4000);

		return annee;
	}


	public static void afficheDate(int annee, int nbrDeJours) {
		System.out.print("Date de Paques en " + annee + " : ");
		if (nbrDeJours <= 31) {
			System.out.println(nbrDeJours + " mars");
		}

		if (nbrDeJours >= 32) {
			System.out.println((nbrDeJours - 31) + " avril");
		}
	}


	public static int datePaques(int annee) {
		int siecle = annee / 100;
		int p = (13 + 8 * siecle) / 25;
		int q = siecle / 4;
		int m = (15 - p + siecle - q) % 30;
		int n = (4 + siecle - q) % 7;
		int d = (m + (19 * (annee % 19))) % 30;
		int e = (2 * (annee % 4) + 4 * (annee % 7) + 6 * d + n) % 7;
		int jour = e + d + 22;

		if (e == 6 && ((d == 29) || (d == 28 && ((11 * (m+1) % 30) < 19)))) {
			jour -= 7;
		}

		return jour;
	}





	public static void main(String[] args) {
		int annee = demanderAnnee();
		int jour = datePaques(annee);
		afficheDate(annee, jour);
	}
}