package cl.llanquihuetour.digitalizacion.model;

public class Provedor {

    String nombreProvedor;

    String TipoDeProvedor;

    Direccion direccion;

    public Provedor(String nombreProvedor, String tipoDeProvedor, Direccion direccion) {
        this.nombreProvedor = nombreProvedor;
        this.TipoDeProvedor = tipoDeProvedor;
        this.direccion = direccion;
    }

    public String getNombreProvedor() {
        return nombreProvedor;
    }

    public void setNombreProvedor(String nombreProvedor) {
        this.nombreProvedor = nombreProvedor;
    }

    public String getTipoDeProvedor() {
        return TipoDeProvedor;
    }

    public void setTipoDeProvedor(String tipoDeProvedor) {
        TipoDeProvedor = tipoDeProvedor;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre Del Provedor:'" + nombreProvedor + '\'' +
                ", Tipo De Provedor:'" + TipoDeProvedor + '\'' +
                direccion;
    }
}
