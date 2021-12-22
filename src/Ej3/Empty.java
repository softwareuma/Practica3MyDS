package Ej3;

public class Empty extends Estado {


    public Empty(Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    public void put(Pieza p) {
        if (bandeja.getCapacidad() > 1) {
            bandeja.setEstado(new Normal(bandeja));
        } else {
            bandeja.setEstado(new Full(bandeja));
        }
        bandeja.piezas.push(p);
        p.setBandeja(bandeja);

    }

    @Override
    public Pieza get() {
        assert size() > 0;
        Pieza p = bandeja.piezas.pop();
        p.setBandeja(null);
        return p;
    }

    @Override
    public String toString() {
        return "Empty";
    }
}
