/**
 
                  *Mini-Projeto 07-Programação-02-Aluno: Marcel Gustavo.*
 
*/
 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

class App {
  public static void main(String[] argas) {
    Scanner escaneador = new Scanner(System.in);
    CarregaArquivo ler = new CarregaArquivo();
    HashMap<String, Personagem> personagens = ler.lerpersonas("rsc/personagens.txt");
    HashMap<String, Capitulo> capitulos = ler.lerCaps("rsc/capitulos.txt", personagens, 
                                                                                   escaneador);   

    Capitulo raiz = capitulos.get("cap1");

    raiz.mostrarinfo();
    escaneador.close();
  }

}
