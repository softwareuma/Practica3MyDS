package Ej1;

import Ej1.Expediente;

public class Diagnostico {

    private Expediente expediente;
    private Paciente paciente;

    Diagnostico(Expediente e, Paciente p){
        assert e!=null;
        assert p!=null;

        setExpediente(e);
        setPaciente(p);
        p.addExpediente(this);
        e.setDiagnostico(this);
    }

    void remove(){

        expediente.setDiagnostico(null);
        paciente.rmExpediente(this);
        setPaciente(null);
        setExpediente(null);

        assert expediente==null;
        assert paciente==null;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    private void setExpediente(Expediente expediente) {
        assert expediente!=null;

        this.expediente = expediente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    private void setPaciente(Paciente paciente) {
        assert paciente!=null;

        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Diagnostico{" +
                "expediente=" + expediente.id +
                ", paciente=" + paciente.id +
                '}';
    }
}
