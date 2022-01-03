package Ej3;

public abstract class Estado {
    protected Bandeja bandeja;

    public Estado(Bandeja bandeja) {
        this.bandeja = bandeja;
    }

    public abstract void put(Pieza p);

    public abstract Pieza get();

    public Integer size() {
        return bandeja.piezas.size();
    }

}
