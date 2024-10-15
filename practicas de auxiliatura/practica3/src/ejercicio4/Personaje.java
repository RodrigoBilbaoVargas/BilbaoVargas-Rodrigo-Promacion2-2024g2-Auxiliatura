package ejercicio4;

import java.util.Random;

public abstract class Personaje {
 protected String nombre;
 protected int puntosVida;
 protected int nivel;

 public Personaje(String nombre) {
     this.nombre = nombre;
     this.puntosVida = 100; // Ambos empiezan con 100 puntos de vida
     Random random = new Random();
     this.nivel = random.nextInt(100) + 1; // Nivel aleatorio entre 1 y 100
 }

 // Método para recibir daño
 public void recibirDaño(int daño) {
     puntosVida -= daño;
     if (puntosVida < 0) {
         puntosVida = 0;
     }
 }

 // Método para mostrar el estado del personaje
 public void mostrarEstado() {
     System.out.println(nombre + " - Vida: " + puntosVida + ", Nivel: " + nivel);
 }

 // Método abstracto que será implementado por las subclases
 public abstract int atacar();
}
