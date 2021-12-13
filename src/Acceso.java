import java.util.Date;

public class Acceso {

    public enum TipoAcceso
    {
        consulta, modificacion, creacion, archivo
    }

    private Date fecha;
    private TipoAcceso tipo;

}
