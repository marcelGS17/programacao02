import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;
//Classe fazer a leitura dos arquivos
public class CarregaArquivo {
    //HashMap para ler os personagens
    HashMap<String, Personagem> lerpersonas(String caminhoArquivoPersonagens)
    {
        HashMap<String, Personagem> personagens= new HashMap<String, Personagem>();
        File arquivoPersonagens = new File(caminhoArquivoPersonagens);
//parametro de criação do arquivo personagens
    try
    {
     Scanner escaneadorArquivoPersonagens = new Scanner(arquivoPersonagens, "UTF-8");

     
     String nomePersonagem = "";
     String linhaEscaneada = "";
     int energiaPersonagem = 0;
     while (escaneadorArquivoPersonagens.hasNextLine()) 
     {
       while (!linhaEscaneada.equals("<PERSONAGEM>"))//Procura do nome personagem 
       {
         linhaEscaneada = escaneadorArquivoPersonagens.nextLine(); // Escaneador de Linha
       }
       linhaEscaneada = escaneadorArquivoPersonagens.nextLine();
       nomePersonagem = escaneadorArquivoPersonagens.nextLine(); // NOME
       linhaEscaneada = escaneadorArquivoPersonagens.nextLine();
       energiaPersonagem = Integer.parseInt(escaneadorArquivoPersonagens.nextLine()); // Energia
       personagens.put(nomePersonagem, new Personagem(nomePersonagem,
           energiaPersonagem));
    }

    escaneadorArquivoPersonagens.close();
    } 
   catch (FileNotFoundException exception) 
   {
     exception.printStackTrace();
   }
   return personagens;
 }

 HashMap<String, Capitulo> lerCaps(String caminhoArquivoCapitulos,
 HashMap<String, Personagem> personagens,
 Scanner escaneadorConsole)
{
        HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();
        File arquivoCapitulos = new File(caminhoArquivoCapitulos);
    
        try 
        {
          Scanner escaneadorArquivoCapitulos = new Scanner(arquivoCapitulos, "UTF-8");

          String linhaEscaneada = "";

         while (escaneadorArquivoCapitulos.hasNextLine()) 
    {
           while (!linhaEscaneada.equals("<CAPITULO>") && 
                  !linhaEscaneada.equals("<ESCOLHA>")) 
           {
             linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // Escaneador de Linha
           }
           
             if (linhaEscaneada.equals("<CAPITULO>")) 
        {
            lerCap(personagens,
                escaneadorConsole,
                capitulos,
                escaneadorArquivoCapitulos);

                linhaEscaneada = "";//reset na linha escaneada
        }
        else if (linhaEscaneada.equals("<ESCOLHA>"))
        {
            lerEsco(capitulos, 
                       escaneadorArquivoCapitulos);
            linhaEscaneada = "";
        }   
}
        escaneadorArquivoCapitulos.close();
    }
        catch (FileNotFoundException exception) 
        {
          exception.printStackTrace();
        }
        return capitulos;
}

private void lerCap(HashMap<String, Personagem> personagens,
      Scanner escaneadorConsole,
      HashMap<String, Capitulo> capitulos,
      Scanner escaneadorArquivoCapitulos) 
      {
    String nomeCapitulo;
    String textoCapitulo;
    String nomePersonagem;
    int variacaoEnergia = 0;
    String linhaEscaneada;
    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
    nomeCapitulo = escaneadorArquivoCapitulos.nextLine(); // NOME
    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
    textoCapitulo = escaneadorArquivoCapitulos.nextLine(); // TEXTO
    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
    nomePersonagem = escaneadorArquivoCapitulos.nextLine(); // NOME DO PERSONAGEM
    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
    variacaoEnergia = Integer.parseInt(escaneadorArquivoCapitulos.nextLine()); // Energia
    capitulos.put(nomeCapitulo, new Capitulo(nomeCapitulo,
        textoCapitulo,
        personagens.get(nomePersonagem),
        variacaoEnergia,
        escaneadorConsole));
  }

  private void lerEsco(HashMap<String, Capitulo> capitulos,
      Scanner escaneadorArquivoCapitulos) 
      {
    String nomeCapituloOrigem;
    String textoDigitado;
    String textoMostrado;
    String nomeCapituloDestino;
    String linhaEscaneada;
    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
    nomeCapituloOrigem = escaneadorArquivoCapitulos.nextLine(); // Capitulo de origem
    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
    textoDigitado = escaneadorArquivoCapitulos.nextLine(); // TEXTO que será digitado
    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
    textoMostrado = escaneadorArquivoCapitulos.nextLine(); // TEXTO que será mostrado no console
    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
    nomeCapituloDestino = escaneadorArquivoCapitulos.nextLine(); // Capitulo de Destino
    //Chamando o Capitulo origem para qual o proximo destino que ele vai seguir no programa
    capitulos.get(nomeCapituloOrigem).adicioneEscolha(
    new Escolha(textoDigitado, capitulos.get(nomeCapituloDestino), textoMostrado));
  }
}
