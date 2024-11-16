package ejercicio4;

class Objeto {
    private String nombre;
    private int peso;

    public Objeto(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return nombre + " (Peso: " + peso + ")";
    }
}