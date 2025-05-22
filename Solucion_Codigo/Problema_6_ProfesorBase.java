public class Problema_6_ProfesorBase {
    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;
    
    public Problema_6_ProfesorBase(String nombre, String apellido, String cedula,
            double sueldoBasico){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldoBasico = sueldoBasico;
        calcularSueldoTotal();
    }
    
    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nApellido: " + apellido +
               "\nCédula: " + cedula +
               "\nSueldo básico: $" + sueldoBasico +
               "\nSueldo total: $" + String.format("%.2f", sueldoTotal);
    }
}