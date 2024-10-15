package ejercicio3;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected boolean alimentado;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimentado = false;  // Al principio no están alimentados
    }

    public abstract void hacerSonido();

    public void mostrarInfo() {
        System.out.println("Animal: " + nombre + ", Edad: " + edad + " años, Alimentado: " + alimentado);
    }

    // Nuevo método para alimentar al animal
    public void alimentar() {
        alimentado = true;
        System.out.println(nombre + " ha sido alimentado.");
    }
}
