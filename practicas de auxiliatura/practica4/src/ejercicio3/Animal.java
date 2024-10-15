package ejercicio3;

public abstract class Animal {
    protected String nombre;
    protected int edad;

    // Constructor para inicializar los atributos
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método abstracto hacerSonido()
    public abstract void hacerSonido();

    // Método para mostrar la información del animal
    public void mostrarInfo() {
        System.out.println("Animal: " + nombre + ", Edad: " + edad + " años");
    }
}
