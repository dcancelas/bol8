package bol8_03;
import java.util.Scanner;

public class Bol8_03 {
    public static void main(String[] args) {
        System.out.println(
        "\n╔═══════════════════════════════════════════════════════╗"+
        "\n║                  Días del mes (2019)                  ║"+
        "\n╠═══════════════════════════════════════════════════════╣"+
        "\n║ 1. Enero     4. Abril   7. Julio        10. Octubre   ║"+
        "\n║ 2. Febrero   5. Mayo    8. Agosto       11. Noviembre ║"+
        "\n║ 3. Marzo     6. Junio   9. Septiembre   12. Diciembre ║"+
        "\n╚═══════════════════════════════════════════════════════╝");
        Scanner sc = new Scanner(System.in);
            System.out.print("Selecciona un mes: ");
                int select = sc.nextInt();
            sc.close();
        
        Ano2019 obx = new Ano2019(select);
            obx.selectMes();
            obx.mostrarDias();
    }
}