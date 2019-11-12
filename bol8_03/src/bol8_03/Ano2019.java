package bol8_03;

public class Ano2019 {

    private int select;
    private String mes;
    private int dias;
    
    public Ano2019(int select) {
        this.select = select;
    }

    public void selectMes() {
        switch(select) {
            case 1:
                this.mes = "Enero";
                this.dias = 31;
                break;
            case 2:
                this.mes = "Febrero";
                this.dias = 28;
                break;
            case 3:
                this.mes = "Marzo";
                this.dias = 31;
                break;
            case 4:
                this.mes = "Abril";
                this.dias = 30;
                break;
            case 5:
                this.mes = "Mayo";
                this.dias = 31;
                break;
            case 6:
                this.mes = "Junio";
                this.dias = 30;
                break;
            case 7:
                this.mes = "Julio";
                this.dias = 31;
                break;
            case 8:
                this.mes = "Agosto";
                this.dias = 31;
                break;
            case 9:
                this.mes = "Septiembre";
                this.dias = 30;
                break;
            case 10:
                this.mes = "Octubre";
                this.dias = 31;
                break;
            case 11:
                this.mes = "Noviembre";
                this.dias = 30;
                break;
            case 12:
                this.mes = "Diciembre";
                this.dias = 31;
                break;
            default:
                System.out.println("ERROR: El número introducido no se corresponde con ningún mes");
        }
    }
    public void mostrarDias() {
        System.out.println("\n"+mes+" tiene "+dias+" días");
    }
}