package jogo.rpg.modelo;

/**
 * Classe que fabrica objetos do tipo {@link jogo.rpg.modelo.Comando}.
 * 
 * @author Rodrigo Henrique Ramos <rodrigohenrique.ramos@gmail.com>
 */
public abstract class ComandoFactory {

   /**
    * Fabrica um objeto que implementa a interface {@code Comando} de acordo o tipo passado.
    * 
    * @param comando {@link ComandoEnum}
    * @return Comando
    */
   public Comando getComando(ComandoEnum comando) {
      switch (comando) {
         case ATACAR:
            return new ComandoAtacar();
         case MOVER:
            return new ComandoMover();
         case DEFENDER:
            return new ComandoDefender();
         case ESQUIVAR:
            return new ComandoEsquivar();
         default:
            throw new UnsupportedOperationException("Comando não implementado.");
      }
   }
}
