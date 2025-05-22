public class Problema_3_InstitucionesEducativasBase {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastoProyecPorEstudiante;
    private double presupuesto;
    
    public Problema_3_InstitucionesEducativasBase(String nombre, String tipoInstitucion,
            int numeroAlumnos, int numeroDocentes, int numeroSedes, double gastoProyecPorEstudiante){
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastoProyecPorEstudiante = gastoProyecPorEstudiante;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setTipoInstitucion(String tipoInstitucion){
        this.tipoInstitucion = tipoInstitucion;
    }
    
    public String getTipoInstitucion(){
        return tipoInstitucion;
    }
    
    public void setNumeroAlumnos(int numeroAlumnos){
        this.numeroAlumnos = numeroAlumnos;
    }
    
    public int getNumeroAlumnos(){
        return numeroAlumnos;
    }
    
    public void setNumeroDocentes(int numeroDocentes){
        this.numeroDocentes = numeroDocentes;
    }
    
    public int getNumeroDocentes(){
        return numeroDocentes;
    }
    
    public void setNumeroSedes(int numeroSedes){
        this.numeroSedes = numeroSedes;
    }
    
    public int getNumeroSedes(){
        return numeroSedes;
    }
    
    public void setGastoProyecPorEstudiante(double gastoProyecPorEstudiante){
        this.gastoProyecPorEstudiante = gastoProyecPorEstudiante;
    }
    
    public double GetGastoProyecPorEstudiante(){
        return gastoProyecPorEstudiante;
    }
    
    public void calcularPresupuesto(){
        presupuesto = numeroAlumnos * gastoProyecPorEstudiante;
    }
    
    public double getPresupuesto(){
        return presupuesto;
    }
    
    @Override
    public String toString(){
        return "Institución Educativa\n" +
                "Nombre: " + nombre + "\n" +
                "Tipo de institución: " + tipoInstitucion + "\n" +
                "Número de alumnos: " + numeroAlumnos + "\n" +
                "Número de docentes: " + numeroDocentes + "\n" +
                "Número de sedes: " + numeroSedes + "\n" +
                "Gasto proyectado por estudiante: $" + gastoProyecPorEstudiante + "\n" +
                "Presupuesto total: $" + presupuesto;
    }
}