import Ej3.Bandeja;
import Ej3.Pieza;

public class MainEj3 {

    public static void main(String[] args) {

        Bandeja b = new Bandeja(3);
        System.out.println(b);
        b.put(new Pieza(1));
        System.out.println(b);
        b.put(new Pieza(2));
        System.out.println(b);
        b.put(new Pieza(3));
        System.out.println(b);

        b.get(); //2
        System.out.println(b);
        b.get(); //1
        System.out.println(b);
        b.get(); //0
        System.out.println(b);
    }
}
