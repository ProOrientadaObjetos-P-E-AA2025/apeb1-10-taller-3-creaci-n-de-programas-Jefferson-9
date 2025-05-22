import java.util.Scanner;
public class Problema_3_InstitucionesEducativasEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, tipoInstitucion;
        int numeroAlumnos, numeroDocentes, numeroSedes;
        double gastoProyecPorEstudiante;
        
        System.out.println("=== ADMINISTRADOR DE INSTITUCIONES EDUCATIVAS ===");
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Tipo de institución: ");
        tipoInstitucion = sc.nextLine();
        System.out.print("Número de alumnos: ");
        numeroAlumnos = sc.nextInt();
        System.out.print("Número de docentes: ");
        numeroDocentes = sc.nextInt();
        System.out.print("Número de sedes: ");
        numeroSedes = sc.nextInt();
        System.out.print("Gasto proyectado por estudiante: $");
        gastoProyecPorEstudiante = sc.nextInt();
        
        Problema_3_InstitucionesEducativasBase Institucion1 = new Problema_3_InstitucionesEducativasBase(
                nombre, tipoInstitucion, numeroAlumnos, numeroDocentes, numeroSedes, gastoProyecPorEstudiante);
        
        Institucion1.calcularPresupuesto();
        
        System.out.println("\n----------------------------------");
        System.out.println(Institucion1);
        sc.close();
    }
}