package cl.llanquihuetour.digitalizacion.model;

import cl.llanquihuetour.digitalizacion.excepciones.Excepciones;

public class Cliente extends Persona{

    private String fechaDeReserva;

    private int precioApagar;

    private Direccion direccion;

    public Cliente(String nombre, String rut, int edad, String fechaDeReserva, int precioApagar, Direccion direccion) throws Excepciones {
        super(nombre, rut, edad);
        this.fechaDeReserva = fechaDeReserva;
        this.precioApagar = precioApagar;
        this.direccion = direccion;

    }

    public String getFechaDeReserva() {
        return fechaDeReserva;
    }

    public void setFechaDeReserva(String fechaDeReserva) {
        fechaDeReserva = fechaDeReserva;
    }

    public int getPrecioApagar() {
        return precioApagar;
    }

    public void setPrecioApagar(int precioApagar) {
        precioApagar = precioApagar;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return super.toString() +", Tipo:Cliente " +
                ", FechaDeReserva:" + fechaDeReserva + '\'' +
                ", PrecioApagar:" + precioApagar +
                 direccion;
    }
}
