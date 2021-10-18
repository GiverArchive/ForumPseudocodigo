// Problema: O jogador pode passar para o próximo nível?
// Autor: Will

public class Jogador {
  private final String apelido;
  private int nivel;
  private int pontos;

  public Jogador(String apelido, int nivel, int pontos) {
    this.apelido = apelido;
    this.nivel = nivel;
    this.pontos = pontos;
  }

  public String getApelido() {
    return this.apelido;
  }

  public int getNivel() {
    return this.nivel;
  }

  public void setNivel(int novoNivel) {
    this.nivel = novoNivel;
  }

  public int getPontos() {
    return this.pontos;
  }

  public void setPontos(int pontosNovos) {
    this.pontos = pontosNovos;
  }
}