/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;
import java.util.Scanner; 
import java.util.Random;

/**
 *
 * @author etudiant
 */
public class Exercices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//        Exercice 1
//        Affiche Hello world
//        System.out.println("Hello world");
        
        //declaration d'un scanner pour la suite des exercices
        //Scanner ac = new Scanner(System.in);
        
        //Exercice 2
        //Demande à l'utlisateur de saisir son nom puis affiche un bonjour personalisé avec le nom de l'utilisateur
        /*System.out.println("Veuillez saisir votre nom : ");
        String str = ac.next();
        System.out.println ("Bonjour " + str);*/
        
        
        /*int i = 1*2*3;
        System.out.println("La factorielle de 3 est : " + i);*/
        
        
        /*System.out.println("Veuillez saisir la 1ere note : ");
        int note1 = ac.nextInt();
        
        System.out.println("Veuillez saisir la 2eme note : ");
        int note2 = ac.nextInt();
        
        System.out.println("Veuillez saisir la 3eme note : ");
        int note3 = ac.nextInt();
        
        System.out.println("Moyenne des 3 notes : " + ((note1 + note2 + note3)/3) + "/20");*/
        
        
        /*System.out.println("Veuillez saisir la base du triangle : ");
        int base = ac.nextInt();
        
        System.out.println("Veuillez saisir la hauteur du triangle : ");
        int haut = ac.nextInt();
        
        System.out.println("L'aire du triangle est :  " + (base * haut)/2);*/
        
        //Exercice 6
        /*System.out.println("Veuillez saisir le rayon du cercle : ");
        int rayon = ac.nextInt();
        
        System.out.println("L'aire d'une cercle est :  " + (Math.PI * (rayon*rayon)));*/
        
        
        //Exercice 7 
        //Demande...
        /*System.out.println("Veuillez saisir un chiffre : ");
        int facto = ac.nextInt();
        
        if (facto !=0){
            for (int i=facto-1 ;i>=1;i--){
                facto=facto*i;
            }
            System.out.println("donc le factoriel est =  "+facto);
        } else{
            facto=1;
            System.out.println("le factoriel est = "+facto);
        }*/
        
        //Exercice 8
        /*int nombreNotes;
        System.out.println("Nombre de notes a saisir ?");
        nombreNotes = ac.nextInt();
        
        double [] lesNotes = new double[nombreNotes];
        
        for (int i=0; i<= lesNotes.length -1; i++) {
           System.out.println("Note n°" + (i+1) + " :");
           lesNotes[i] = ac.nextInt();
        }
        
        double moyenne = 0;
        
        for (int i=0; i<= lesNotes.length -1; i++) {
           moyenne = moyenne + lesNotes[i];
        }
        System.out.println("La moyenne des notes est : "+ moyenne/nombreNotes);    
        */
        
        //Exercice 9
        
        /*int nombre,essais=0;
        Random rand = new Random();
        int nombreAtrouver = rand.nextInt(101);

        System.out.println("-Le juste prix-");
        System.out.println("--------------------------------------------");
        System.out.println("Trouvez le nombre mystere entre 0 et 100 !");
            do{
           
            System.out.println("Veuillez entrer un nombre...");
            nombre=ac.nextInt();       

            if (nombre<nombreAtrouver)
                {
                System.out.println("C'est plus ! ");
                essais++;
                }
            else if (nombre >nombreAtrouver)
                {
                System.out.println("C'est moins !");
                essais++;
                }
            else
                {
                System.out.println("Trouvé en " + essais + " essais ! Bien joué !");
                }
            }
            while(nombre!=nombreAtrouver);*/
 
    }
    
    //Exercice 10
    /*public boolean plusGrand(int a, int b)  {
        a = 2;
        b = 3;
        if (a > b){
            return true;
        }else{
            return false;
        } 
    }*/
     
    //Exercice 11
    
    /*public class Pythagore{
        
        public double calcul_hypo(int coteA,int coteB)  {
            int carre1 = coteA*coteA;
            int carre2 = coteB*coteB;
            int carre = carre1 + carre2;
            double hypo = Math.sqrt(carre);
            return hypo;
        }
        public double calcul_cote(int cote,int hypo)    {
            int hypo_carre = hypo*hypo;
            int cote_carre = cote*cote;
            int carre = hypo_carre-cote_carre;
            double cote2 = Math.sqrt(carre);
            return cote2;
        }
    }
*/
    public class Exo12{
        
        public void demandeValeurs(){
            int valeurs;
            Scanner ac = new Scanner(System.in);
            System.out.println("Veuillez entrer une valeur");
            valeurs = ac.nextInt();
            
             int [] tabVal = new int[valeurs];
             
             
        }
    }
    
    
    
    
}
