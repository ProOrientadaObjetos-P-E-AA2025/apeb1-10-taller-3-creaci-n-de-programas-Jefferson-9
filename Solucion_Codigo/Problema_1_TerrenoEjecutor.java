import java.util.Scanner;
public class Problema_1_TerrenoEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largo, ancho, valorMetroCuadrado;
        System.out.println("=== CALCULADORA DE TERRENO ===");
        System.out.print("Ingrese el ancho del terreno (metros): ");
        ancho = sc.nextDouble();
        System.out.print("Ingrese el largo del terreno (metros): ");
        largo = sc.nextDouble();
        System.out.print("Ingrese el valor del metro cuadrado: $");
        valorMetroCuadrado = sc.nextDouble();

        Problema_1_TerrenoBase Terreno = new Problema_1_TerrenoBase (ancho, largo, valorMetroCuadrado);

        Terreno.calcularArea();
        Terreno.calcularCostoTerreno();
        System.out.println();
        System.out.println("=== RESULTADOS ===");
        System.out.println(Terreno);
    
        sc.close();
    }
}