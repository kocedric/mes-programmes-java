import java.util.ArrayList;
import java.util.Scanner;

class TrancheMax {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        // Entree de la matrice
        System.out.println("Saisie de la matrice :");
        String matrice = clavier.nextLine();
        System.out.format("Matrice saisie :\n%s\n", matrice);
        clavier.close();

        // Validation de la matrice
        if (!checkFormat(matrice)) {
            return;
        }

        // Trouver la liste des lignes avec le plus grand nombre de 1 consecutif
        // Ces numéros de lignes sont stockés dans un tableau dynamique
        ArrayList<Integer> maxConsecutifList = findConsecutiveList(matrice);

        if (maxConsecutifList.isEmpty()) {
            System.out.println("Pas de lignes avec des 1 !");
        } else {
            System.out.println("Ligne(s) avec le plus de 1 consecutifs :");
            for (Integer index : maxConsecutifList) {
                System.out.println(index);
            }
        }
    }

    /*******************************************
     * Completez le programme a partir d'ici.
     *******************************************/

      public static boolean checkFormat(String matrice ){
  
        matrice = matrice.trim();
        String[] lignes = matrice.split(" {1,}");
        boolean testDeRetour = true;



        for (int i = 0; i < matrice.length(); ++i) {
            if (matrice.charAt(i) != '0' && matrice.charAt(i) != '1' && matrice.charAt(i) != ' ' ){
                System.out.println("Matrice invalide : seuls '1', '0' et ' ' sont admis !");
                testDeRetour = false;
                break;
            }
        }
        
        if ((testDeRetour == true) && !checkLineLength(matrice)) {
            return false;
        }
        if (matrice.isEmpty()){
            System.out.println("Matrice vide !");
            return false;
        }

        
        return testDeRetour;
    
    }


    public static boolean checkLineLength(String matrice ){
 
        matrice = matrice.trim();
        String[] lignes = matrice.split(" {1,}");
        int linesLength  = lignes.length;
        boolean testDeRetour = true;
            
        for (int i = 0; i < linesLength - 1; ++i){
            if (lignes[i].length() != lignes[i+1].length()){
                System.out.println("Matrice invalide, lignes de longueurs differentes !");
                testDeRetour = false;
                break;    
            }      
        } 
            
            
        return testDeRetour;
    }
    
 
    public static ArrayList<Integer>  findConsecutiveList (String matrice ){
         ArrayList<Integer> maxConsecutifList = new ArrayList<Integer>();

        matrice = matrice.trim();
            String[] lignes = matrice.split(" {1,}");
        int lineLength = lignes[0].length();
        int nbOfLines   = lignes.length;
        int i = 1;
        int max = 0;
        int[] decompte = new int[nbOfLines];
        for (i=0; i < nbOfLines; ++i){
            int unConsec = 0;
            int maxLine  = 0;
            boolean serie = false;
            char previousChar = ' ';
            
            for (int j=0; j < lineLength; ++j) {
                if (lignes[i].charAt(j) == '1' && previousChar == '1'){
                    if (serie) {        //serie qui se poursuit
                        ++unConsec;
                    } else {            //serie qui commence
                        serie = true;
                        unConsec = 2;
                    } // end if serie
                } else {
                    serie = false;      //serie qui s'arrete
                } // end if

                previousChar = lignes[i].charAt(j);
                if (unConsec > maxLine){ maxLine = unConsec;} // meilleure suite pour la meme ligne
            
            } // end for j
            decompte[i] = maxLine;
            if (maxLine > max) { max = maxLine; }
        }  
         
        
        if ( max > 0) {
            for (i=0; i < nbOfLines; ++i){
                if ( decompte[i] == max) {
                    maxConsecutifList.add(i);
                }
            }  
       } return maxConsecutifList ;

    }

    /*******************************************
     * Ne rien modifier apres cette ligne
     *******************************************/
}
