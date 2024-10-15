package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Animal vaca = new Vaca("Lola", 5);
        Animal oveja = new Oveja("Dolly", 3);

        vaca.mostrarInfo();
        vaca.hacerSonido();
        ((Productor) vaca).producir();  // Casting para llamar al método de la interfaz

        oveja.mostrarInfo();
        oveja.hacerSonido();
        ((Productor) oveja).producir();  // Casting para llamar al método de la interfaz
    }
}
