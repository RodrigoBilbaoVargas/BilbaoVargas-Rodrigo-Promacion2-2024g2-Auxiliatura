package ejercicio4;

import java.util.Random;

public class Mago extends Personaje {
 public Mago(String nombre) {
     super(nombre);
 }

 // Implementación del ataque del mago usando lanzarHechizo
 @Override
 public int atacar() {
     Random random = new Random();
     int daño = random.nextInt(11) + 10; // Daño aleatorio entre 10 y 20
     System.out.println(nombre + " lanza un hechizo causando " + daño + " puntos de daño.");
     return daño;
 }
}
