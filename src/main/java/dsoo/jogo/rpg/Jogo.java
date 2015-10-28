package dsoo.jogo.rpg;

import dsoo.jogo.rpg.controle.ControladorDaPartida;
import dsoo.jogo.rpg.controle.ControladorDeCombate;
import dsoo.jogo.rpg.modelo.Partida;
import dsoo.jogo.rpg.modelo.Personagem;
import java.util.Scanner;

/**
 *
 * @author Rogerio J. Gentil
 */
public class Jogo {

   private static final Scanner sc = new Scanner(System.in);
   private int opcaoSelecionada;
   private Partida partida;
   private ControladorDaPartida controladorDaPartida;
   private ControladorDeCombate controladorDeCombate;

   public static void main(String[] args) {
      Jogo jogo = new Jogo();
      jogo.iniciarJogo();
      jogo.iniciarPartida();
      jogo.iniciarCombate();
   }

   private void iniciarJogo() {
      exibirMenuDoJogo();
      lerEntrada();

      while (opcaoSelecionada != 1 && opcaoSelecionada != 2) {
         exibirMensagemDeOpcaoInvalida();
         exibirMenuDoJogo();
         lerEntrada();
      }

      executarAcaoDoMenuDoJogo(opcaoSelecionada);
   }

   private void exibirMenuDoJogo() {
      System.out.println("Selecione uma opção:");
      System.out.println("1: Jogar");
      System.out.println("2: Sair");
      System.out.print("> ");
   }

   private void executarAcaoDoMenuDoJogo(int opcao) {
      switch (opcao) {
         case 1: // Jogar
            partida = new Partida();
            break;
         case 2: // Sair
            Jogo.finalizarJogo();
      }
   }

   private void iniciarPartida() {
      controladorDaPartida = new ControladorDaPartida(partida);

      controladorDaPartida.exibirMenuDaPartida();
      lerEntrada();

      while (opcaoSelecionada != 1 && opcaoSelecionada != 2) {
         exibirMensagemDeOpcaoInvalida();
         controladorDaPartida.exibirMenuDaPartida();
         lerEntrada();
      }

      controladorDaPartida.executarAcaoDoMenuDaPartida(opcaoSelecionada);
      
      selecionarPersonagem();
   }

   private void selecionarPersonagem() {
      lerEntrada();
      
      while (opcaoSelecionada != 1 && opcaoSelecionada != 2 && opcaoSelecionada != 3) {
         exibirMensagemDeOpcaoInvalida();
         controladorDaPartida.listarPersonagens();
         lerEntrada();
      }

      controladorDaPartida.selecionarPersonagem(opcaoSelecionada);
   }

   private void iniciarCombate() {
      Personagem personagemSelecionado = controladorDaPartida.getPartida().getPersonagem();
      controladorDeCombate = new ControladorDeCombate(personagemSelecionado);
      controladorDeCombate.iniciarCombate();
   }

   private void lerEntrada() {
      opcaoSelecionada = Integer.parseInt(sc.next());
   }

   private void exibirMensagemDeOpcaoInvalida() {
      System.err.println(">>> OPÇÃO INVÁLIDA! <<<");
   }

   public static void finalizarJogo() {
      System.exit(0);
   }
}
