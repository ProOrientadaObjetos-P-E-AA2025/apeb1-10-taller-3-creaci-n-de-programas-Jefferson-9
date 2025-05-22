public class Problema_5_EstudianteControlador {
    private Problema_5_EstudianteBase estudiante;
    private Problema_5_EstudianteVista vista;
    
    public Problema_5_EstudianteControlador(Problema_5_EstudianteBase estudiante,
            Problema_5_EstudianteVista vista){
        this.estudiante = estudiante;
        this.vista = vista;
    }
    
    public void mostrarInformación() {
        String informacion = estudiante.toString();
        vista.mostrarInformacion(informacion);
    }
}
