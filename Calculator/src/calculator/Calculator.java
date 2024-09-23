/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author dorian COUSSEAU
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Please enter the operator\n1) add\n2) substract\n3) multiply\n4) divide\n5) modulo");
    int nb;
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer le nombre :");
    nb=sc.nextInt(); // On demande a sc de donner le prochain entier
    int operateur;
    operateur = nb;
    int val1;
    //val=5;
    System.out.println("\n Entrer le nombre :");
    val1=sc.nextInt(); // On demande a sc de donner le prochain entier
    int operande1;
    operande1=val1;
    int val2;
    System.out.println("\n Entrer le nombre :");
    val2=sc.nextInt(); // On demande a sc de donner le prochain entier
    int operande2;
    switch(nb){
        case 1 :
            System.out.println(val1+val2);
            break;
        case 2 :
            System.out.println(val1-val2);
            break;
        case 3 :
            System.out.println(val1*val2);
            break;
        case 4 :
            System.out.println(val1/val2);
            break;
        case 5 :
            System.out.println(val1%val2);
            break;

    }

    }

}
