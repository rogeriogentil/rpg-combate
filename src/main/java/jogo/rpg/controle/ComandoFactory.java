package jogo.rpg.controle;

/**
 *
 * @author Rogerio J. Gentil
 */
public class ComandoFactory {
   
   public Comando getComando(ComandoEnum comando) {
      if (comando == ComandoEnum.ATACAR) {
         return new ComandoAtacar(null);
      }
      
      if (comando == ComandoEnum.MOVER) {
         return new ComandoMover(null);
      }
      
      if (comando == ComandoEnum.DEFENDER) {
         return new ComandoDefender(null);
      }
      
      if (comando == ComandoEnum.ESQUIVAR) {
         return new ComandoEsquivar();
      }
      
      throw new IllegalArgumentException("Comando inválido.");
   }
}
