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
 
        BouteilleBiere premiereBiere = new BouteilleBiere("Cuvée des trolls", 7.0f, "Dubuisson");
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Guinness", 4.2f, "St. James's Gate Brewery");

        premiereBiere.lireEtiquette();
        premiereBiere.decapsuler();
        System.out.println(premiereBiere);

        deuxiemeBiere.lireEtiquette();
        System.out.println(deuxiemeBiere);

        troisiemeBiere.lireEtiquette();
        troisiemeBiere.decapsuler();
        System.out.println(troisiemeBiere);
    }
}

