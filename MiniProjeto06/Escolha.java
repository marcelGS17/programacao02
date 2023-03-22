public class Escolha {
  private String text;// texto digitado
  private String textmos; // texto mostrado na tela
  private Capitulo pcap;// referencia ao objeto capitulo recebendo escolhas no conceito de hierarquia

  Escolha(String text, Capitulo pcap, String textmos) {

    this.text = text;
    this.textmos = textmos;
    this.pcap = pcap;
  }
//usando GET
  public String getTextovisivel()
  {
      return this.textmos;
  }

  public Capitulo getProxc()
  {
      return this.pcap;
  }

  public String getTextdigitado()
  {
      return this.text;
  }

}
