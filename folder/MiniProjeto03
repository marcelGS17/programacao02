import java.util.Scanner;

class Capitulo {

    String nome;
    String texto;
    String escolha1;
    String escolha2;
    Personagem personagem;
    int ModificadorDeEnergia;
    Scanner leitor = new Scanner(System.in);

    int Resposta;

    public Capitulo(String NomeDoCapitulo, String TextoDoCapitulo, String Escolha1DoCapitulo,
            String Escolha2Docapitulo, Personagem PersonaDoCapitulo, int AlteracaoDeEnergiaDoCapitulo)

    {
        this.nome = NomeDoCapitulo;
        this.texto = TextoDoCapitulo;
        this.escolha1 = Escolha1DoCapitulo;
        this.escolha2 = Escolha2Docapitulo;
        this.personagem = PersonaDoCapitulo;
        this.ModificadorDeEnergia = AlteracaoDeEnergiaDoCapitulo;
    }

    public void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.texto);
        System.out.println();
        System.out.println("- "+ this.escolha1);
        System.out.println();
        System.out.println("- " + this.escolha2);
        

        if (ModificadorDeEnergia > 0) {
            this.personagem.ModificadorDeEnergia(ModificadorDeEnergia);
        }
    }

    public int escolher() {
        
    Scanner leitor = new Scanner(System.in);
       int verificado = 0;

       while(verificado == 0){



       if(escolha1 != null && escolha2 != null)
       {
     
         System.out.println("Resposta: ");
         String Resposta = leitor.next();
         if(verificado == 0){
            System.out.println("Digite uma reposta valída");
         }

         if(Resposta.equals(escolha1))
         {
            verificado = 1;
         }
         
         if(Resposta.equals(escolha2))
         {
            verificado = 2;
         }

       } 
    }
       return verificado;

    
    }
}
