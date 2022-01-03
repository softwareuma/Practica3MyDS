import Ej2.Activo;
import Ej2.MedioPensionista;
import Ej2.Trabajador;

public class MainEj2 {

    public static void main(String[] args) {

        Trabajador mp = new MedioPensionista("a","123",1,1);
        System.out.println("Trabajador " + mp.getNombre() + " con numSeg " + mp.getNumeroSeguridadSocial());
        System.out.println("Nomina: " + mp.nomina());
        mp.incrementar();
        System.out.println("Nomina: " + mp.nomina());

        Trabajador activo = new Activo("act","124",1);
        System.out.println("Trabajador " + activo.getNombre() + " con numSeg " + activo.getNumeroSeguridadSocial());
        System.out.println("Nomina: " + activo.nomina());
        activo.incrementar();
        System.out.println("Nomina: " + activo.nomina());

    }

}
