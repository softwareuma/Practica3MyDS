package Ej2;

public class Pensionista extends Trabajador{

    public Pensionista(String nombre, String numSeg, double sal) {
        super(nombre, numSeg, sal);
    }

    public void incrementar() {
        salario = salario*1.04;
    }

}
