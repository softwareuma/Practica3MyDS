import java.util.Date;

public class Acceso {

    public enum TipoAcceso
    {
        consulta, modificacion, creacion, archivo
    }

    private Date fecha;
    private TipoAcceso tipo;
    Profesional profesional;
    Expediente expediente;


    public Acceso (Profesional p, Expediente e, Date f, TipoAcceso t){
        fecha = f;
        tipo = t;
        profesional = p;
        expediente = e;
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
