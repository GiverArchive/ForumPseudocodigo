public class Niveis {

  public static final int ULTIMO_NIVEL = 100;

  public static void main(String[] args) {
    Jogador reds = new Jogador("Reds", 100, 150);
    Jogador akira = new Jogador("Akira", 89, 1000);
    Jogador snow = new Jogador("Snow", 100, 1000);
    Jogador neraid = new Jogador("Neraid", 74, 980);
    Jogador chep = new Jogador("Chep", 45, 240);
    Jogador dio = new Jogador("Dio", 72, 1000);
    Jogador felps = new Jogador("Felps", 49, 810);
    Jogador jayesi = new Jogador("Jayesi", 64, 512);
    Jogador gld = new Jogador("GLD", 100, 450);
    Jogador gabriel = new Jogador("Gabriel", 84, 869);
    Jogador sonico = new Jogador("Sonicio", 100, 1000);
    Jogador avesso = new Jogador("Avesso", 78, 1000);
    Jogador migke = new Jogador("Mig", 68, 710);
    Jogador defmc = new Jogador("Defmc", 100, 980);
    Jogador giovany = new Jogador("Giovany", 47, 1000);
    Jogador andrade = new Jogador("andrade", 93, 1000);
  
    testarNivel(reds);
    testarNivel(akira);
    testarNivel(snow);
    testarNivel(neraid);
    testarNivel(chep);
    testarNivel(dio);
    testarNivel(felps);
    testarNivel(jayesi);
    testarNivel(gld);
    testarNivel(gabriel);
    testarNivel(sonico);
    testarNivel(avesso);
    testarNivel(migke);
    testarNivel(defmc);
    testarNivel(giovany);
    testarNivel(andrade);
  }

  public static void testarNivel(Jogador jogador) {
    System.out.printf("%s %s de nível%n", 
        jogador.getApelido(), 
        passarDeNivel(jogador) ? "passou" : "não passou");
  }
 
  public static boolean passarDeNivel(Jogador jogador) {
    int nivel = jogador.getNivel();

    if(nivel == ULTIMO_NIVEL) {
      return false;
    }

    int pontos = jogador.getPontos();

    if(pontos >= 1000) {
      jogador.setPontos(0);
      jogador.setNivel(++nivel);
      return true;
    }

    return false;
  }
}