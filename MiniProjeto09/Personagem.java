/**
 * @javadoc
 *          classe Personagem e seus atributos
 */
public class Personagem {
  private String nomepers;
  private int energiapers;

  /**
   * @javadoc
   *          construtor da classe Personagem
   */
  public Personagem(String nome, int energia) {
    this.nomepers = nome;
    this.energiapers = 100;
  }

  /**
   * @javadoc
   *          método que realiza o controle de energia do personagem
   */
  public String setEnergia(int energia) {
    String recebe = "";
    if (energia <= 0) {
      energia = 0;
      System.out.println(this.nomepers + " foi derrotado.");
    } else if (energia > 100) {
      energia = 100;
    }
    return recebe;
  }

  public String alterarEnergia(int alteracao) {
    String recebe = "";

    if (alteracao > 0) {
      recebe = "Este movimento, impactou no cavaleiro " + this.nomepers + " restaurando "
          + alteracao
          + " Pontos de Energia. ";
    } else {
      recebe = "Este movimento, impactou no cavaleiro " + this.nomepers + " consumindo "
          + alteracao
          + " Pontos de Energia. ";
    }
    recebe = recebe + "\n" + this.setEnergia(this.energiapers + alteracao);
    return recebe;
    // this.setEnergia(this.energiapers + alteracao);
  }
}
