package jogo.rpg.modelo;

import java.util.Random;


/**
 *
 * @author Rogerio J. Gentil
 */
public class Coordenada {
   
   private int x;
   private int y;

   public Coordenada(int x, int y) {
      this.x = x;
      this.y = y;
   }
   public Coordenada() {
    Random randomGenerator = new Random();
    //Gera um random de 0 .. 6;
      this.x = randomGenerator.nextInt(7);
      this.y = randomGenerator.nextInt(7);
   }

   public int getX() {
      return x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int getY() {
      return y;
   }

   public void setY(int y) {
      this.y = y;
   }
}
