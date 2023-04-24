import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * @javadoc
 *          classe CarregaArquivo que tem a função de criar hashmap, ou seja, um
 *          dicionário através
 *          de um conjunto de pares de chave-valor, para cada elemento, que será
 *          lido nos arquivos txt,
 *          que tem o objetivo de capturar as escolhas, personagens e capitulos
 *          da história, estabelecendo
 *          assim conexão entre os objetos.
 */

public class CarregaArquivo {
  HashMap<String, Personagem> lerpersonas(String caminhoArquivoPersonagens) {
    HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
    File arquivoPersonagens = new File(caminhoArquivoPersonagens);

    try {
      Scanner escaneadorArquivoPersonagens = new Scanner(arquivoPersonagens, "UTF-8");

      String nomePersonagem = "";
      String linhaEscaneada = "";
      int energiaPersonagem = 0;
      while (escaneadorArquivoPersonagens.hasNextLine()) {
        while (!linhaEscaneada.equals("<PERSONAGEM>")) {
          linhaEscaneada = escaneadorArquivoPersonagens.nextLine();
        }
        linhaEscaneada = escaneadorArquivoPersonagens.nextLine();
        nomePersonagem = escaneadorArquivoPersonagens.nextLine();
        linhaEscaneada = escaneadorArquivoPersonagens.nextLine();
        energiaPersonagem = Integer.parseInt(escaneadorArquivoPersonagens.nextLine());
        personagens.put(nomePersonagem, new Personagem(nomePersonagem,
            energiaPersonagem));
      }

      escaneadorArquivoPersonagens.close();
    } catch (FileNotFoundException exception) {
      exception.printStackTrace();
    }
    return personagens;
  }

  HashMap<String, Capitulo> lerCaps(String caminhoArquivoCapitulos,
      HashMap<String, Personagem> personagens) {
    HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();
    File arquivoCapitulos = new File(caminhoArquivoCapitulos);

    try {
      Scanner escaneadorArquivoCapitulos = new Scanner(arquivoCapitulos, "UTF-8");

      String linhaEscaneada = "";

      while (escaneadorArquivoCapitulos.hasNextLine()) {
        while (!linhaEscaneada.equals("<CAPITULO_COM_IMAGEM>") &&
            !linhaEscaneada.equals("<CAPITULO>") &&
            !linhaEscaneada.equals("<ESCOLHA>")) {
          linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
        }
        if (linhaEscaneada.equals("<CAPITULO_COM_IMAGEM>")) {
          CapituloImg capitulo = new CapituloImg(
              personagens,
              escaneadorArquivoCapitulos);

          capitulos.put(capitulo.getNome(), capitulo);

          linhaEscaneada = "";
        }

        if (linhaEscaneada.equals("<CAPITULO>")) {
          Capitulo capitulo = new Capitulo(
              personagens,
              escaneadorArquivoCapitulos);

          capitulos.put(capitulo.getNome(), capitulo);

          linhaEscaneada = "";
        } else if (linhaEscaneada.equals("<ESCOLHA>")) {
          lerEsco(capitulos,
              escaneadorArquivoCapitulos);
          linhaEscaneada = "";
        }
      }
      escaneadorArquivoCapitulos.close();
    } catch (FileNotFoundException exception) {
      exception.printStackTrace();
    }
    return capitulos;
  }

  private void lerEsco(HashMap<String, Capitulo> capitulos,
      Scanner escaneadorArquivoCapitulos) {
    String nomeCapituloOrigem;
    String textoDigitado;
    String textoMostrado;
    String nomeCapituloDestino;
    String linhaEscaneada;
    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
    nomeCapituloOrigem = escaneadorArquivoCapitulos.nextLine();
    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
    textoDigitado = escaneadorArquivoCapitulos.nextLine();
    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
    textoMostrado = escaneadorArquivoCapitulos.nextLine();
    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
    nomeCapituloDestino = escaneadorArquivoCapitulos.nextLine();

    capitulos.get(nomeCapituloOrigem).adicioneEscolha(
        new Escolha(textoDigitado, capitulos.get(nomeCapituloDestino), textoMostrado));
  }
}
