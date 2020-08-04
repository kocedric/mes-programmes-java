import java.util.ArrayList; 
  
 class Cloture { 
     public static void main(String[] args) { 
         int[][] carte = { 
             {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0}, 
             {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0}, 
             {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 
             {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 
             {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 
             {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 
             {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 
             {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 
             {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 
             {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0}, 
             {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0}, 
             {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0}, 
             {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0}, 
             {0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0}, 
             {0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0}, 
             {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0}, 
             {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0}, 
             {0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0}, 
             {0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0}, 
             {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0}, 
             {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0}, 
             {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0}, 
             {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0}, 
             {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, 
             {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0}, 
             {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, 
             {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, 
             {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, 
             {0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, 
         }; 
  
         /******************************************* 
          * Completez le programme à partir d'ici. 
          *******************************************/ 
         /* 
         int[][] carte = { 
                        {0,1,1,1,0}, 
                        {0,0,1,1,0}, 
                        {0,1,0,1,0}, 
                        {0,1,1,1,0}}; 
         */ 
          
         int largeur = carte.length; 
         int longueur = carte[0].length; 
         class surface{ 
             
            class coord{ 
                 
                public int ligne; 
                public int colonne; 
                 
                public coord(int i, int j){ 
                    this.ligne = i; 
                    this.colonne = j; 
                     
                } 
                 
            } 
             
         
            public coord coord; 
            public int value; 
            public boolean[] neighboor ; 
            public boolean[] connexion ; 
             
     
            public surface(int value,int ligne,int colonne){ 
                this.value = value; 
                coord newCoord = new coord(ligne,colonne);               
                this.coord = newCoord;               
                this.neighboor = new boolean[4]; 
                this.connexion = new boolean[4]; 
            } 
             
  
             
            public boolean directlyOutsideConnected(){ 
                 
                boolean result = false; 
                 
                for (boolean connection : this.connexion){ 
                     
                    result = result | connection; 
                                     
                } 
                 
                return result; 
                         
            } 
             
            public double cloture() { 
                double result = 0; 
                 
                for (boolean neighbor : this.neighboor){ 
                     
                    if (neighbor == true){ 
                         
                        result = result + 2.5; 
                         
                    } 
                } 
                 
                return result; 
                 
                 
                 
            } 
                 
             
         } 
          
         surface[][] carte2 = new surface[carte.length][carte[0].length]; 
          
  
         //creation de la carte avec les objets 
         for (int i = 0; i < carte.length; i++ ){ 
             
            for (int j = 0; j < carte[0].length; j++){ 
                 
                if(carte[i][j] != 1 && carte [i][j] != 0){ 
                     
                    System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '"); 
                    System.out.print(carte[i][j] + "' trouvée en position [" + i); 
                    System.out.print("][" + j); 
                    System.out.println("]"); 
                    return; 
                     
                } 
                 
                 
                surface newSurface = new surface(carte[i][j],i,j); 
                carte2[i][j] = newSurface; 
                 
            } 
             
         } 
          
         //Verification de la connexion externe directe 
          
         for (int i = 0; i < carte2.length; i++ ){ 
             
            for (int j = 0; j < carte2[0].length; j++){ 
                 
                //verification de la connexion à gauche 
                 
                boolean gaucheConnexion = true; 
                 
                 
                if (j == 0){ 
                     
                    gaucheConnexion = true; 
                     
                }else if (carte2[i][j-1].connexion[0] == true && (carte2[i][j].value == carte2[i][j-1].value)){ 
                     
                    gaucheConnexion = true; 
     
                } else { 
                     
                    gaucheConnexion = false; 
                } 
                 
                carte2[i][j].connexion[0] = gaucheConnexion; 
                 
            } 
             
         } 
          
         for (int i = 0; i < carte2.length;i++){ 
             
            for (int j = carte2[0].length-1; j >= 0; j--){ 
                 
                boolean droiteConnexion; 
                 
                if (j == carte2[0].length-1){ 
                     
                    droiteConnexion = true; 
                     
                }else if (carte2[i][j+1].connexion[2] == true && (carte2[i][j].value == carte2[i][j+1].value)){ 
                     
                    droiteConnexion = true; 
     
                } else { 
                     
                    droiteConnexion = false; 
                } 
                 
            carte2[i][j].connexion[2] = droiteConnexion; 
            //System.out.println("droite : " + carte2[i][j].connexion[2] + " gauche : " + carte2[i][j].connexion[0] + " " + i + " " + j); 
  
             
            } 
             
         } 
          
          
          
         for (int i = 0; i < carte2.length;i++){ 
             
            for (int j = 0; j < carte2[0].length; j++){ 
                 
                boolean topConnexion = false; 
                 
                if (i==0){ 
                                                         
                    topConnexion = true;                                         
                     
                } else if (carte2[i-1][j].connexion[1] == true && (carte2[i][j].value == carte2[i-1][j].value)){ 
                     
                    topConnexion = true; 
     
                } else { 
                     
                    topConnexion = false; 
                } 
                 
                carte2[i][j].connexion[1] = topConnexion; 
                 
             
            } 
             
         } 
          
          
         for (int i = carte2.length-1; i >= 0;i--){ 
             
            for (int j = 0; j < carte2[0].length; j++){ 
                 
                boolean bottomConnexion; 
                 
                if (i == carte2.length-1){ 
                     
                    bottomConnexion = true; 
                     
                }else if (carte2[i+1][j].connexion[3] == true && (carte2[i][j].value == carte2[i+1][j].value)){ 
                     
                    bottomConnexion = true; 
     
                } else { 
                     
                    bottomConnexion = false; 
                } 
                 
            carte2[i][j].connexion[3] = bottomConnexion; 
            //System.out.println("droite : " + carte2[i][j].connexion[2] + " gauche : " + carte2[i][j].connexion[0] + " " + i + " " + j); 
  
             
            } 
             
         } 
          
          
         //verification des voisins 
          
          
         for (int i = 0; i < carte2.length; i++ ){ 
             
            for (int j = 0; j < carte2[0].length; j++){ 
                 
                //voisin de gauche 
                 
                if (j > 0){ 
                     
                    if(carte2[i][j].value != carte2[i][j-1].value && carte2[i][j-1].directlyOutsideConnected() == true){                     
                         
                        carte2[i][j].neighboor[0] = true; 
                                                 
                    } 
                     
                } else if (j == 0) { 
                     
                    carte2[i][j].neighboor[0] = true; 
                     
                } 
                     
                 
                     
                //voisin de droite 
                 
                if (j <= (carte2[0].length-2)){ 
                     
                    if(carte2[i][j].value != (carte2[i][j+1].value) && carte2[i][j+1].directlyOutsideConnected() == true){ 
                         
                        carte2[i][j].neighboor[2] = true; 
                     
                    } 
                     
                }else if (j == (carte2[0].length-1)){ 
                     
                    carte2[i][j].neighboor[2] = true; 
                     
                } 
                     
                     
                     
                //voisin du haut 
                 
                if (i > 0){ 
                     
                    if(carte2[i][j].value != carte2[i-1][j].value&& carte2[i-1][j].directlyOutsideConnected() == true){ 
                         
                        carte2[i][j].neighboor[1] = true; 
                     
                    }  
                } else if (i == 0) { 
                     
                    carte2[i][j].neighboor[1] = true; 
                     
                }                    
                 
                 
                //voisin du bas 
                 
                 
                 
                if (i <= (carte2.length-2)){ 
                     
                    if(carte2[i][j].value != carte2[i+1][j].value && carte2[i+1][j].directlyOutsideConnected() == true){ 
                         
                        carte2[i][j].neighboor[3] = true; 
                     
                    } 
                     
                } else { 
                     
                    carte2[i][j].neighboor[3] = true;                
                     
                }                    
                 
                         
                 
            } 
             
         } 
          
         for (int i = 0; i < carte2.length; i++ ){ 
             
             
            for (int j = 1; j < carte2[0].length-1; j++){ 
                 
                if(carte2[i][j].value == 0 && carte2[i][j+1].value == 1 && carte2[i][j-1].value == 1){ 
                     
                     
                    if(carte2[i][j].directlyOutsideConnected() == true | (carte2[i+1][j].directlyOutsideConnected() && carte2[i+1][j].value == 0) == true | (carte2[i-1][j].directlyOutsideConnected() && carte2[i-1][j].value==0)  == true){ 
                         
                        System.out.println("Votre carte du terrain n'a pas le bon format :"); 
                        System.out.print("bord extérieur entrant trouvé en position [" + i); 
                        System.out.print("][" + j); 
                        System.out.println("]"); 
                        return; 
                         
                         
                         
                    } 
                     
                } 
                 
                 
            } 
             
         } 
          
  
          
         //Calcul des clotures total 
         double total = 0; 
          
         for (int i = 0; i < carte2.length; i++ ){ 
             
             
             
            for (int j = 0; j < carte2[0].length; j++){ 
                 
                if (carte2[i][j].value==1){ 
                 
                total = total + carte2[i][j].cloture(); 
                 
                } 
                 
            } 
         } 
          
         //System.out.println(carte2[2][2].connexion[0]); 
          
  
         System.out.print("Il vous faut " + total); 
         System.out.println(" mètres de clôture pour votre terrain."); 
          
  
          
          
          
          
         /* 
         System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '"); 
         System.out.print("' trouvÃ©e en position ["); 
         System.out.print("]["); 
         System.out.println("]"); 
  
         System.out.println("Votre carte du terrain n'a pas le bon format :"); 
         System.out.print("bord extÃ©rieur entrant trouvÃ© en position ["); 
         System.out.print("]["); 
         System.out.println("]"); 
  
         System.out.print("Il vous faut "); 
         System.out.println(" mÃ¨tres de clÃ´ture pour votre terrain."); 
          
         */ 
  
         /******************************************* 
          * Ne rien modifier après cette ligne. 
          *******************************************/ 
     } 
 } 
