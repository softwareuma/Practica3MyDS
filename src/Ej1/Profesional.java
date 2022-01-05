package Ej1;

import Ej1.Acceso;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Profesional {

    private List<Acceso> listaAccesos;
    public int id;

    public Profesional (int id){
        this.id = id;
        listaAccesos = new ArrayList<Acceso>();
    }

    void addAcceso(Acceso a){
        assert a!=null;

        listaAccesos.add(a);
    }

    void rmAcceso(Acceso a){
        assert a!=null;

        listaAccesos.remove(a);
    }

    public Enumeration<Acceso> getAcceso(){
        return java.util.Collections.enumeration(listaAccesos);
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "id=" + this.id +
                "listaAccesos=" + listaAccesos.toString() +
                '}';
    }
}
