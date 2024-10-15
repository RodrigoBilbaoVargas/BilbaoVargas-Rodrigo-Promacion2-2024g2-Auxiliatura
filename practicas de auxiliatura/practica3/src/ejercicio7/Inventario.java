package ejercicio7;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<String> items;

    public Inventario() {
        items = new ArrayList<>();
    }

    public void agregarItem(String item) {
        items.add(item);
        System.out.println(item + " ha sido añadido al inventario.");
    }

    public void mostrarItems() {
        if (items.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Items en el inventario:");
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }
}
