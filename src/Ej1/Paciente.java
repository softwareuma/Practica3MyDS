package Ej1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Paciente {

    private List<Diagnostico> listaExpedientes;
    private Expediente expedienteAbierto;

    Paciente() {
        listaExpedientes = new ArrayList<Diagnostico>();
    }

    protected void addExpediente(Diagnostico a){
        listaExpedientes.add(a);
    }

    protected void rmExpediente(Diagnostico a){
        listaExpedientes.remove(a);
    }

    public Enumeration<Diagnostico> getExpediente(){
        return java.util.Collections.enumeration(listaExpedientes);
    }

    public Expediente getExpedienteAbierto() {
        return expedienteAbierto;
    }

    private void setExpedienteAbierto(Expediente expedienteAbierto) {
        this.expedienteAbierto = expedienteAbierto;
    }
}
