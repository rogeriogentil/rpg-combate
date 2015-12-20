package jogo.rpg.controle;

/**
 * Opções de início do jogo.
 * 
 * @author Rogerio J. Gentil
 */
public enum OpcaoDeJogoEnum {

   JOGAR(1, "Jogar"),
   SAIR(2, "Sair");

   private final int id;
   private final String opcao;

   private OpcaoDeJogoEnum(int id, String opcao) {
      this.id = id;
      this.opcao = opcao;
   }

   public int getId() {
      return id;
   }

   public String getOpcao() {
      return opcao;
   }

}
