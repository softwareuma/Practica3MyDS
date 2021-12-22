package Ej3;

public class Normal extends Estado {
    public Normal(Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    public void put(Pieza p) {
        if (size() < bandeja.getCapacidad()-1) {
            bandeja.setEstado(new Normal(bandeja));
        } else {
            bandeja.setEstado(new Full(bandeja));
        }
        bandeja.piezas.push(p);
        p.setBandeja(bandeja);
    }

    @Override
    public Pieza get() {
        if (size() > 1) {
            bandeja.setEstado(new Normal(bandeja));
        } else {
            bandeja.setEstado(new Empty(bandeja));
        }
        Pieza p = bandeja.piezas.pop();
        p.setBandeja(null);

        return p;
    }

    @Override
    public String toString() {
        return "Normal";
    }
}
