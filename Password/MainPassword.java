
import java.util.Scanner;
public class MainPassword {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Introducimos el tamaño del array y la longitud del password
        System.out.println("introduce un tamaño para el arreglo para almacenar las contraseñas");
        int tamaño = sc.nextInt();
        System.out.println("Introduce la longitud de la contraseña: ");
        int longitud = sc.nextInt();
       
        //Creamos los arrays
        Password listaPassword[]=new Password[tamaño];
        boolean fortalezaPassword[]=new boolean[tamaño];
 
        //Creamos objetos, indicamos si es fuerte y mostramos la contraseña y su fortaleza.
        for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Password(longitud);
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContraseña()+" "+fortalezaPassword[i]);
        }
    }
 
}