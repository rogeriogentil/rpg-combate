package dsoo.jogo.rpg.modelo;

import dsoo.jogo.rpg.combate.Comando;
import dsoo.jogo.rpg.combate.ComandoAtacar;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rogerio
 */
public class Personagem {

   private String nome;
   private int forca;
   private int percepcao;
   private int despreza;
   private int vitalidade;
   private int agilidade;
   private Coordenada posicao;

   public Personagem(String nome) {
      this.nome = nome;
   }
   
   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public int getForca() {
      return forca;
   }

   public void setForca(int forca) {
      this.forca = forca;
   }

   public int getPercepcao() {
      return percepcao;
   }

   public void setPercepcao(int percepcao) {
      this.percepcao = percepcao;
   }

   public int getDespreza() {
      return despreza;
   }

   public void setDespreza(int despreza) {
      this.despreza = despreza;
   }

   public int getVitalidade() {
      return vitalidade;
   }

   public void setVitalidade(int vitalidade) {
      this.vitalidade = vitalidade;
   }

   public int getAgilidade() {
      return agilidade;
   }

   public void setAgilidade(int agilidade) {
      this.agilidade = agilidade;
   }

   public Coordenada getPosicao() {
      return posicao;
   }

   public void setPosicao(Coordenada posicao) {
      this.posicao = posicao;
   }
   
   public static List<Personagem> obterPersonagens() {
      Personagem conrar = new Personagem("Conrar");
      Personagem leofcon = new Personagem("Leofcon");
      Personagem tonkim = new Personagem("Tonkim");
      
      return Arrays.asList(conrar, leofcon, tonkim);
   }
   
   public void atacar() {
      Comando atacar = new ComandoAtacar(this);
      atacar.executar();
   }
}
