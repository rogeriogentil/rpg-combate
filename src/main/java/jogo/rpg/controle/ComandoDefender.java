package jogo.rpg.controle;

import jogo.rpg.modelo.Personagem;

/**
 *
 * @author Rogerio J. Gentil
 */
public class ComandoDefender implements Comando {
   
   private final Defesa defesa;
   private final Personagem personagem;

   public ComandoDefender(Personagem personagem) {
      this.defesa = new Defesa();
      this.personagem = personagem;
   }

   @Override
   public void executar() {
      defesa.defender(personagem);
   }
}
