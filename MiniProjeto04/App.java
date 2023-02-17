import java.util.Scanner;

class App {
    public static void main(String[] argas) {
    Scanner escaneador = new Scanner(System.in);

    Personagem Espantalho = new Personagem("Espantalho", 100);
    Personagem Batman = new Personagem("Batman", 100);

    //capitulo 01 introdução a história
    Capitulo cap1 = new Capitulo(
    "Bem-Vindo a Gotham City aqui quem manda na cidade são os pesadelos do Batman, "+
    " que vem direto do asilo de Arkham City, "+
    " O coringa e o charada tem uma mensagem importante para você . "+
    "BATMAN hahahha!!!!"+
    "--Sonho ou Pesadelo? --\n\n",
    "Em uma de suas missões Batman é pego pela toxina do espantalho...\n\n" +
    "Um pouco tonto Batman acorda e se vê pendurado na torre de um relógio...\n" +
    "No entanto aparece o Espantalho gigante a sua frente..." +
    "E ele lhe faz uma proposta com um olhar ameaçador...\n" +
    "-- Então Batman me diga se você quer ver o vislumbre futuro de Gotham?\n" +
    "Você deseja cortar a corda do relógio?\n",
   new String[]{"sim","nao"},// chamada das escolhas em cada capitulo no main
     Batman, 
     0, 
     escaneador);  

   //capitulo 02 da história
   Capitulo cap2 = new Capitulo(
      "-- O salto na mente?--\n\n",
      "Ao cortar a corda, Batman despenca em um buraco enorme...\n" +
      "E ao cair ele entra nos profundos pesadelos do Espantalho.\n" +
      "No entanto Batman já sabia o que iria enfrentar e precisaria neutralizar a toxina...\n" +
      "Entretanto os pesadelos pareciam cada vez piores e o verdadeiro espantalho aparece na sua frente...\n" +
      "Ou será mais uma ilusão da sua mente?\n" +
      "Batman decide neutralizar a toxina ou enfrentar o espantalho?\n",
     new String[]{"curar", 
     "lutar","buscar ajuda"}, 
     Batman, 
     0, 
     escaneador);

     //capitulo 03 da história
     Capitulo cap3 = new Capitulo(
      "-- A saída--\n\n",
      "Ao neutralizar a toxina Batman, recupera sua consciência\n" +
      "no entanto espantalho tentava fugir, ele havia deixado Batman preso em um fábrica com explosivos...\n" +
      "Mais como Batman é esperto ele uso seus equipamentos a seu favor.\n" +
      "--Volte espantalho isso aqui não acabou!\n" +
      "Espantalho corre imediatamente e acaba tropecendo.\n" +
      "E sem perceber a pouco tempo atrás o próprio Batman havia injetado toxina no espantalho...\n" +
      "-- O que é isso estou vendo milhares de morcegos, SAIAM DA MINHA FRENTE!\n" +
      "e derrepente surge o verdadeiro Batman na sua frente e o noucauteia.\n" +
      "E FINALMENTE Batman o derrota saindo daquele pesadelo terrível e o levando a prisão.\n"  +
      "Espantalho é pego e perde 100 de vida.\n" +
      "Parabéns você trouxe Justiça e GOTHAM agora pode ter uma noite tranquila!\n",
           null, //caso não tenha escolha fica definido como vazio
           Espantalho, 
           -100, 
           escaneador);

           //capitulo 04 da história
           Capitulo cap4 = new Capitulo(
            "-- A fuga--\n\n",
            "Ao tentar golpear o espantalho a sua frente...\n" +
            "O Batman acaba caindo em mais uma de suas ilusões...\n" +
            "-- O que foi Batman não sabe disntinguir o que é real?\n" +
            "Espantalho começa a ataca-lo... \n" +
            "Porem com as impressionantes habilidades de combate do Batman ele consegue o superar.\n" +
            "E espantalho desiste de tentar mata-lo e começa a correr para a sua rota de fuga.\n" +
            "E o Batman mesmo atordoado vai persegui-lo\n" +
            "--Você já não aguenta mais Batman as toxinas,estão o ferindo gravemente.\n" +
            "-- Volte aki espantalho eu irei derrota-lo.\n" +
            "Ao passar muito tempo com a toxina na pele,Batman desmaia perdendo 50 de vida...\n" +
            "DEIXANDO ASSIM O ESPANTALHO FUGIR DAS MÃOS DO VIGILANTE MASCARADO!",               
                null,
                 Batman, 
                 10, 
                 escaneador);

                //capitulo 05 da história
                 Capitulo cap5 = new Capitulo(
                  "-- O caos --\n\n",
                  "Batman decide não cortar a corda.\n" +
                  "no entanto ao esperar demais o nosso vigilante mascarado inala muita toxina do espantalho\n" +
                  "e com isso começa a enlouquecer e gritar com as dores fortes...\n" +
                  "Fazendo o Batman perder 90 de sua vitalidade\n\n" +
                  "E sem o héroi mascarado para proteger Gotham a cidade sucumbiu nas mãos do espantalho...\n" +
                  "Ele libertou todos os vilões do Asilo de ARKHAM\n" +
                  "E algum tempo depois Batman foi encontrado em uma das celas principais,porém ele já não era mais o mesmo...\n" +
                  "Estava plenamente louco e ferido das torturas do espantalho.\n\n" +
                  "E COM ISSO VOCÊ DEIXOU GOTHAM NAS MÃOS DO INIMIGOS.FIM!\n",                 
                 null,
                 Batman, 
                 -100, 
                 escaneador);
                
                 //capitulo 06 da história
                 Capitulo cap6 = new Capitulo(
                  "--A mão amiga--\n\n",
                  "O batman ganha a ajuda de uma parceiro no combate ao crime, \n" +
                  "em uma de suar perseguições atrás de bandidos o batman conhece seu parceiro Robin\n" +
                  "conhecido como o menino Prodígio...",
                   null, 
                   Batman, 
                   +100, 
                   escaneador);

          cap1.mostrarinfo();
          int primeira = cap1.selecao();
          if(primeira == 0){
                cap2.mostrarinfo();
                int segundo = cap2.selecao();
                if( segundo == 0){
                      cap3.mostrarinfo();
                }
                else if( segundo == 1){
                  cap4.mostrarinfo();
            }
            else if( segundo == 2){
                  cap6.mostrarinfo();
            }
                else if(primeira == 0){
                      cap5.mostrarinfo();

                }
          }
                else if (primeira == 1){
                      cap5.mostrarinfo();
                }
                escaneador.close();
          }
          
    }
