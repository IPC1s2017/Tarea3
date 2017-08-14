import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String Args[]) {
        Scanner scan = new Scanner(System.in);
        int mitad=0;
        int total = 0;
        int total2 = 0;
        System.out.println("Ingresa un numero entero:");
        Integer numeros = scan.nextInt();
        char[] nums = numeros.toString().toCharArray();
        for (char c : nums) {
            System.out.println(c + " ");
        }
        int completo = nums.length;
        System.out.println("el numero de elementos: "+completo);
        if(completo%2==0){
            mitad = completo/2;
            for (int i=0; i< mitad ; i++)
              total += nums[i];  
            
            System.out.println("suma " +total);
        }else{
            for (int i=mitad; i<nums.length ; i--)
              total2 += nums[i];
        }
        if(total==total2){
            System.out.println("el numero "+numeros+"es Split");
        }else{
            System.out.println("el numero "+numeros+" No es Split");
        }
    }

}