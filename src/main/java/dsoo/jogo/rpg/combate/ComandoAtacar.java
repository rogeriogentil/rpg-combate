package dsoo.jogo.rpg.combate;

import dsoo.jogo.rpg.modelo.Personagem;

/**
 *
 * @author Rogerio J. Gentil
 */
public class ComandoAtacar implements Comando {

   private final Ataque ataque;
   private final Personagem personagem;

   public ComandoAtacar(Personagem personagem) {
      this.ataque = new Ataque();
      this.personagem = personagem;
   }
   
   @Override
   public void executar() {
      ataque.atacar(personagem);
   }
}
