public class Problema_1_TerrenoBase {
    private double ancho;
    private double largo;
    private double valorMetroCuadrado;
    private double area;
    private double costo_Terreno;

    public Problema_1_TerrenoBase(double ancho, double largo, double valorMetroCuadrado){
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public void setAncho(double ancho){
        this.ancho = ancho;
    }

    public double getAncho(){
        return ancho;
    }

    public void setLargo(double largo){
        this.largo = largo;
    }

    public double getLargo(){
        return largo;
    }

    public void setValorMetroCuadrado(double valor){
        this.valorMetroCuadrado = valor;
    }

    public double getValorMetroCuadrado(){
        return valorMetroCuadrado;
    }

    //Métodos para calcular el área y costo del terreno
    public double calcularArea(){
        area = ancho * largo;
        return area;
    }

    public double getArea(){
        return area;
    }

    public void calcularCostoTerreno(){
        costo_Terreno = area * valorMetroCuadrado;
    }

    public double getCosto_Terreno(){
        return costo_Terreno;
    }

    @Override
    public String toString(){
        return "Terreno: \n" 
        + "Ancho: " + ancho + " metros\n"
        + "Largo: " + largo + " metros\n"
        + "Valor del metro cuadrado: $" + valorMetroCuadrado + "\n"
        + "Área: " + area + " metros cuadrados\n"
        + "Costo del terreno: $" + costo_Terreno + "\n";
    }
}