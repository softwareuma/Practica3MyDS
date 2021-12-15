package Ej1;

import Ej1.Acceso;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Profesional {

    private List<Acceso> listaAccesos;

    public Profesional (){
        listaAccesos = new ArrayList<Acceso>();
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

}
