public class Problema_5_EstudianteBase {
    
    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    private String estado;
   
    public Problema_5_EstudianteBase(String nombre, double calificacion1,
          double calificacion2, double calificacion3){
        this.nombre = nombre;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
        calcularPromedio();
        determinarEstado();
    }
    
    private void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }
    
    private void determinarEstado() {
        estado = (promedio >= 6.5) ? "Aprobado" : "Reprobado";
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nCalificación 1: " + calificacion1 +
               "\nCalificación 2: " + calificacion2 +
               "\nCalificación 3: " + calificacion3 +
               "\nPromedio: " + String.format("%.2f", promedio) +
               "\nEstado: " + estado;
    }
}