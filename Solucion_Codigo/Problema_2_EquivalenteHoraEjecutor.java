import java.util.Scanner;
public class Problema_2_EquivalenteHoraEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas;
        System.out.println("=== CONVERTIDOR DE HORAS ===");
        System.out.print("Ingrese la cantidad de horas(entero): ");
        horas = sc.nextInt();
        
        Problema_2_EquivalenteHoraBase EquivalenteHora = new Problema_2_EquivalenteHoraBase(horas);
        
        System.out.println("\n=== RESULTADOS DE LA CONVERSIÓN ===");
        System.out.println(EquivalenteHora);
        
        sc.close();
    }
}