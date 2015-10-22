package dsso.jogo.rpg.modelo;

import dsoo.jogo.rpg.modelo.Combate;
import dsoo.jogo.rpg.modelo.Personagem;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rogerio J. Gentil
 */
public class ArenaTest {
   
   public ArenaTest() {
   }
   
   @Test
   public void devePosicionarPersonagemDentroDaArena() {
      Combate combate = new Combate();
     
      Personagem personagem = new Personagem();
      combate.posicionar(personagem);
      
      String[][] arena = combate.getArena();
      
      assertEquals(combate, combate);
   }
}
