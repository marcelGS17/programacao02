import java.util.Scanner;
import java.util.ArrayList;

/**
 * @javadoc
 * Classe Capitulo com todos os atributos privados com arraylist referenciando ao objeto escolha.
 */
public class Capitulo {
  private String name;
  private String text;
  private ArrayList<Escolha> esc;
  private Personagem personagem;
  private int alteracaoenergia;
  private Scanner input;
  public Object adicioneEscolha;
/**
 * @javadoc
 * Construtor da classe Capitulo
 */
  Capitulo(String name,
      String text,
      Personagem personagem,
      int alteracaoenergia,
      Scanner input) {

    this.name = name;
    this.text = text;
    this.esc = new ArrayList<Escolha>();
    this.personagem = personagem;
    this.alteracaoenergia = alteracaoenergia;
    this.input = input;
  }

   /** 
 * @javadoc
 * método de mostrar as informações do personagem.
 * @param
 * no primeiro if compara se existe alguma escolha para ser mostrada diferente de vazio
 * linha 54 captura a escolha referenciando ao proximo capitulo que será mostrado na tela.
 */ 
  public void mostrarinfo() {

    System.out.println("\n OBS: {O charada sempre estará de olho em você Morcego !} ");
    System.out.println(this.name);
    System.out.println(this.text);
    this.personagem.alterarEnergia(alteracaoenergia);

    if (this.esc.size() != 0) {
      for (int i = 0; i < esc.size(); i++) {
        System.out.println(" - " + esc.get(i).getTextovisivel());
      }
      System.out.println();
      int Idesc = selecao();
      this.esc.get(Idesc).getProxc().mostrarinfo();
    }
    System.out.println();
  }

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

  /** 
 * @javadoc
 * método de adiciona escolha
 * @param this.esc.add(escolhas)
 * Controle de acesso para quem está fora da classe, impedi
 * modificação direta no meu main
 */ 
  public void adicioneEscolha(Escolha escolhas) {
    this.esc.add(escolhas);
  }
}
