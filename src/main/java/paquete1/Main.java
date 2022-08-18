package paquete1;

import java.util.Scanner;

public class Main {
    public static float productomasIVA(float producto){
        float IVA = producto*0.16f;
        float result = producto+IVA;
        return result;
    }
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.print("Digite el valor de tu producto :");
        float valorProducto = escaner.nextFloat();
        System.out.println("El valor del Producto mas el IVA es :"+ productomasIVA(valorProducto));


    }
}
