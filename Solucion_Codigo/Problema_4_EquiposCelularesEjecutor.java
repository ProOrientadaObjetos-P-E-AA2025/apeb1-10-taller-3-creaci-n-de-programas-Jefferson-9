public class Problema_4_EquiposCelularesEjecutor {
    public static void main(String[] args) {
        
        Problema_4_EquiposCelularesBase celular = new Problema_4_EquiposCelularesBase(
        "iOS", 6.5, 999.99, 15.0, "00:3A:2B:3C:7D:8E", "126451789412345");
        
        Problema_4_ControladorEquipoCelular controlador = new Problema_4_ControladorEquipoCelular(
        celular);
        
        controlador.procesarInformacion();
        
        System.out.println("=== DETALLES DEL EQUIPO ===\n");
        System.out.println(controlador.obtenerInformacion());
    }
}