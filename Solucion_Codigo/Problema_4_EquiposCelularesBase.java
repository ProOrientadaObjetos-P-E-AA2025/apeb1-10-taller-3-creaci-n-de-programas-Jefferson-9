public class Problema_4_EquiposCelularesBase {
    private String sistemaOperativo;
    private double tamanoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String informacionImei;
    
    public Problema_4_EquiposCelularesBase(String sistemaOperativo,
            double tamanoPantalla, double costoInicial, double ivaPorcentaje,
            String direccionMac, String informacionImei){
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.informacionImei = informacionImei;
    }
    
    public void calcularIvaCostoInicial(){
        ivaCostoInicial = (costoInicial * ivaPorcentaje)/ 100;
    }
    
    public void calcularCostoFinal(){
        costoFinal = costoInicial + ivaCostoInicial;
    }
    
    @Override
    public String toString(){
        return String.format("Sistema operativo: %s\n"
                + "Tamaño pantalla: %.2f pulgadas\n"
                + "Costo inicial: $%.2f\n"
                + "IVA porcentaje: %.2f%%\n"
                + "IVA del costo inicial: $%.2f\n"
                + "Costo final: $%.2f\n"
                + "Dirección MAC: %s\n"
                + "Información IMEI: %s\n", sistemaOperativo,
                tamanoPantalla, costoInicial, ivaPorcentaje,
                ivaCostoInicial, costoFinal, direccionMac,
                informacionImei);
    }
}