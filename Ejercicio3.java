
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        System.out.println("Bienvenido: en este algoritmo te dire si un numero es Split o no lo es ");
        
        System.out.println("Comencemos");
        System.out.println("");

        Scanner Registro = new Scanner(System.in);

        System.out.println("Introdusca un numero;");
        int N = Registro.nextInt();
        int i = N;

        int unbill = i / 1000000000;
        int p = i - (unbill * 1000000000);

        int cenmill = p / 100000000;
        int a = p - (cenmill * 100000000);

        int decmill = a / 10000000;
        int c = a - (decmill * 10000000);

        int unmill = c / 1000000;
        int e = c - (unmill * 1000000);

        int cenmil = e / 100000;
        int b = e - (cenmil * 100000);

        int decmil = b / 10000;
        int d = b - (decmil * 10000);

        int unmil = d / 1000;
        int f = d - (unmil * 1000);

        int cen = f / 100;
        int h = f - (cen * 100);

        int dec = h / 10;
        int l = h - (dec * 10);

        int uni = l;

        int x = uni+dec+cen+unmil+decmil;
        int y = cenmil+unmill+decmill+cenmill+unbill;
        int X = uni+dec+cen+unmil;
        int Y = decmil+cenmil+unmill+decmill;
        int w = uni+dec+cen;
        int q = unmil+decmil+cenmil;
        int W = uni+dec;
        int Q = cen+unmil;

        if (x == y || X == Y || w == q || W == Q) {

            System.out.println("### Si Es Split ###");

        } else {
            System.out.println( "### No es Split ###");
        }

    }

}
