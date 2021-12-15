package Ej1;

import Ej1.Diagnostico;
import Ej1.Expediente;
import Ej1.Factory;

public class Main {
    public static void main(String[] args) {

        Paciente p= Factory.CrearPaciente();
        p.addExpediente(new Diagnostico(new Expediente(),p));
        System.out.println("Paciente " + p.toString() + " creado con expediente + " + p.getExpediente().toString());


    }
}
