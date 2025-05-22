public class Problema_8_ChequeBase {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;
    
    public Problema_8_ChequeBase(String nombreCliente, String nombreBanco,
            double valorCheque){
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
        calcularComision();
    }
    
    public void calcularComision(){
        comisionBanco = valorCheque * 0.003;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombreCliente +
               "\nNombre del Banco: " + nombreBanco +
               "\nValor del cheque: $" + String.format("%.2f", valorCheque) +
               "\nComisión del Banco: $" + String.format("%.2f", comisionBanco);
    }
}