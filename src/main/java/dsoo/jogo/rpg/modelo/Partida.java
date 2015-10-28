package dsoo.jogo.rpg.modelo;

/**
 *
 * @author Rogerio J. Gentil
 */
public class Partida { // ESSA CLASSE DEVERIA SER UM Singleton?

   public Personagem personagem;
   public Combate combate;

   public Personagem getPersonagem() {
      return personagem;
   }

   public void setPersonagem(Personagem personagem) {
      this.personagem = personagem;
   }
           
   public Combate getCombate() {
      return combate;
   }

   public void setCombate(Combate combate) {
      this.combate = combate;
   }
}
