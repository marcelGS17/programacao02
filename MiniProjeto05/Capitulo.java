import java.util.Scanner;
import java.util.ArrayList;


public class Capitulo {

    String name;
    String text;
    ArrayList<Escolha>esc;//array list referenciando ao objeto escolha
    //String[] esc; // atributo escolhas da classe capitulo que antes era criado varios atributos para n escolhas
    Personagem personagem; 
    int alteracaoenergia;
    Scanner input;

   Capitulo (String name,
   String text,
  // String[] esc, //construtor do array da classe capitulo
   Personagem personagem,
   int alteracaoenergia,
   Scanner input)
{

    this.name = name;
    this.text = text;
    this.esc = new ArrayList<Escolha>();//inicializando dentro do construtor
    this.personagem = personagem; 
    this.alteracaoenergia = alteracaoenergia;
    this.input = input;

}

//metodo mostra da classe capitulo
void mostrarinfo(){

   System.out.println("\n OBS: {O charada sempre estará de olho em você Morcego !} ");
   System.out.println(this.name);
   System.out.println(this.text);
   this.personagem.alterarEnergia(alteracaoenergia);

   // esse if verifica se a escolha está vazio ou não para retornar na chamada
   if(this.esc.size() != 0)
   {
       for(int i = 0; i < esc.size(); i ++)
       {
           System.out.println(" - " + esc.get(i).textmos);
       }
       System.out.println();
       int Idesc = selecao();
       this.esc.get(Idesc).pcap.mostrarinfo();//captura a escolha referenciando ao proximo capitulo que será mostrado
     
   }
   
  System.out.println();
}
//loop de verificação, que caso o resultado seja diferente de nulo ele retorna uma posição do indice 
//escolhido através de uma incrementação
int selecao()
{
    int result = -1;

    if (esc != null)
    {
    while(result == -1)
    {
        System.out.print("Faça escolha: ");
        String recebe = input.nextLine();

        for (int i = 0; i < esc.size(); i ++){
            if(recebe.equals(esc.get(i).text))
            {
                result = i;
            }
        }

    }
    System.out.println();
    }
    return result;
  }
}
