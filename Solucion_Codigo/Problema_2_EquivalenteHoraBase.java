public class Problema_2_EquivalenteHoraBase {
    private int horas;
    private int minutos;
    private int segundos;
    private int dias;
    
    public Problema_2_EquivalenteHoraBase(int horas){
        this.horas = horas;
        calcularEquivalente();
    }
    
    public void calcularEquivalente(){
        dias = horas / 24;
        minutos = horas * 60;
        segundos = horas * 3600;
    }
    
    @Override
    public String toString(){
        return "Lo equivalente de " + horas + " horas:\n" +
                "-- " + dias + " días\n" +
                "-- " + minutos + " minutos\n" +
                "-- " + segundos + " segundos\n";
    }
}