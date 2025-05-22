import java.util.Random;
public class Problema_5_EstudianteEjecutor {
    public static void main(String[] args) {
       Random rand = new Random ();
       String nombres[] = {"Carlos", "Pedro", "Ana", "Luis", "María"};
       String nombre = nombres[rand.nextInt(nombres.length)];
       
       double calificacion1 = 4 + rand.nextDouble() * 6;
       double calificacion2 = 4 + rand.nextDouble() * 6;
       double calificacion3 = 4 + rand.nextDouble() * 6;
       
       Problema_5_EstudianteBase estudiante = new Problema_5_EstudianteBase(
       nombre, calificacion1, calificacion2, calificacion3);
       
       Problema_5_EstudianteVista vista = new Problema_5_EstudianteVista();
       
       Problema_5_EstudianteControlador controlador = new Problema_5_EstudianteControlador(
       estudiante, vista);
       
       System.out.println("=== DETALLES DEL ESTUDIANTE ===");
       controlador.mostrarInformación();
       
    }
}