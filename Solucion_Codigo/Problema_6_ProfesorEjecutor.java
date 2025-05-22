import java.util.Scanner;
public class Problema_6_ProfesorEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, cedula;
        double sueldoBasico;
        
        System.out.print("Ingrese el nombre del profesor: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el apellido del profesor: ");
        apellido = sc.nextLine();
        System.out.print("Ingrese la cédula del profesor: ");
        cedula = sc.nextLine();
        System.out.print("Ingrese el sueldo básico del profesor: $");
        sueldoBasico = sc.nextDouble();
        
        Problema_6_ProfesorBase profesor1 = new Problema_6_ProfesorBase(nombre,
        apellido, cedula, sueldoBasico);
        
        System.out.println("\n=== DETALLES DEL PROFESOR ===");
        System.out.println(profesor1);
        sc.close();
    }
}