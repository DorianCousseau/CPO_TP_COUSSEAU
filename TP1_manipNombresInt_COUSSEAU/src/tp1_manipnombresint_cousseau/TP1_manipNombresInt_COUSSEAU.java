/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_cousseau;

import java.util.Scanner;

/**
 *
 * @author Dorian COUSSEAU
 */
public class TP1_manipNombresInt_COUSSEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int val1;  
   int val2;
   int somme;
   int difference;
   int produit;
   int quotient;
   int reste;
   Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer la premiere valeur :");
val1=sc.nextInt();
System.out.println("\n Entrer la deuxième valeur :");
val2=sc.nextInt();
somme= val1+val2;
difference=val1-val2;
produit=val1*val2;
System.out.println("\nla somme des deux valeurs est:"+somme+"\nla difference des deux valeurs est:"+difference+"\nle produit des deux valeurs est :"+produit);
quotient=val1/val2;
reste=val1%val2;
System.out.println("\nle quotient des deux valeur est :"+quotient+"\nle reste de la divion des deux valeurs est: "+reste);

    }

}
