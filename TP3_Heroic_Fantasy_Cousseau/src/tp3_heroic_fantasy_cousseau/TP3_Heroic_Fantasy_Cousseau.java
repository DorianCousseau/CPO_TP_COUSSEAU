/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_cousseau;

/**
 *
 * @author doria
 */
public class TP3_Heroic_Fantasy_Cousseau {

    /**
     * @param args the command line arguments
     */
import Arme.*;
import Personnages.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Création des armes
        Epée excalibur = new Epée("Excalibur", 7, 5);
        Epée durandal = new Epée("Durandal", 4, 7);
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        ArrayList<Arme> armes = new ArrayList<>();
        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);

        for (Arme arme : armes) {
            System.out.println(arme);
        }

        // Création des personnages
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Magicien garcimore = new Magicien("Garcimore", 44, false);
        Guerrier conan = new Guerrier("Conan", 78, false);
        Guerrier lannister = new Guerrier("Lannister", 45, true);

        ArrayList<Personnages> personnages = new ArrayList<>();
        personnages.add(gandalf);
        personnages.add(garcimore);
        personnages.add(conan);
        personnages.add(lannister);

        for (Personnages personnage : personnages) {
            System.out.println(personnage);
        }

        // Gestion des armes
        conan.ajouterArme(excalibur);
        conan.ajouterArme(durandal);
        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(charme);

        conan.equiperArme("Excalibur");
        gandalf.equiperArme("Chêne");

        System.out.println(conan);
        System.out.println(gandalf);
    }
}
