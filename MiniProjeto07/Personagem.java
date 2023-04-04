public class Personagem {
  private String nomepers;
  private int energiapers;

  Personagem(String nome, int energia) {
    this.nomepers = nome;
    this.energiapers = 100;
  }
  /* 
public int getEnergia()
{
return this.energiapers;
}
*/
//MÉTODO SET DE ENERGIA
public void setEnergia(int energia) {
  if (energia <= 0) {
      energia = 0;
      System.out.println(this.nomepers + " foi derrotado.");
  } else if (energia > 100) {
      energia = 100;
  }

  this.energiapers = energia;
}

  void alterarEnergia(int alteracao) {
    this.energiapers = this.energiapers + alteracao;

    if (alteracao > 0) {
      System.out.println("Este movimento, impactou no cavaleiro " + this.nomepers + " restaurando " + alteracao
          + " Pontos de Energia. ");
    } else {
      System.out.println("Este movimento, impactou no cavaleiro " + this.nomepers + " consumindo " + alteracao
          + " Pontos de Energia. ");
    }
    this.setEnergia(this.energiapers + alteracao);
  

    /*if (this.energiapers > 100) {
      this.energiapers = 100;
    } else if (this.energiapers < 0) {
      this.energiapers = 0;
      System.out.println(this.nomepers + " foi derrotado.");
    } */
  }

}
