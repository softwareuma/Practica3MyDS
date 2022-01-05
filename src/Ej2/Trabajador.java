package Ej2;

public abstract class Trabajador {

    private String nombre;
    private String numeroSeguridadSocial;
    protected double salario;

    public Trabajador(String nombre, String numSeg, double sal) {
        assert nombre!=null;
        assert numSeg!=null;
        assert sal>=0;

        setNombre(nombre);
        setNumeroSeguridadSocial(numSeg);
        setSalario(sal);
    }

    public double nomina(){
        return salario;
    }

    public abstract void incrementar();

    private void setNombre(String nombre) {
        assert nombre != null;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    private void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        assert numeroSeguridadSocial != null;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    protected void setSalario(double salario) {
        assert salario >= 0;
        this.salario = salario;
    }


}
