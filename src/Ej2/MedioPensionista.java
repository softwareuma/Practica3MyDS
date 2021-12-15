package Ej2;

public class MedioPensionista implements Pensionista,Activo{

    private String nombre;
    private String numeroSeguridadSocial;
    protected double salario;

    public MedioPensionista(String nom, String numSS, double r){
        setNombre(nom);
        setNumeroSeguridadSocial(numSS);
    }

    public double Nomina(){
        return salario;
    }

    public void incrementar(){}

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    private void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
