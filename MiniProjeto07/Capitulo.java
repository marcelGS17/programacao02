import java.util.Scanner;
import java.util.ArrayList;

public class Capitulo {
//Como privado os atributos da classe Capítulo
  private String name;
  private String text;
  private ArrayList<Escolha> esc;// array list referenciando ao objeto escolha
  private Personagem personagem;
  private int alteracaoenergia;
  private Scanner input;
  public Object adicioneEscolha;


  Capitulo(String name,
      String text,
      Personagem personagem,
      int alteracaoenergia,
      Scanner input) 
  {

    this.name = name;
    this.text = text;
    this.esc = new ArrayList<Escolha>();// inicializando dentro do construtor
    this.personagem = personagem;
    this.alteracaoenergia = alteracaoenergia;
    this.input = input;
  }

  // metodo mostra da classe capitulo
  //metodo public as informações mostrados na main
  public void mostrarinfo() {

    System.out.println("\n OBS: {O charada sempre estará de olho em você Morcego !} ");
    System.out.println(this.name);
    System.out.println(this.text);
    this.personagem.alterarEnergia(alteracaoenergia);

    // esse if verifica se a escolha está vazio ou não para retornar na chamada
    if (this.esc.size() != 0) {
      for (int i = 0; i < esc.size(); i++) {
        System.out.println(" - " + esc.get(i).getTextovisivel());
      }
      System.out.println();
      int Idesc = selecao();
      this.esc.get(Idesc).getProxc().mostrarinfo();// captura a escolha referenciando ao proximo capitulo que será mostrado

    }

    System.out.println();
  }

  // loop de verificação, que caso o resultado seja diferente de nulo ele retorna
  // uma posição do indice
  // escolhido através de uma incrementação
  private int selecao() {
    int result = -1;

    if (esc != null) {
      while (result == -1) {
        System.out.print("Faça escolha: ");
        String recebe = input.nextLine();

        for (int i = 0; i < esc.size(); i++) {
          if (recebe.equals(esc.get(i).getTextdigitado())) {
            result = i;
          }
        }

      }
      System.out.println();
    }
    return result;
  }
  //Método de adicionar escolha no array list que impede alguma modificação direta no Main
  //Que é bem parecido ao método set
  public void adicioneEscolha(Escolha escolhas)
  {
   this.esc.add(escolhas);
  }
}
