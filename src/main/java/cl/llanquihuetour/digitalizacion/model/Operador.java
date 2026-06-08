package cl.llanquihuetour.digitalizacion.model;

public class Operador {

    private String NombreDeLaEmpresa;

    private String TipoDeServicio;

    public Operador(String nombreDeLaEmpresa, String tipoDeServicio) {
        NombreDeLaEmpresa = nombreDeLaEmpresa;
        TipoDeServicio = tipoDeServicio;
    }

    public String getNombreDeLaEmpresa() {
        return NombreDeLaEmpresa;
    }

    public void setNombreDeLaEmpresa(String nombreDeLaEmpresa) {
        NombreDeLaEmpresa = nombreDeLaEmpresa;
    }

    public String getTipoDeServicio() {
        return TipoDeServicio;
    }

    public void setTipoDeServicio(String tipoDeServicio) {
        TipoDeServicio = tipoDeServicio;
    }

    @Override
    public String toString() {
        return "Operador: " +
                ", NombreDeLaEmpresa: " + NombreDeLaEmpresa + '\'' +
                ", TipoDeServicio: " + TipoDeServicio;
    }
}
