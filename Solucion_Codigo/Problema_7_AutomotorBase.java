public class Problema_7_AutomotorBase {
    private String cedulaDueno;
    private String marcaVehiculo;
    private int anoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    private int anoActual;
    private int antiguedad;
    
    public Problema_7_AutomotorBase(String cedulaDueno, String marcaVehiculo,
            int anoFabricacion, double valorVehiculo){
        this.cedulaDueno = cedulaDueno;
        this.marcaVehiculo = marcaVehiculo;
        this.anoFabricacion = anoFabricacion;
        this.valorVehiculo = valorVehiculo;
        calcularValorMatricula();
    }
    
    public void calcularValorMatricula(){
        anoActual = 2025;
        antiguedad = anoActual - anoFabricacion;
        valorMatricula = valorVehiculo * 0.002 * antiguedad;
    }
    
    @Override
    public String toString(){
        return "Cédula del dueño: " + cedulaDueno +
               "\nMarca del vehículo: " + marcaVehiculo +
               "\nAño de fabricación: " + anoFabricacion +
               "\nValor del vehículo: $" + valorVehiculo +
               "\nValor de la matrícula: $" + String.format("%.2f", valorMatricula);
    }
}