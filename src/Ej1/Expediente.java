package Ej1;

import Ej1.Acceso;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Expediente {

    private List<Acceso> listaAccesos;
    private Diagnostico diagnostico;

    public Expediente (){
        listaAccesos = new ArrayList<Acceso>();
        diagnostico = new Diagnostico(this, new Paciente());
    }

    public Expediente (Paciente p){
        listaAccesos = new ArrayList<Acceso>();
        diagnostico = new Diagnostico(this,p);
    }

    protected void addAcceso(Acceso a){
        listaAccesos.add(a);
    }

    protected void rmAcceso(Acceso a){
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
}
