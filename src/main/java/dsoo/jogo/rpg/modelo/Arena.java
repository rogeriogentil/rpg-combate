package dsoo.jogo.rpg.modelo;

import dsoo.jogo.rpg.modelo.Coordenada;
import dsoo.jogo.rpg.modelo.Personagem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rogerio J. Gentil
 */
public class Arena {

   private static final int LARGURA = 6;
   private List<Coordenada> coordenadas;

   public Arena() {
      coordenadas = new ArrayList<>();

      for (int x = 0; x < LARGURA; x++) {
         for (int y = 0; y < LARGURA; y++) {
            coordenadas.add(new Coordenada(x, y));
         }
      }
   }

   public void exibir() {
      //coordenadas.forEach((coordenada) -> System.out.println(coordenada.getX() + "," + coordenada.getY()));

      final String BORDA_HORIZONTAL = "--------------------------";

      StringBuilder sb = new StringBuilder();
      sb.append(BORDA_HORIZONTAL).append("\n");

      for (int x = 0; x < LARGURA; x++) {
         sb.append("| ");
         for (int y = 0; y < LARGURA; y++) {

            sb.append(" | ");
         }
         sb.append("\n");
      }
      sb.append(BORDA_HORIZONTAL);

      System.out.println(sb.toString());
   }

   public void posicionar(Personagem personagem) {
       personagem.setPosicao(null);
   }

   public Coordenada obterPosicao(Personagem personagem) {
      return personagem.getPosicao();
   }
}
