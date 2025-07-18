public class Main {
    public static void main(String[] args) {
        Archivo.escribir("ar.txt", "hello world\n");
        int i = Archivo.contar("ar.txt");
        System.out.println(i);
    }
}
