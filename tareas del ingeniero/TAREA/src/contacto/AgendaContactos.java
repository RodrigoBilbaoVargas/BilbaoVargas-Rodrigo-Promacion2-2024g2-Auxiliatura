package contacto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaContactos {

    private static final String ARCHIVO_CONTACTOS = "contactos.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarContacto(scanner);
                    break;
                case 2:
                    mostrarContactos();
                    break;
                case 3:
                    buscarContacto(scanner);
                    break;
                case 4:
                    eliminarContacto(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Agenda de Contactos ---");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Mostrar contactos");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Eliminar contacto");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void agregarContacto(Scanner scanner) {
        System.out.println("\n--- Agregar Contacto ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contacto nuevoContacto = new Contacto(nombre, telefono, email);
        guardarContacto(nuevoContacto);

        System.out.println("Contacto agregado correctamente.");
    }

    private static void mostrarContactos() {
        System.out.println("\n--- Contactos ---");
        List<Contacto> contactos = cargarContactos();
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
        } else {
            for (Contacto contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }

    private static void buscarContacto(Scanner scanner) {
        System.out.println("\n--- Buscar Contacto ---");
        System.out.print("Ingresa el nombre del contacto: ");
        String nombreBuscar = scanner.nextLine();

        List<Contacto> contactos = cargarContactos();
        boolean encontrado = false;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombreBuscar)) {
                System.out.println(contacto);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún contacto con ese nombre.");
        }
    }

    private static void eliminarContacto(Scanner scanner) {
        System.out.println("\n--- Eliminar Contacto ---");
        System.out.print("Ingresa el nombre del contacto a eliminar: ");
        String nombreEliminar = scanner.nextLine();

        List<Contacto> contactos = cargarContactos();
        boolean eliminado = false;
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equalsIgnoreCase(nombreEliminar)) {
                contactos.remove(i);
                eliminado = true;
                break;
            }
        }
        if (eliminado) {
            guardarContactos(contactos);
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("No se encontró ningún contacto con ese nombre.");
        }
    }

    private static void guardarContacto(Contacto contacto) {
        List<Contacto> contactos = cargarContactos();
        contactos.add(contacto);
        guardarContactos(contactos);
    }

    private static void guardarContactos(List<Contacto> contactos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_CONTACTOS))) {
            for (Contacto contacto : contactos) {
                writer.write(contacto.getNombre() + "," + contacto.getTelefono() + "," + contacto.getEmail());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los contactos: " + e.getMessage());
        }
    }

    private static List<Contacto> cargarContactos() {
        List<Contacto> contactos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_CONTACTOS))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    contactos.add(new Contacto(partes[0], partes[1], partes[2]));
                }
            }
        } catch (IOException e) {
            // Si el archivo no existe, simplemente se crea una lista vacía
            if (e.getMessage().contains("No such file or directory")) {
                return contactos;
            } else {
                System.out.println("Error al cargar los contactos: " + e.getMessage());
            }
        }
        return contactos;
    }
}

class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono + ", Email: " + email;
    }
}