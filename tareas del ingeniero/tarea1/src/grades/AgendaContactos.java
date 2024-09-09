package grades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
        List<Contacto> contactos = cargarContactos();

        while (true) {
            System.out.println("\n----- Agenda de Contactos -----");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Ver contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarContacto(contactos, scanner);
                    break;
                case 2:
                    verContactos(contactos);
                    break;
                case 3:
                    buscarContacto(contactos, scanner);
                    break;
                case 4:
                    eliminarContacto(contactos, scanner);
                    break;
                case 5:
                    guardarContactos(contactos);
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    private static List<Contacto> cargarContactos() {
        List<Contacto> contactos = new ArrayList<>();
        File archivo = new File(ARCHIVO_CONTACTOS);
        if (archivo.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    String[] partes = linea.split(",");
                    contactos.add(new Contacto(partes[0], partes[1], partes[2]));
                }
            } catch (IOException e) {
                System.err.println("Error al cargar los contactos: " + e.getMessage());
            }
        }
        return contactos;
    }

    private static void agregarContacto(List<Contacto> contactos, Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        String correo = scanner.nextLine();

        contactos.add(new Contacto(nombre, telefono, correo));
        System.out.println("Contacto agregado correctamente.");
    }

    private static void verContactos(List<Contacto> contactos) {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
        } else {
            System.out.println("\n----- Lista de Contactos -----");
            for (int i = 0; i < contactos.size(); i++) {
                System.out.println((i + 1) + ". " + contactos.get(i));
            }
        }
    }

    private static void buscarContacto(List<Contacto> contactos, Scanner scanner) {
        System.out.print("Ingrese el nombre del contacto a buscar: ");
        String nombreBuscar = scanner.nextLine();

        boolean encontrado = false;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombreBuscar)) {
                System.out.println("\nContacto encontrado:");
                System.out.println(contacto);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró el contacto.");
        }
    }

    private static void eliminarContacto(List<Contacto> contactos, Scanner scanner) {
        System.out.print("Ingrese el nombre del contacto a eliminar: ");
        String nombreEliminar = scanner.nextLine();

        boolean eliminado = false;
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equalsIgnoreCase(nombreEliminar)) {
                contactos.remove(i);
                System.out.println("Contacto eliminado correctamente.");
                eliminado = true;
                break;
            }
        }

        if (!eliminado) {
            System.out.println("No se encontró el contacto a eliminar.");
        }
    }

    private static void guardarContactos(List<Contacto> contactos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_CONTACTOS))) {
            for (Contacto contacto : contactos) {
                writer.write(contacto.getNombre() + "," + contacto.getTelefono() + "," + contacto.getCorreo());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los contactos: " + e.getMessage());
        }
    }
}

class Contacto {
    private String nombre;
    private String telefono;
    private String correo;

    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono + ", Correo: " + correo;
    }
}