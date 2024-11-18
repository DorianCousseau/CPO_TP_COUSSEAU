package tp3_heroic_fantasy_cousseau;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doria
 */




import java.util.ArrayList;

public abstract class Personnages implements EtreVivant {
    private String nom;
    private int niveauVie;
    private ArrayList<Arme> armes = new ArrayList<>();
    private Arme armeEnMain = null;

    public Personnages(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    @Override
    public void seFatiguer() {
        niveauVie -= 10;
    }

    @Override
    public boolean estVivant() {
        return niveauVie > 0;
    }

    @Override
    public void estAttaque(int points) {
        niveauVie -= points;
    }

    // Méthodes précédentes (ajouterArme, equiperArme, etc.)
}
