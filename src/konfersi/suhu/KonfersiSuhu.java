/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konfersi.suhu;

import java.util.Scanner;

/**
 *
 * @author HP 242
 */
public class KonfersiSuhu {

    private static double Fahrenheit;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi
        Double Fahnerheit, Celcius;
        
        //Membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        //Input
        System.out.println("== Program Konfersi Suhu ==");
        System.out.print("Input Fahrenheit: ");
        Fahrenheit = baca.nextDouble();
        
        //Proses
        Celcius = ((Fahrenheit - 32 )* 5 / 9);
        
        //Output
        System.out.println(" Celcius=" + Celcius);
        
        
    }
}
