public class Problema_8_ChequeEjecutor {
    public static void main(String[] args) {
        String nombreCliente, nombreBanco;
        double valorCheque;
        String clientes[] = {"Sebastian Gonzalez", "Ana Torres", "Martín Ruiz"};
        String bancos[] = {"Banco de Loja", "Banco Pichincha", "Produbanco"};
        
        nombreCliente = clientes[(int) (Math.random() * clientes.length)];
        nombreBanco = bancos[(int) (Math.random() * bancos.length)];
        valorCheque = 500 + Math.random() * 9500;
        
        Problema_8_ChequeBase cheque1 = new Problema_8_ChequeBase(nombreCliente,
                nombreBanco, valorCheque);
        
        System.out.println("===        CHEQUE        ===");
        System.out.println("=== DETALLES DEL CLIENTE ===");
        System.out.println(cheque1);
    }
}