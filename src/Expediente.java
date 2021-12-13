import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Expediente {

    private List<Acceso> listaAccesos;
    private Diagnostico paciente;

    public Expediente (){
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

    public Diagnostico getPaciente() {
        return paciente;
    }

    public void setPaciente(Diagnostico paciente) {
        this.paciente = paciente;
    }
}
