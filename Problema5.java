/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{

            Integer noInicial = 100;
            Integer noFinal = 1000;

            Integer noPalindromo=0;
            String vueltaNumero = "";
            Integer f1=0;
            Integer f2=0;

            for(int i = noInicial ; i < noFinal ; i++){
                for(int o = noInicial ; o < noFinal ; o++){
                    vueltaNumero="";
                    String numeroFactor = String.valueOf(i * o);

                    for(int vl=(numeroFactor.length()-1); vl >= 0 ; vl--){
                        vueltaNumero = vueltaNumero + (String.valueOf(numeroFactor.charAt(vl)));
                    }

                    if(vueltaNumero.equals(numeroFactor)){
                        f1 = i;
                        f2 = o;
                        noPalindromo = Integer.parseInt(numeroFactor);
                    }
                }
            }

            System.out.println("El no. palindromo mayor es " + noPalindromo);
            System.out.println("Factor 1: " + f1);
            System.out.println("Factor 2: " + f2);

        }catch(Exception e){
            System.out.println("Ingrese un numero valido"); 
        }
 
        
    }
    
}
