import java.util.HashMap;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class Controlar {

    @FXML
    private Button botaoCarregar;

    @FXML
    private VBox espaçoBotoes;

    @FXML
    private Label imagemCap;

    @FXML
    private TextArea textoCap;

    @FXML
    void carregar(ActionEvent event) {
        CarregaArquivo ler = new CarregaArquivo();
        HashMap<String, Personagem> personagens = ler.lerpersonas(
                "rsc/personagens.txt");
        HashMap<String, Capitulo> capitulos = ler.lerCaps(
                "rsc/capitulos.txt", personagens);
        Capitulo raiz = capitulos.get("cap1");
        mostrarCapitulo(raiz);
    }

    void mostrarCapitulo(Capitulo capitulo) {

        imagemCap.setText("");
        try {
            CapituloImg capituloImagem = (CapituloImg) capitulo;
            imagemCap.setText(capituloImagem.getImagem());
        } catch (Exception e) {
            System.out.println(e);
        }

        textoCap.clear();
        textoCap.clear();
        espaçoBotoes.getChildren().clear();

        textoCap.setText("\n OBS: {O charada sempre estará de olho em você Morcego !}" + "\n"
                + "\n" + capitulo.getNome()
                + "\n" + capitulo.getTexto() + "\n" +
                capitulo.variacaoEnergiaPersonagem());

        if (capitulo.getEscolhas().size() > 0) {
            for (Escolha escolha : capitulo.getEscolhas()) {

                Button botao = new Button(escolha.getTextovisivel());
                botao.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        mostrarCapitulo(escolha.getProxc());
                    }
                });

                espaçoBotoes.getChildren().add(botao);
            }
        }
    }
}
