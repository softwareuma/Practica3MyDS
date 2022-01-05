package Ej3;

public class Pieza {

    public int id;
    private Bandeja bandeja;

    public Pieza(int id) {
        this.id = id;
    }

    public Bandeja getBandeja() {
        return bandeja;
    }

    void setBandeja(Bandeja bandeja) {
        assert bandeja!=null;

        this.bandeja = bandeja;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "id=" + id +
                '}';
    }
}
