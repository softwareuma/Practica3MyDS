package Ej1;

import Ej1.Acceso;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Expediente {

    public int id;
    private List<Acceso> listaAccesos;
    private Diagnostico diagnostico;

    public Expediente (int id){
        this.id = id;
        listaAccesos = new ArrayList<Acceso>();
        diagnostico = new Diagnostico(this, new Paciente(id));
    }

    public Expediente (int id, Paciente p){
        this.id = id;
        p.setExpedienteAbierto(this);
        listaAccesos = new ArrayList<Acceso>();
        diagnostico = new Diagnostico(this,p);
    }


    void addAcceso(Acceso a){
        listaAccesos.add(a);
    }

    void rmAcceso(Acceso a){
        listaAccesos.remove(a);
    }

    public Enumeration<Acceso> getAcceso(){
        return java.util.Collections.enumeration(listaAccesos);
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "Expediente{" +
                "id=" + id +
                ", listaAccesos=" + listaAccesos +
                ", diagnostico=" + diagnostico +
                '}';
    }
}
