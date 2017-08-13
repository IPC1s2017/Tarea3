/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danie
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{

            Integer noInicial = 100;
            Integer noFinal = 1000;

            Integer noPalindromo=0;
            String vueltaNumeroFactor1 = "";
            String vueltaNumeroFactor2 = "";
            String vueltaNumero = "";
            Integer f1=0;
            Integer f2=0;
            Integer vf1=0;
            Integer vf2=0;

            for(int i = noInicial ; i < noFinal ; i++){
                for(int o = noInicial ; o < noFinal ; o++){
                    vueltaNumeroFactor1="";
                    vueltaNumeroFactor2="";
                    vueltaNumero = "";
                    
                    String numeroFactor = String.valueOf(i * o);
                    

                    for(int vl=(numeroFactor.length()-1); vl >= 0 ; vl--){
                        vueltaNumero = vueltaNumero + (String.valueOf(numeroFactor.charAt(vl)));
                    }

                    for(int vl1=(String.valueOf(i).length()-1); vl1 >= 0 ; vl1--){
                        vueltaNumeroFactor1 = vueltaNumeroFactor1 + (String.valueOf(String.valueOf(i).charAt(vl1)));
                    }
                    
                    for(int vl2=(String.valueOf(o).length()-1); vl2 >= 0 ; vl2--){
                        vueltaNumeroFactor2 = vueltaNumeroFactor2 + (String.valueOf(String.valueOf(o).charAt(vl2)));
                    }
                    
                    String multiplicacionVuelta = String.valueOf(Integer.parseInt(vueltaNumeroFactor1) * Integer.parseInt(vueltaNumeroFactor2));
                    
                    if(Integer.parseInt(vueltaNumero)==Integer.parseInt(multiplicacionVuelta)){
                        f1 = i;
                        f2 = o;
                        vf1 = Integer.parseInt(vueltaNumeroFactor1);
                        vf2 = Integer.parseInt(vueltaNumeroFactor2);
                        
                        System.out.println("El no. que satisface las condiciones es el siguiente");
                        System.out.println("Factor 1: " + f1);
                        System.out.println("Factor 2: " + f2);
                        System.out.println("Total : " +  String.valueOf(f1 * f2));
                        System.out.println(" ");
                        System.out.println("Factor 1v: " + vf1);
                        System.out.println("Factor 2v: " + vf2);
                        System.out.println("Totalv : " +  String.valueOf(vf1 * vf2));
            
                        System.exit(0);
                    }
                }
            }

            
            

        }catch(Exception e){
            System.out.println("Ingrese un numero valido"); 
        }
 
    }
    
}
