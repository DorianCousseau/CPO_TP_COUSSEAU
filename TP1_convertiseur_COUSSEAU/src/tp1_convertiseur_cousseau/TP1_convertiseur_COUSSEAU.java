/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertiseur_cousseau;

import java.util.Scanner;

/**
 *
 * @author Dorian COUSSEAU
 */
public class TP1_convertiseur_COUSSEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double val1;
    double ck;
    double kc;
    double fc;
    double cf;
    double kf;
    double fk;
    Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
val1=sc.nextDouble();
ck=CelciusVersKelvin(val1);
kc=FarenheitVersCelcius( val1);
fc=CelciusVersFarenheit(val1)






    
    }
public static double CelciusVersKelvin (double tCelcius) {
double conv1;
conv1= tCelcius+273.15;
return conv1;
}
public static double KelvinVersCelsius (double tKelvin) {
return tKelvin-273.15;
}
public static double FarenheitVersCelcius (double tFarenheit){
return (tFarenheit-32)/1.8;
}
public static double CelciusVersFarenheit (double tCelcius) {
    return tCelcius*1.8+32;
}
public static double KelvinVersFarenheitin (double tKelvin) {
    return 1.8*(tKelvin-273.15)+32;
}
