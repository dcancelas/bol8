package bol8_01;
import java.util.Scanner;

public class Bol8_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nIntroduce una cantidad: ");
                float cant = sc.nextFloat();
            sc.close();
        
        Incremento inc = new Incremento(cant);
            if(cant < 500) {
                inc.setInc(50);
                inc.calcularCantf();
            }
            if((cant >= 500) && (cant < 1000)) {
                inc.setInc(7);
                inc.calcularCantf();
            }
            if((cant >= 1000) && (cant <= 5000)) {
                inc.setInc(15);
                inc.calcularCantf();
            }
            if(cant > 5000) {
                inc.setInc(-3);
                inc.calcularCantf();
            }
            inc.mostrarTodo();
    }
}