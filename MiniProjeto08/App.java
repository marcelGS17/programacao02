/**  
 *@version Mini-Projeto-08
 * @author Marcel Gustavo
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @javadoc 
 * Método main do meu código que executa a interação com os objetos das outras classes,ou seja,
 * as chamadas é o ponto de entrada do meu executável.
*/
class App {
  public static void main(String[] argas) {
    Scanner escaneador = new Scanner(System.in);
    CarregaArquivo ler = new CarregaArquivo();
    HashMap<String, Personagem> personagens = ler.lerpersonas(
      "rsc/personagens.txt");
    HashMap<String, Capitulo> capitulos = ler.lerCaps(
      "rsc/capitulos.txt", personagens,
        escaneador);

    Capitulo raiz = capitulos.get("cap1");

    raiz.mostrarinfo();
    escaneador.close();
  }

}
