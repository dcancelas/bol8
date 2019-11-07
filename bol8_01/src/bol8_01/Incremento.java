package bol8_01;

public class Incremento {

    private float cant;
    private float cantf;
    private float incr;

    public Incremento() {

    }
    public Incremento(float cant) {
        this.cant = cant;
    }

    public void setCant(float cant) {
        this.cant = cant;
    }
    public float getCant() {
        return cant;
    }
    public void setInc(float inc) {
        this.incr = inc;
    }
    public float getInc() {
        return incr;
    }

    public void calcularCantf() {
        cantf = (cant + ((incr / 100) * cant));
    }
    public void mostrarTodo() {
        System.out.println(
            "\nCantidade: "+cant+
            "\nIncremento: "+(int)incr+"%"+
            "\nCantidade final: "+cantf);
    }

}