// Problema: O jogador pode passar para o próximo nível?
// Autor: Will

const ULTIMO_NIVEL = 100;

function Player(apelido, nivel, pontos) {
  this.apelido = apelido;
  this.nivel = nivel;
  this.pontos = pontos;
}

function passarDeNivel(player) {
  if(player.nivel === ULTIMO_NIVEL) {
    return false;
  }

  if(player.pontos >= 1000) {
    player.nivel++;
    player.pontos = 0;
    return true;
  }

  return false;
}

function testarNivel(player) {
  console.log(`${player.apelido} ${passarDeNivel(player) ? "passou" : "não passou"} de nível.`);
}

const mario = new Player("Mario", 10, 250);
const jose = new Player("José", 100, 810);
const ana = new Player("Ana", 87, 1000);
const will = new Player("Will", 75, 1024);
const giver = new Player("Giver", 100, 1000);

testarNivel(mario);
testarNivel(jose);
testarNivel(ana);
testarNivel(will);
testarNivel(giver);