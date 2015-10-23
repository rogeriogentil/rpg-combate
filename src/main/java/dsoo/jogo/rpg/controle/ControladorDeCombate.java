package dsoo.jogo.rpg.controle;

import dsoo.jogo.rpg.combate.Arena;
import dsoo.jogo.rpg.modelo.Personagem;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Rogerio J. Gentil
 */
public class ControladorDeCombate {

   private Map<Integer, Personagem> personagens;
   private Personagem jogador;
   private Personagem oponente;
   private Arena arena;
   private boolean ehVezDoHumano;
   
   public void listarPersonagens() {
      personagens = new LinkedHashMap<>();
      int i = 0;

      for (Personagem personagem : Personagem.obterPersonagens()) {
         personagens.put(i++, personagem);
         System.out.println(i + " - " + personagem.getNome());
      }
   }

   public void iniciarCombate(int personagemSelecionado) {
      jogador = personagens.get(--personagemSelecionado);
      System.out.println("Você selecionou " + jogador.getNome());
      
      ehVezDoHumano = ehVezDoJogadorHumano();
      criarOponente();
      criarArena();
      // criar equipamentos de ataque e defesa
      // equipar jogador e oponente
      posicionarNaArena(jogador);
      posicionarNaArena(oponente);
      exibirArena();
   }

   public void executarAcaoSelecionada(int opcao) {
      if (opcao == 1) {
         jogador.atacar();
      }
   }

   private void criarOponente() {
      oponente = new Personagem("Goro");
   }

   private void criarArena() {
      arena = new Arena();
   }

   private void posicionarNaArena(Personagem personagem) {
      arena.posicionar(personagem);
   }

   private void exibirArena() {
      arena.exibir();
   }

   public boolean ehVezDoJogadorHumano() {
      return !ehVezDoHumano;
   }
}
