import java.util.Scanner;

public class HolaMundo {
    //clase principal con el nombre del archivo

    //va a buscar el método MAIN
    public static void main(String[] args) throws Exception {
        //Aquí va el código principal

        //scanner (entrada de datos). Hay que importarlo
        //queda a la "escucha" de la entrada del teclado
        Scanner teclado = new Scanner(System.in); //salida información
        System.out.println("¿Cómo te llamas?");
        String nombre = teclado.nextLine(); //entrada de información
        System.out.println("¿Cómo te apellidas?");
        String apellido = teclado.nextLine();

        System.out.println("¿Cuántos años tienes?");
        int edad = teclado.nextInt();
        teclado.close(); //cierra la escucha del scanner de teclado
        System.out.println("Te llamas " + nombre + " " + apellido + " y tienes " + edad + " años.");
    }

    /* aquí se podrían añadir clases
    pero como en CSS, es mejor crear un documento aparte
    para cada clase */
}
