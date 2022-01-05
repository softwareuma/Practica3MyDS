package Ej1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Paciente {

    public int id;
    private List<Diagnostico> listaExpedientes;
    private Expediente expedienteAbierto;

    Paciente(int id) {
        this.id = id;
        listaExpedientes = new ArrayList<Diagnostico>();
    }

    void addExpediente(Diagnostico a){
        assert a!=null;

        listaExpedientes.add(a);
    }

    void rmExpediente(Diagnostico a){
        assert a!=null;

        listaExpedientes.remove(a);
    }

    public Enumeration<Diagnostico> getExpediente(){
        return java.util.Collections.enumeration(listaExpedientes);
    }

    public Expediente getExpedienteAbierto() {
        return expedienteAbierto;
    }

    void setExpedienteAbierto(Expediente expedienteAbierto) {
        this.expedienteAbierto = expedienteAbierto;
    }

    public void cerrarExpedienteAbierto() {
        this.expedienteAbierto = null;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", listaExpedientes=" + listaExpedientes.toString() +
                ", expedienteAbierto=" + expedienteAbierto +
                '}';
    }
}
