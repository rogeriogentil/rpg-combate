package dsoo.jogo.rpg;

import dsoo.jogo.rpg.controle.ControladorDeCombate;
import java.util.Scanner;

/**
 *
 * @author Rogerio J. Gentil
 */
public class Jogo {

   private static final Scanner sc = new Scanner(System.in);
   private static int opcaoSelecionada;
   private static ControladorDeCombate controladorDeCombate;

   public static void main(String[] args) {
      Jogo jogo = new Jogo();
      jogo.iniciar();

      if (opcaoSelecionada == 1) {
         controladorDeCombate = new ControladorDeCombate();
         int personagemSelecionado = jogo.selecionarPersonagem();
         jogo.iniciarCombate(personagemSelecionado);
      }
   }

   public void iniciar() {
      System.out.println("Selecione uma opção:");
      System.out.println("1: Jogar");
      System.out.println("2: Sair");
      System.out.print("> ");
      opcaoSelecionada = Integer.parseInt(sc.next());
   }

   public int selecionarPersonagem() {
      System.out.println("Selecione uma personagem:");
      controladorDeCombate.listarPersonagens();
      System.out.print("> ");
      return Integer.parseInt(sc.next());
   }

   public void iniciarCombate(int personagemSelecionado) {
      controladorDeCombate.iniciarCombate(personagemSelecionado);
   }
}
