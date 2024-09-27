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
    double conv;
    int nb;
    Scanner sc = new Scanner(System.in);
System.out.println("bonjour saisissez une valeur:");
val1=sc.nextDouble();
System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
System.out.println("1) De Celcius vers Kelvin");
System.out.println("2) De Kelvin vers Celcius ");
System.out.println("3) De Farenheit vers Celcius ");
System.out.println("4) De Celcius vers Farenheit");
System.out.println("5) De Kelvin vers Farenheit");
System.out.println("6) De Farenheit vers Kelvin");
nb=sc.nextInt();

switch(nb){
    case 1:
        conv=CelciusVersKelvin(val1);
        System.out.println(val1+ "degré Celsius est égal à "+conv+" degrés Kelvin");
        break;
    case 2:
        conv=KelvinVersCelsius(val1);
        System.out.println(val1+ "degré Kelvin est égal à"+conv+" degrés Celcius");
        break;
    case 3:
        conv=FarenheitVersCelcius(val1);
        System.out.println(val1+ "degré Cel est égal à "+conv+" degrés Kelvin");
        break;
    case 4:
        conv=CelciusVersFarenheit(val1);
        System.out.println(val1+ "degré Celsius est égal à "+conv+" degrés Farenheit");
        break;
    case 5:
        conv=KelvinVersFarenheit(val1);
        System.out.println(val1+ "degré Kelvin est égal à "+conv+" degrés Farenheit");
        break;
    case 6:
        conv=FarenheitversKelvin(val1);
        System.out.println(val1+ "degré Farenheit est égal à "+conv+" degrés Kelvin");
        break;
        
    }
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
public static double KelvinVersFarenheit (double tKelvin) {
    return 1.8*(tKelvin-273.15)+32;
}
public static double FarenheitversKelvin (double tFarenheit){
    return (tFarenheit +459.67)*5/9;
    }
}   