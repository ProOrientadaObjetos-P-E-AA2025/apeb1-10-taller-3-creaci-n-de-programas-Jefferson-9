public class Problema_4_ControladorEquipoCelular {
    private Problema_4_EquiposCelularesBase equipo;
    
    public Problema_4_ControladorEquipoCelular(Problema_4_EquiposCelularesBase equipo){
        this.equipo = equipo;
    }
    
    public void procesarInformacion(){
        equipo.calcularIvaCostoInicial();
        equipo.calcularCostoFinal();
    }
    
    public String obtenerInformacion(){
        return equipo.toString();
    }
}