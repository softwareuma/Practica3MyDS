package Ej2;

public class MedioPensionista extends Trabajador{

    private Activo a;
    private Pensionista p;

    public MedioPensionista(String nombre, String numSeg, double salActivo, double salPensionista) {
        super(nombre, numSeg, salActivo+salPensionista);
        setActivo(new Activo(nombre,numSeg,salActivo));
        setPensionista(new Pensionista(nombre,numSeg,salPensionista));
    }

    @Override
    public double nomina() {
        return getActivo().nomina() + getPensionista().nomina();
    }

    @Override
    public void incrementar() {
        getActivo().incrementar();
        getPensionista().incrementar();
        setSalario(nomina());
    }

    private Activo getActivo() {
        return a;
    }

    private void setActivo(Activo a) {
        assert a!=null;

        this.a = a;
    }

    private Pensionista getPensionista() {
        return p;
    }

    private void setPensionista(Pensionista p) {
        assert p!=null;
        
        this.p = p;
    }
}
