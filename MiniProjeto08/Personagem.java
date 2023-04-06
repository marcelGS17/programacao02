/** 
 * @javadoc
 * classe Personagem e seus atributos
 */
public class Personagem {
  private String nomepers;
  private int energiapers;
 /** 
 * @javadoc
 * construtor da classe Personagem
 */
  public Personagem(String nome, int energia) {
    this.nomepers = nome;
    this.energiapers = 100;
  }
 /** 
 * @javadoc
 * método que realiza o controle de energia do personagem
 */ 
  public void setEnergia(int energia) {
    if (energia <= 0) {
      energia = 0;
      System.out.println(this.nomepers + " foi derrotado.");
    } else if (energia > 100) {
      energia = 100;
    }

    this.energiapers = energia;
  }
 /** 
 * @javadoc
 * método set de alteração da energia do personagem na classe de maneira protegida o atributo
 */ 
  public void alterarEnergia(int alteracao) {
    this.energiapers = this.energiapers + alteracao;

    if (alteracao > 0) {
      System.out.println("Este movimento, impactou no cavaleiro " + this.nomepers + " restaurando " 
      + alteracao
      + " Pontos de Energia. ");
    } else {
      System.out.println("Este movimento, impactou no cavaleiro " + this.nomepers + " consumindo " 
      + alteracao
      + " Pontos de Energia. ");
    }
    this.setEnergia(this.energiapers + alteracao);
  }
}
