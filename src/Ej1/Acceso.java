package Ej1;

import java.util.Date;
import java.util.Enumeration;

public class Acceso {

    private Date fecha;
    private TipoAcceso tipo;
    private Profesional profesional;
    private Expediente expediente;


    public Acceso (Profesional p, Expediente e, Date f, TipoAcceso t){
        assert p!=null;
        assert e!=null;
        assert noDups(p,e);
        fecha = f;
        tipo = t;
        setProfesional(p);
        setExpediente(e);
        p.addAcceso(this);
        e.addAcceso(this);
    }

    private boolean noDups(Profesional p, Expediente e) {

        Enumeration<Acceso> enumA = p.getAcceso();
        boolean dupFound = false;
        while(!dupFound && enumA.hasMoreElements()){
            Acceso a = enumA.nextElement();
            if(a.getExpediente() == e)
                dupFound=true;
        }
        return !dupFound;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TipoAcceso getTipo() {
        return tipo;
    }

    public void setTipo(TipoAcceso tipo) {
        this.tipo = tipo;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    private void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    private void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }


    @Override
    public String toString() {
        return "Acceso{" +
                "fecha=" + fecha.toString() +
                ", tipo=" + tipo.toString() +
                ", profesional=" + profesional.id +
                ", expediente=" + expediente.id +
                '}';
    }

}
