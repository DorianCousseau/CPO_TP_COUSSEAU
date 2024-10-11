/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_cousseau;

/**
 *
 * @author doria
 */
public class TP2_Bieres_Cousseau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
BouteilleBiere Biere1 = new BouteilleBiere( "Cuvée des trolls", (float)7.0,"Dubuisson") ;
Biere1.lireEtiquette();
BouteilleBiere Biere2 = new BouteilleBiere("Leffe", (float)6.6 ,"Abbaye de Leffe") ;
Biere2.lireEtiquette();
BouteilleBiere Biere3 = new BouteilleBiere("Kwak", (float)8.4,"Pauwel") ;
Biere3.lireEtiquette();
BouteilleBiere Biere4 = new BouteilleBiere("Desperados", (float)5.9 ,"Alken-Maes") ;
Biere4.lireEtiquette();
BouteilleBiere Biere5 = new BouteilleBiere("Rince cochon ", (float)8.5 ,"SBA") ;
Biere5.lireEtiquette();
}
}
