import java.util.Scanner;

class MainSecondsByDay {
    public static void main(String[] args) {
        Scanner seconds = new Scanner(System.in);

        double dias;

        System.out.print("INGRESE LA CANTIDAD DE DIAS: ");
        dias = seconds.nextDouble();

        SecondsByDay tiempo = new SecondsByDay();

        tiempo.setDias(dias);
        tiempo.setSegundos(86400);

        System.out.println("En  " + dias + "  DIAS HAY  " + tiempo.mostrarTiempo() + "  SEGUNDOS");

    }

}