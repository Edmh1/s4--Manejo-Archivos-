import java.io.*;

public class Archivo {

    public static void crearArchivo(String ubicacion){
        File file = new File(ubicacion);

        try {
            FileWriter escribir = new FileWriter(file);
            escribir.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribir(String ubicacion, String texto){
        File file = new File(ubicacion);

        try {
            FileWriter escribir = new FileWriter(file,true);
            escribir.write(texto);
            escribir.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String leer(String ubicacion){
        File file = new File(ubicacion);

        try {
            BufferedReader leer = new BufferedReader(new FileReader(file));
            String out = leer.readLine();
            String tem = out;
            while (tem != null){
                tem = leer.readLine();
                out += tem;
            }
            leer.close();
            return out;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
