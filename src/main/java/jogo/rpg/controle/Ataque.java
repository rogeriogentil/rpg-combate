package jogo.rpg.controle;

import jogo.rpg.modelo.Personagem;

/**
 *
 * @author rogerio
 */
public class Ataque {

   public void atacar(Personagem personagem) {
      System.out.println(personagem.getNome() + " atacou!");
   }

   public int calcularChanceAcerto(Personagem personagem) {
      return personagem.getDestreza() * 8;
   }
}