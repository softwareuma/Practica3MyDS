package Ej1;

import Ej1.Expediente;

public class Factory {

    public static Paciente CrearPaciente(){

        Expediente e = new Expediente();
        Paciente p = new Paciente(e);

        return p;
    }

}
