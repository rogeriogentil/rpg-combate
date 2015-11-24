package jogo.rpg.modelo;

/**
 *
 * @author rogerio
 */
public class EquipamentoAtaque extends Equipamento {

   private int poderDeDano;
   private boolean longoAlcance;

   public int getPoderDeDano() {
      return poderDeDano;
   }

   public void setPoderDeDano(int poderDeDano) {
      this.poderDeDano = poderDeDano;
   }

   public boolean isLongoAlcance() {
      return longoAlcance;
   }

   public void setLongoAlcance(boolean longoAlcance) {
      this.longoAlcance = longoAlcance;
   }
}
