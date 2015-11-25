package jogo.rpg.modelo;

/**
 * Classe que fabrica objetos do tipo Personagem.
 * 
 * @see jogo.rpg.modelo.Personagem
 * 
 * @author Rodrigo Henrique Ramos <rodrigohenrique.ramos@gmail.com>
 */
public class PersonagemFactory {

   public IPersonagem criarPersonagem(String nome) {
      return new Personagem(nome);
   }

   public IPersonagem criarPersonagem(String nome, int forca, int percepcao, int destreza, int vitalidade, int agilidade) {
      return new Personagem(nome, forca, percepcao, destreza, vitalidade, agilidade);
   }
}
