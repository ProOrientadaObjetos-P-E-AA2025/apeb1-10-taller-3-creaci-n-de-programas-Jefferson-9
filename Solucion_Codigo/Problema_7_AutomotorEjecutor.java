import java.util.Scanner;
public class Problema_7_AutomotorEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cedulaDueno, marcaVehiculo;
        int anoFabricacion;
        double valorVehiculo;
        
        System.out.println("     ==== AUTOMOTOR ====");
        System.out.print("Ingrese la cédula del dueño: ");
        cedulaDueno = sc.nextLine();
        System.out.print("Ingrese la marca del vehículo: ");
        marcaVehiculo = sc.nextLine();
        System.out.print("Ingrese el año de fabricación del vehículo: ");
        anoFabricacion = sc.nextInt();
        System.out.print("Ingrese el valor del vehículo: $");
        valorVehiculo = sc.nextDouble();
        
        Problema_7_AutomotorBase auto1 = new Problema_7_AutomotorBase(cedulaDueno,
        marcaVehiculo, anoFabricacion, valorVehiculo);
        
        System.out.println("\n     === DETALLES ===");
        System.out.println(auto1);
        sc.close();
    }
}