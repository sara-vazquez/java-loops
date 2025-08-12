package dev.sara;
import java.util.ArrayList;
import java.util.List;

public class Tabla {
    
    public static List<String> generarTabla(int n) {

        List<String> tabla = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            tabla.add(n + " x " + i + " = " + (n * i));
        }
        return tabla;
    }

}