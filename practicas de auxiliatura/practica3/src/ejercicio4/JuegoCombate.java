package ejercicio4;

public class JuegoCombate {
 public static void main(String[] args) {
     // Crear personajes
     Mago mago = new Mago("Gandalf");
     Guerrero guerrero = new Guerrero("Conan");

     // Mostrar estado inicial
     System.out.println("Estado inicial:");
     mago.mostrarEstado();
     guerrero.mostrarEstado();

     // Simulación del combate
     while (mago.puntosVida > 0 && guerrero.puntosVida > 0) {
         // Turno del mago
         guerrero.recibirDaño(mago.atacar());
         if (guerrero.puntosVida <= 0) {
             System.out.println("¡" + guerrero.nombre + " ha sido derrotado!");
             break;
         }

         // Turno del guerrero
         mago.recibirDaño(guerrero.atacar());
         if (mago.puntosVida <= 0) {
             System.out.println("¡" + mago.nombre + " ha sido derrotado!");
             break;
         }

         // Mostrar estado después de cada ronda
         System.out.println("\nEstado actual:");
         mago.mostrarEstado();
         guerrero.mostrarEstado();
         System.out.println("-----------------------------");
     }
 }
}
