package ejercicio6;

public class Main {
    public static void main(String[] args) {
        // Crear un enemigo tipo Jefe
        Jefe jefe = new Jefe("Jefe Supremo", 100, 20, 2.5); // Multiplicador de daño de 2.5

        // El jefe habla antes del combate
        jefe.hablar();

        // Jefe realiza un ataque crítico
        jefe.ataqueCritico();
        jefe.mostrarEstado();

        // Simular que el jefe recibe daño
        jefe.recibirDaño(30);
        jefe.mostrarEstado();

        // Comprobar si el jefe sigue vivo
        System.out.println("¿Jefe está vivo? " + jefe.estaVivo());
    }
}
