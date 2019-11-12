package bol8_02;
import java.util.Scanner;

public class Bol8_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nInsterte o prezo do artículo: ");
                float prezoUnit = sc.nextFloat();
            System.out.print("Inserte o número de unidades: ");
                int unidades = sc.nextInt();
            sc.close();
        
        Metodos obx = new Metodos(prezoUnit, unidades);
            obx.calcularPrezoT();
            obx.calcularPrezoF();
            obx.mostrarDatos();
    }
}