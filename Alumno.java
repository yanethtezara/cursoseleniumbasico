package clase6;

public class Alumno extends Persona {

    private String curso;

    public Alumno(String unNombre, int unDni){
        super(unNombre, unDni);
        this.curso = "Sin asignar";
    }

    public Alumno(String unNombre, int unDni, String unCurso){
        super(unNombre, unDni);
        this.curso= unCurso;
    }

    public void setCurso(String unCurso){
        this.curso = unCurso;
    }

    public String getCurso(){
        return this.curso;
    }

    public String toString(){
        if (this.curso.equals("Sin asignar")){
            return "El alumno " + this.nombre + " tiene DNI " + this.dni + " y no tiene curso asignado";
        } else {
            return "El alumno " + this.nombre + " tiene DNI " + this.dni + " y cursa " + this.curso;
        }
    }
}



