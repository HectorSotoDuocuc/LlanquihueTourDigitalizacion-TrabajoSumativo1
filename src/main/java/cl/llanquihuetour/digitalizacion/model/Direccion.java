package cl.llanquihuetour.digitalizacion.model;

public class Direccion {

    private String calle;

    private int numero;

    private String comuna;

    private String provincia;

    public Direccion(String calle, int numero, String comuna, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return  " Direccion:'" + calle + '\'' +
                ", numero:" + numero +
                ", comuna:'" + comuna + '\'' +
                ", provincia:'" + provincia + '\'';
    }
}
