package Ej3;

import java.util.Enumeration;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Bandeja {

    private Estado estado;
    private int capacidad;
    Stack<Pieza> piezas;

    public Bandeja(int cap) {
        assert cap > 0;
        estado = new Empty(this);
        setCapacidad(cap);
        setPiezas(new Stack<>());
    }

    public void put(Pieza p) {
        estado.put(p);
    }

    public Pieza get() {
        return estado.get();
    }

    public Integer size() {
        return estado.size();
    }

    public int getCapacidad() {
        return capacidad;
    }

    private void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Enumeration<Pieza> getPiezas() {
        return java.util.Collections.enumeration(piezas);
    }

    void setPiezas(Stack<Pieza> piezas) {
        this.piezas = piezas;
    }

    public Estado getEstado() {
        return estado;
    }

    void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Bandeja{" +
                "estado=" + estado.toString() +
                ", capacidad=" + capacidad +
                ", piezas=" + piezas.toString() +
                '}';
    }
}
