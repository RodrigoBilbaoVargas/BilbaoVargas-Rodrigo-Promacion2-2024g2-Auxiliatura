package ejercicio3;

public class MainSimulacionGranja {
    public static void main(String[] args) {
        // Prueba con Vaca
        Animal vaca = new Vaca("Lola", 5);
        vaca.mostrarInfo();
        vaca.hacerSonido();
        vaca.alimentar();
        ((Productor) vaca).producir();

        // Prueba con Oveja
        Animal oveja = new Oveja("Dolly", 3);
        oveja.mostrarInfo();
        oveja.hacerSonido();
        oveja.alimentar();
        ((Productor) oveja).producir();
    }
}
