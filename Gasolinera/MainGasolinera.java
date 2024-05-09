import java.util.Scanner;

class MainGasolinera {
    public static void main(String[] args) {
        Scanner gasolina = new Scanner(System.in);
        float galones, litros, precio;

        System.out.println("INGRESA LOS GALONES QUE DESEA COBRAR: ");
        galones = gasolina.nextFloat();

        Gasolinera gas = new Gasolinera();

        gas.setGalones(galones);
        gas.setLitros(3.70);
        gas.setPrecio(22.80);
        System.out.println("PRCIO DE LA GASOLINA: $22.80");
        System.out.println(galones + "  GALONES  SON $" + gas.mostrarPrecio());
    }

}