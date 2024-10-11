/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_cousseau;

/**
 *
 * @author doria
 */
public class BouteilleBiere {
String nom;
float degreAlcool;
String brasserie;
Boolean ouverte;

public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;
}
public BouteilleBiere(String unNom, float unDegre, String uneBrasserie){
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}
 public boolean decapsuler() {
    if (ouverte) {
        System.out.println("Erreur : la bière " + nom + " est déjà ouverte.");
        return false;
    }
    ouverte = true;
    System.out.println("La bière " + nom + " est maintenant ouverte.");
    return true;
 
}
}

