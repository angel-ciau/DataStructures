package Pointers;
import java.util.HashMap;

public class Hmap {
    public static void main(String[] args) {
        HashMap<String,Integer> Datos = new HashMap<>();
        Datos.put("Edad", 19);
        Datos.put("Altura", 180);

        System.out.println(Datos);

        Datos.replace("Edad", 10);
        System.out.println(Datos);
    }
}
