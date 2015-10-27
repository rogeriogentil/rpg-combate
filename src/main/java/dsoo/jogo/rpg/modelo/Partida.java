package dsoo.jogo.rpg.modelo;

/**
 *
 * @author Rogerio J. Gentil
 */
public class Partida { // ESSA CLASSE DEVERIA SER UM Singleton?

   public Combate combate;

   public Combate getCombate() {
      return combate;
   }

   public void setCombate(Combate combate) {
      this.combate = combate;
   }
}
