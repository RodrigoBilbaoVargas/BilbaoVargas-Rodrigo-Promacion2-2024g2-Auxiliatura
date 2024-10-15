package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Animal vaca = new Vaca("Lola", 5);
        Animal oveja = new Oveja("Dolly", 3);

        vaca.mostrarInfo();
        vaca.hacerSonido();
        vaca.alimentar();
        ((Productor) vaca).producir();

        oveja.mostrarInfo();
        oveja.hacerSonido();
        oveja.alimentar();
        ((Productor) oveja).producir();
    }
}
