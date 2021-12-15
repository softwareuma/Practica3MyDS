package Ej1;

import Ej1.Expediente;

public class Diagnostico {

    Expediente expediente;
    Paciente paciente;

    public Diagnostico(Expediente e, Paciente p){
        expediente = e;
        paciente = p;
        p.addExpediente(this);
        e.setPaciente(this);
    }

    public void remove(){
        expediente.setPaciente(null);
        paciente.rmExpediente(this);
    }

}
