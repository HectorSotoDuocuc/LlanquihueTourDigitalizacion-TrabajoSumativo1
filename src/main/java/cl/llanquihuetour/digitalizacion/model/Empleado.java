package cl.llanquihuetour.digitalizacion.model;

import cl.llanquihuetour.digitalizacion.excepciones.Excepciones;

public class Empleado extends Persona {

    private String empleadoExternooInterno;

    private String profesion;

    private Operador operador;

    private Direccion direccion;

    public Empleado(String nombre, String rut, int edad, String empleadoExternooInterno, String profesion, Operador operador, Direccion direccion) throws Excepciones {
        super(nombre, rut, edad);
        this.empleadoExternooInterno = empleadoExternooInterno;
        this.profesion = profesion;
        this.operador = operador;
        this.direccion = direccion;
    }

    public String getEmpleadoExternooInterno() {
        return empleadoExternooInterno;
    }

    public void setEmpleadoExternooInterno(String empleadoExternooInterno) {
        this.empleadoExternooInterno = empleadoExternooInterno;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado:" +
                ", empleadoExternooInterno:" + empleadoExternooInterno + '\'' +
                ", profesion: " + profesion + '\'' +
                operador + '\'' + direccion;
    }
}
