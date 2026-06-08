package cl.llanquihuetour.digitalizacion.model;

import cl.llanquihuetour.digitalizacion.excepciones.Excepciones;

public class Persona {

    private String nombre;

    private String rut;

    private int edad;

    private Cliente cliente;

    private Empleado empleado;

    public Persona(String nombre, String rut, int edad) throws Excepciones{

        if(!rut.matches("[0-9]+-[0-9kK]")){
            throw new Excepciones("Rut Invalido, verifique formato");
        }
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + '\'' +
                ", Rut: " + rut + '\'' +
                ", Edad: " + edad;
    }
}


