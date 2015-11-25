package jogo.rpg.modelo;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rogerio J. Gentil <rogerio_gentil@yahoo.com.br>
 */
public class Personagem implements IPersonagem {

   private String nome;
   private int forca;
   private int percepcao;
   private int destreza;
   private int vitalidade;
   private int agilidade;
   private int pontosDeVida;
   private Coordenada posicao;

   public Personagem(String nome) {
      this.nome = nome;
   }

   public Personagem(String nome, int forca, int percepcao, int destreza, int vitalidade, int agilidade) {
      this.nome = nome;
      this.forca = forca;
      this.percepcao = percepcao;
      this.destreza = destreza;
      this.vitalidade = vitalidade;
      this.agilidade = agilidade;
      this.pontosDeVida = vitalidade * 10;

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

   public int getDestreza() {
      return destreza;
   }

   public void setDestreza(int destreza) {
      this.destreza = destreza;
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

   public int getPontosDeVida() {
      return pontosDeVida;
   }

   public void setPontosDeVida(int pontosDeVida) {
      this.pontosDeVida = pontosDeVida;
   }

   public Coordenada getPosicao() {
      return posicao;
   }

   public void setPosicao(Coordenada posicao) {
      this.posicao = posicao;
   }

   public static List<Personagem> obterPersonagens() {
      Personagem conrar = new Personagem("Conrar", 10, 3, 7, 7, 3);
      Personagem leofcon = new Personagem("Leofcon", 3, 10, 7, 3, 7);
      Personagem tonkim = new Personagem("Tonkim", 6, 6, 6, 6, 6);

      return Arrays.asList(conrar, leofcon, tonkim);
   }

   public void atacar() {
      Comando atacar = new ComandoAtacar();
      atacar.executar();
   }

   @Override
   public void equipar(EquipamentoAtaque ataque, EquipamentoDefesa defesa) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public void reduzPontosDeVida(int dano) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public String exibirInforPersonagem() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public void posicionar(int x, int y) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public int getPosicaoX() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public int getPosicaoY() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
}
