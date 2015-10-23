package dsoo.jogo.rpg.combate;

import dsoo.jogo.rpg.modelo.Personagem;

/**
 *
 * @author rogerio
 */
public class Ataque {

   public void atacar(Personagem personagem) {
      System.out.println(personagem.getNome() + " atacou!");
   }
}
