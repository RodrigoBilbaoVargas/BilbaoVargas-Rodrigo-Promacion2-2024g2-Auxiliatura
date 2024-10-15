package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<String> items;

    public Inventario() {
        items = new ArrayList<>();
    }

    public void agregarItem(String item) {
        items.add(item);
    }

    public void mostrarItems() {
        System.out.println("Items en el inventario:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}

class Personaje {
    private String nombre;
    Inventario inventario;

    public Personaje(String nombre) {
        this.nombre = nombre;
        inventario = new Inventario(); // Se crea el inventario en el constructor del personaje
    }

    public void mostrarInventario() {
        System.out.println("Inventario de " + nombre + ":");
        inventario.mostrarItems();
    }
}
