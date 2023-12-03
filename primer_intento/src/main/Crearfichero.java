package bmt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try{
            String nombre1 = "miarchivo"; //Especificamos el nombre del fichero

            File archivo = new File(nombre1); // Creamos el objeto donde vamos a guardar el fichero

            FileWriter escritor = new FileWriter(archivo); //Crea un objeto para escribir en el archivo

            escritor.write("Hola este es el primer mensaje"); // Escribimos el texto que queremos que aparezca en el fichero

            escritor.close(); // Cerramos el fichero

            System.out.println("Ya hemos escrito en el fichero!");
        } catch(IOException e) {
            System.out.println("Lo siento pero ha habido un error"); // En el caso de que ocurra cualquier error, lo mencionamos
            e.printStackTrace();
        }
    }
}
