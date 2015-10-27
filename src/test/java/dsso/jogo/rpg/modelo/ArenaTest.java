package dsso.jogo.rpg.modelo;

import dsoo.jogo.rpg.modelo.Arena;
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
      Arena arena = new Arena();
     
      Personagem personagem = new Personagem("Rogerio");
      arena.posicionar(personagem);
      
//      String[][] arena = combate.getArena();
      
      assertEquals(arena, arena);
   }
   
   @Test
   public void deveObterPosicaoValidaDoPersonagem() {
      
   }
}
