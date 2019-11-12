package bol8_02;

public class Metodos {

    private float prezoUnit;
    private float unidades;
    private float prezoT;
    private float desconto;
    private float prezoF;

    
    public Metodos(float prezoUnit, int unidades) {
        this.prezoUnit = prezoUnit;
        this.unidades = (float) unidades;
    }
    public void calcularPrezoT() {
        this.prezoT = prezoUnit * unidades;
    }
    public void calcularDesconto(float desconto) {
        this.prezoF = (prezoT - ((desconto/100f)*prezoT));
        this.desconto = desconto;
    }
    public void calcularPrezoF() {
        if(unidades < 100f) {
            this.prezoF = prezoT;
        }
        if((100f<=unidades)&&(unidades<200f)) {
            if(prezoUnit > 4000f) {
                calcularDesconto(5f);
            }
            else {
                calcularDesconto(2f);
            }
        }
        if(unidades >= 200f) {
            if(prezoUnit > 4000f) {
                calcularDesconto(10f);
            }
            else {
                calcularDesconto(8f);
            }
        }
    }
    public void mostrarDatos() {
        System.out.println("\nUnidades: "+(int) unidades);
        System.out.println("Precio unitario: "+prezoUnit+"€");
        System.out.println("Desconto: "+(int) desconto+"%");
        System.out.println("Total a pagar: "+prezoF+"€");
    }

}