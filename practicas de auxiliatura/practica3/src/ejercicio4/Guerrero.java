package ejercicio4;

import java.util.Random;

public class Guerrero extends Personaje {
 public Guerrero(String nombre) {
     super(nombre);
 }

 // Implementación del ataque del guerrero
 @Override
 public int atacar() {
     Random random = new Random();
     int daño = random.nextInt(11) + 10; // Daño aleatorio entre 10 y 20
     System.out.println(nombre + " ataca con su espada causando " + daño + " puntos de daño.");
     return daño;
 }
}
