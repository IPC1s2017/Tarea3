import java.util.Scanner;

public class Procesos {
    
    int no;
    Scanner scanner;
    
    public Procesos(){
        
        scanner = new Scanner(System.in);
        
        menu();
        
    }
       
    private void menu(){
        while(no!=6){
            System.out.println("Ingrese el ejercicio que desea ejecutar: \n"
                    + "1. Características entre números \n"
                    + "2. Número perfecto \n"
                    + "3. Split \n"
                    + "4. Múltiplos de 3 y 5 \n"
                    + "5. Número Palíndromo \n"
                    + "6. Salir");
            no = scanner.nextInt();
        switch(no) {
            case 1:
                Ejercicio1 ejercicio1 = new Ejercicio1();
                break;
            case 2:
                Ejercicio2 ejercicio2 = new Ejercicio2();
                break;
            case 3:
                Ejercicio3 ejercicio3 = new Ejercicio3();
                break;
            case 4:
                Ejercicio4 ejercicio4 = new Ejercicio4();
                break;
            case 5:
                Ejercicio5 ejercicio5 = new Ejercicio5();
                break;
            case 6:
                System.out.println("Adios!");
            
        }
    }
    }
    
}