package dsoo.jogo.rpg.controle;

import dsoo.jogo.rpg.Jogo;
import dsoo.jogo.rpg.modelo.Partida;
import dsoo.jogo.rpg.modelo.Personagem;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Rogerio J. Gentil
 */
public class ControladorDaPartida {

   private final Partida partida;
   private Map<Integer, Personagem> personagens;

   public ControladorDaPartida(Partida partida) {
      this.partida = partida;
   }

   public void exibirMenuDaPartida() {
      System.out.println("1: Selecionar um personagem");
      System.out.println("2: Sair");
      System.out.print("> ");
   }

   public void executarAcaoDoMenuDaPartida(int opcao) {
      switch (opcao) {
         case 1:
            listarPersonagens();
            break;
         case 2:
            Jogo.finalizarJogo();
      }
   }

   public void listarPersonagens() {
      personagens = new LinkedHashMap<>();
      int i = 0;

      for (Personagem personagem : Personagem.obterPersonagens()) {
         personagens.put(i++, personagem);
         System.out.println(i + ": " + personagem.getNome()
                 + "\t[Força: " + personagem.getForca()
                 + ", Percepção: " + personagem.getPercepcao()
                 + ", Destreza: " + personagem.getDestreza()
                 + ", Vitalidade: " + personagem.getVitalidade()
                 + ", Agilidade: " + personagem.getAgilidade() + "]");
      }

      System.out.print("> ");
   }

   public void selecionarPersonagem(int opcao) {
      Personagem personagemSelecionado = personagens.get(--opcao);
      partida.setPersonagem(personagemSelecionado);
   }
   
   public Partida getPartida() {
      return partida;
   }
}
