import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CapituloImg extends Capitulo {
    private String imagem;

    public CapituloImg(
            HashMap<String, Personagem> personagens,
            Scanner escaneadorArquivoCapitulo) {
        this.leitura(personagens, escaneadorArquivoCapitulo);
        this.esc = new ArrayList<Escolha>();
    }

    @Override
    protected void leitura(
            HashMap<String, Personagem> personagens,
            Scanner escaneadorArquivoCapiulos) {
        String linha = escaneadorArquivoCapiulos.nextLine();
        linha = escaneadorArquivoCapiulos.nextLine();
        this.imagem = linha;
        linha = escaneadorArquivoCapiulos.nextLine();
        while (!linha.equals("<FIM_DA_IMAGEM/>")) {
            this.imagem = this.imagem + "\n" + linha;
            linha = escaneadorArquivoCapiulos.nextLine();
        }
        super.leitura(personagens, escaneadorArquivoCapiulos);
    }

    public String getImagem() {
        return this.imagem;
    }
}
