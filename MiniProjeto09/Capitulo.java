import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @javadoc
 *          Classe Capitulo com todos os atributos privados com arraylist
 *          referenciando ao objeto escolha.
 */
public class Capitulo {
  private String name;
  private String text;
  protected ArrayList<Escolha> esc;
  private Personagem personagem;
  private int alteracaoenergia;
  
  protected Capitulo()
  {

  }
  Capitulo(String name,
      String text,
      Personagem personagem,
      int alteracaoenergia) {

    this.name = name;
    this.text = text;
    this.esc = new ArrayList<Escolha>();
    this.personagem = personagem;
    this.alteracaoenergia = alteracaoenergia;

  }

  public Capitulo(
      HashMap<String, Personagem> personagens,
      Scanner escaneadorArquivoCapitulo) {
    this.leitura(personagens, escaneadorArquivoCapitulo);
    this.esc = new ArrayList<Escolha>();
  }

  protected void leitura(HashMap<String, Personagem> personagens,
      Scanner escaneadorArquivoCapitulos) {
    escaneadorArquivoCapitulos.nextLine();
    this.name = escaneadorArquivoCapitulos.nextLine();
    escaneadorArquivoCapitulos.nextLine();
    this.text = escaneadorArquivoCapitulos.nextLine();
    escaneadorArquivoCapitulos.nextLine();
    this.personagem = personagens.get(escaneadorArquivoCapitulos.nextLine());
    escaneadorArquivoCapitulos.nextLine();
    this.alteracaoenergia = Integer.parseInt(escaneadorArquivoCapitulos.nextLine());
  }

  public void adicioneEscolha(Escolha escolhas) {
    this.esc.add(escolhas);
  }

  public String getNome() {
    return this.name;
  }

  public String getTexto() {
    return this.text;
  }

  public String variacaoEnergiaPersonagem() {
    return this.personagem.alterarEnergia(this.alteracaoenergia);
  }

  public ArrayList<Escolha> getEscolhas() {
    return this.esc;
  }
}
