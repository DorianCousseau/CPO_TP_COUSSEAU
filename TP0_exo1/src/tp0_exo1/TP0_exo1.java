/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_exo1;

import java.util.Scanner;

/**
 *
 * @author dorian
 */
public class TP0_exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Bonjour");String prenom;
    Scanner sc;
    sc = new Scanner(System.in);
    System.out.println("Quel est votre prenom ?");
    prenom = sc.nextLine();
    System.out.println("au revoir"+ prenom);
    }
    
}