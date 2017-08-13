/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danie
 */
import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        
        int resultado = 0;
        
        System.out.println("Escriba un numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        
        if(numero%2 == 0){
            System.out.print("Sus divisores son: ");
            
            for(int i = 1; i < numero; i++){
                if(numero % i == 0){
                      System.out.print(i+",");
                      resultado += i;            
                }
            }  
            
        }else{
           System.out.println("No existen numero perfectos impares");  
        }
        
        if(resultado == numero){
            System.out.println("");
            System.out.println("El numero si es perfecto");
        }else{
            System.out.println("");
            System.out.println("El numero no es perfecto");  
        }  
    }
}
