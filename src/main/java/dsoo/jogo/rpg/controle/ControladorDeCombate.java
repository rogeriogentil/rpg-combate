package dsoo.jogo.rpg.controle;

import dsoo.jogo.rpg.modelo.Arena;
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
         System.out.println(i + " - " + personagem.getNome() + "\n\t Forca: " + personagem.getForca() +"\t Percepcao: "+ personagem.getPercepcao() +" \t Destreza: "+ personagem.getDestreza() +"\t Vitalidade: "+ personagem.getVitalidade() +"\t Agilidade: "+ personagem.getAgilidade() );
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
   /*acredito que os passos são 
   1-calcular chance de ataque (retorna uma percentual e entre 0..95) 
    1.1 Calcular chance de ataque (retona um bool para saber se acertou ou não. Podemos fazer um hand de 0..100 e vereficar é a maior doq a o retorno do método 1 ), 
   2- calcular chance de defesa (retorna bool) se o 1.1 for true, verifica de acordo com o descrito no documento de requisitos qual a chance de defender/esquivar
    2.1 mesmo esquema do 1.1, mas com o 2 ao invez do 1
   3- Calcular dano, caso o 2 dois retorne falso. Vai descontar um int da vitalidade de quem recebeu o ataque.
   */
   public void executarAcaoSelecionada(int opcao) {
      if (opcao == 1) {
         jogador.atacar();
      }
   }
   //Acrededito que temos q passar o turno atual, afim de poder gerar dinamicamente/aleatoriamente os oponentes
   private void criarOponente() {
      oponente = new Personagem("Goro");
   }

   private void criarArena() {
      arena = new Arena();
   }
   //Tem o mesmo problema de baixo, alguém tem q saber onde um está para poder criar o outro e impedir de criar em cima
   private void posicionarNaArena(Personagem personagem) {
      arena.posicionar(personagem);
   }
   //Para exibir na arena, tem q receber o jogador e o oponente, afim de saber onde eles estão, ou a arena tem q saber onde eles estão, talvez role um observer
   private void exibirArena() {
      arena.exibir();
   }

   public boolean ehVezDoJogadorHumano() {
      return !ehVezDoHumano;
   }
}
