package dsoo.jogo.rpg.modelo;

import java.util.Map;

/**
 *
 * @author Rogerio J. Gentil
 */
public class Combate {
   
   // @TODO guardar a posicao dos personagens durante o combate
   private static final int LARGURA = 6;
   private static String[][] arena;
           
   public Combate() {
      arena = new String[LARGURA][LARGURA];
   }

   public static String[][] getArena() {      
      return arena;
   }
   
   public void exibir() {
      final String BORDA_HORIZONTAL = "--------------------------";
      
      StringBuilder sb = new StringBuilder();
      sb.append(BORDA_HORIZONTAL).append("\n");
      
      for (int x = 0; x < LARGURA; x++) {
         sb.append("| ");         
         for(int y = 0; y < LARGURA; y++) {
            sb.append(arena[x][y]);
            sb.append(" | ");
         }
         sb.append("\n");
      }
      sb.append(BORDA_HORIZONTAL);
      
      System.out.println(sb.toString());
   }
   
   public void posicionar(Personagem personagem) {
      
   }
   
   public Map<Integer, Integer> obterPosicao(Personagem personagem) {
      return null;
   }
   
   public static void main(String[] args) {
      Combate a = new Combate();
      a.exibir();
   }
}
