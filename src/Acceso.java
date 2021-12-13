import java.util.Date;

public class Acceso {

    private Date fecha;
    private TipoAcceso tipo;
    Profesional profesional;
    Expediente expediente;


    public Acceso (Profesional p, Expediente e, Date f, TipoAcceso t){
        fecha = f;
        tipo = t;
        profesional = p;
        expediente = e;
        p.addAcceso(this);
        e.addAcceso(this);
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


}
