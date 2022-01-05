package Ej2;

public class Activo extends Trabajador {

    public Activo(String nombre, String numSeg, double sal) {

        super(nombre, numSeg, sal);
    }

    public void incrementar() {
        salario = salario*1.02;
    }

}
