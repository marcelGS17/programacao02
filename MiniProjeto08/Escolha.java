 /** 
 * @javadoc
 * Classe Escolha e seus atributos que serve de ligação entre os capítulos
 */
public class Escolha {
  private String text;
  private String textmos; 
  private Capitulo pcap;
   /** 
 * @javadoc
 * construtor da classe Escolha
 */ 
  public Escolha(String text, Capitulo pcap, String textmos) {

    this.text = text;
    this.textmos = textmos;
    this.pcap = pcap;
  }
  /** 
 * @javadoc
 * Método get que pega as informações que serão mostradas na tela do usuário como escolha.
 */ 
  public String getTextovisivel() {
    return this.textmos;
  }
/** 
 * @javadoc
 * Método get que pega as informações, refência ao objeto para o capitulo recebe escolhas,ou seja, 
 * qual será o próximo capítulo da história 'modelo arvore'.
 */ 
  public Capitulo getProxc() {
    return this.pcap;
  }
/** 
 * @javadoc
 * Método get que pega as informações que serão digitadas pelo usuário como escolha.
 */ 
  public String getTextdigitado() {
    return this.text;
  }

}
