/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_14;

import java.util.Scanner;
/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ConversorTemperaturas ct = new ConversorTemperaturas();
        boolean valid = false;
        float f=0f;
        float r=0f;
        do{
            System.out.println("Introduce temp en Cº: ");
            float c = scan.nextFloat();
            try{
                f = ct.temperaturaAFarenheit(c);
                r = ct.temperaturaAReamur(c);
                valid=true;
                System.out.println(c+"ºC a Farenheit: "+f);
                System.out.println(c+"ºC a Reamur: "+r);
            }catch (TemperaturaErradaExcepcion e){
                System.out.println(e.getMessage());
            }
            
        }while(!valid);
    }
    
}
