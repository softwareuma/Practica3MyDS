import Ej1.*;

import java.util.Date;
import java.util.Enumeration;

public class MainEj1 {
    public static void main(String[] args) {

        System.out.println("-------------------PRUEBA PACIENTE-EXPEDIENTE-------------------");

        Expediente e1 = new Expediente(1);
        Paciente p1 = e1.getDiagnostico().getPaciente();

        Expediente e2 = new Expediente(2, p1);

        Expediente e3 = new Expediente(3, p1);
        Expediente e4 = new Expediente(4);
        Paciente p2 = e4.getDiagnostico().getPaciente();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        p1.cerrarExpedienteAbierto();
        System.out.println(p1.toString());

        System.out.println("-------------------PRUEBA PROFESIONAL-EXPEDIENTE-------------------");

        Profesional pro1 = new Profesional(1);
        Acceso a1 = new Acceso(pro1, e1, new Date(), TipoAcceso.consulta);
        Acceso a2 = new Acceso(pro1, e1, new Date(), TipoAcceso.archivo);
        System.out.println(pro1);
        System.out.println(e1);

    }
}
