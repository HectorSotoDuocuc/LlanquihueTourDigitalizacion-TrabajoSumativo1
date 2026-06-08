package cl.llanquihuetour.digitalizacion.app;

import cl.llanquihuetour.digitalizacion.model.*;

public class Main {
    static void main(String[] args) {

        try {
            Direccion direccion = new Direccion("flornevada",545,"Cerrillos","Santiago");

            Direccion direccionProvedor = new Direccion("Diego Portales", 3334, "Llanquihue", "Llanquihue");

            Direccion direccionEmpleado = new Direccion("Mangorida", 411,"Puerto Mont", "Puerto Mont");

            Persona cliente = new Cliente("Ana", "12040913-1", 42, "23/11/2026", 24000, direccion);

            Provedor provedor = new Provedor("LaTiaRosita", "Alimentos", direccionProvedor);

            Operador operador = new Operador("LLanquihue Tour","Tour");

            Persona empleado = new Empleado("Pablo", "21028403-K", 22,"Interno","Guia", operador, direccionEmpleado);

            System.out.println(cliente.toString());

            System.out.println(provedor.toString());

            System.out.println(empleado.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

