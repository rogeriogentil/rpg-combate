package jogo.rpg.controle;

import jogo.rpg.modelo.Personagem;

/**
 *
 * @author Rogerio J. Gentil
 */
public class ComandoMover implements Comando {
   
   private final Movimento movimento;
   private final Personagem personagem;

   public ComandoMover(Personagem personagem) {
      this.personagem = personagem;
      this.movimento = new Movimento();
   }

   @Override
   public void executar() {
      movimento.mover(personagem);
   }
}
