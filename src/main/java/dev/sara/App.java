package dev.sara;

import java.util.List;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        List<String> tabla = Tabla.generarTabla(3);
        tabla.forEach(System.out::println);
    }
}
