package ejercicio4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregarObjeto(new Objeto("Espada", 10));
        inventario.agregarObjeto(new Objeto("Escudo", 15));
        inventario.agregarObjeto(new Objeto("Poción", 2));

        List<Objeto> objetosLivianos = inventario.filtrarObjetos(objeto -> objeto.getPeso() < 10);
        System.out.println("Objetos livianos:");
        objetosLivianos.forEach(System.out::println);
    }
}