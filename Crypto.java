import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        double cloture = 0.0;
        int compteur = 0;
        for (int i = 0, nb_raw = carte.length; i < nb_raw; ++i) {
            compteur += i;
            if (i != 0) {
                int line_precedante = carte[i-1][compteur];
                if ((carte[i][compteur] == 1 && line_precedante == 0) || (carte[i][compteur] == 0 && line_precedante == 1)) {
                    cloture += 2.5;   
                }
            }
        }
        System.out.printl(cloture);

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}
