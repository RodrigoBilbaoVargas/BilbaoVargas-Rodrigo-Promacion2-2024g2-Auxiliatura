package ejercicio5;

public class Main {
    public static void main(String[] args) {
        // Crear un enemigo tipo Zombie
        Zombie zombie = new Zombie("Zombie Guerrero", 50, 10);
        // Crear un enemigo tipo Vampiro
        Vampiro vampiro = new Vampiro("Vampiro Oscuro", 60, 15);

        // Simulación de ataques
        System.out.println("----- Comienza la batalla -----");

        // Zombie ataca
        System.out.println(zombie.nombre + " ataca e inflige " + zombie.atacar() + " de daño.");
        zombie.mostrarEstado();

        // Vampiro ataca
        System.out.println(vampiro.nombre + " ataca e inflige " + vampiro.atacar() + " de daño.");
        vampiro.mostrarEstado();

        // Ambos reciben daño
        zombie.recibirDaño(20);
        vampiro.recibirDaño(30);

        // Estado tras recibir daño
        zombie.mostrarEstado();
        vampiro.mostrarEstado();

        // Estado de si están vivos
        System.out.println("¿Zombie está vivo? " + zombie.estaVivo());
        System.out.println("¿Vampiro está vivo? " + vampiro.estaVivo());
    }
}
