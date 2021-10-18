// Problema: O jogador pode passar para o próximo nível?
// Autor: Will

const ULTIMO_NIVEL = 100;

function Jogador(apelido, nivel, pontos) {
  this.apelido = apelido;
  this.nivel = nivel;
  this.pontos = pontos;
}

function passarDeNivel(jogador) {
  const { nivel, pontos } = jogador;

  if(nivel === ULTIMO_NIVEL) {
    return false;
  }

  if(pontos >= 1000) {
    jogador.nivel++;
    jogador.pontos = 0;
    return true;
  }

  return false;
}

function testarNivel(jogador) {
  console.log(`${jogador.apelido} ${passarDeNivel(jogador) ? "passou" : "não passou"} de nível.`);
}

const mario = new Jogador("Mario", 10, 250);
const jose = new Jogador("José", 100, 810);
const ana = new Jogador("Ana", 87, 1000);
const will = new Jogador("Will", 75, 1024);
const giver = new Jogador("Giver", 100, 1000);

testarNivel(mario);
testarNivel(jose);
testarNivel(ana);
testarNivel(will);
testarNivel(giver);