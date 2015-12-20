package jogo.rpg;

import java.util.HashSet;
import jogo.rpg.controle.ControladorDaPartida;
import jogo.rpg.controle.ControladorDeCombate;
import jogo.rpg.modelo.Partida;
import jogo.rpg.modelo.Personagem;
import java.util.Scanner;
import java.util.Set;
import jogo.rpg.controle.OpcaoDeJogoEnum;

/**
 *
 * @author Rogerio J. Gentil
 */
public class Jogo {

   private static final Scanner sc = new Scanner(System.in);
   private Set<Integer> opcoes;
   private int opcaoSelecionada;
   private ControladorDaPartida controladorDaPartida;
   private ControladorDeCombate controladorDeCombate;
   
   public static void main(String[] args) {
      Jogo jogo = new Jogo();
      jogo.iniciarJogo();
   }

   private void iniciarJogo() {
      obterOpcoesDoJogo();
      exibirMenuDoJogo();
      lerEntrada();

      while (!opcoes.contains(opcaoSelecionada)) {
         exibirMensagemDeOpcaoInvalida();
         exibirMenuDoJogo();
         lerEntrada();
      }

      executarAcaoDoMenuDoJogo(opcaoSelecionada);
   }

   /**
    * Obtém as opções pré-definidas de Jogo.
    */
   private void obterOpcoesDoJogo() {
      opcoes = new HashSet<>();

      for (OpcaoDeJogoEnum opcao : OpcaoDeJogoEnum.values()) {
         opcoes.add(opcao.getId());
      }
   }

   private void exibirMenuDoJogo() {
      System.out.println("Selecione uma opção:");

      for (OpcaoDeJogoEnum opcao : OpcaoDeJogoEnum.values()) {
         System.out.println(opcao.getId() + ": " + opcao.getOpcao());
      }

      System.out.print("> ");
   }

   private void executarAcaoDoMenuDoJogo(int opcao) {
      switch (opcao) {
         case 1: // Jogar
            iniciarPartida();
            break;
         case 2: // Sair
            Jogo.finalizarJogo();
      }
   }

   private void iniciarPartida() {
      controladorDaPartida = new ControladorDaPartida(new Partida());

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

      iniciarCombate();
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
