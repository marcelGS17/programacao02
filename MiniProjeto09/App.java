
/**  
 *@version Mini-Projeto-09
 * @author Marcel Gustavo
 */
import java.util.Scanner;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.HashMap;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @javadoc
 *          Método main do meu código que executa a interação com os objetos das
 *          outras classes,ou seja,
 *          as chamadas é o ponto de entrada do meu executável.
 */
public class App extends Application {
  public static void main(String[] args) throws IOException, InterruptedException {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    FXMLLoader fmxLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
    Parent root = fmxLoader.load();
    Scene tela = new Scene(root);

    primaryStage.setTitle("História Interativa");
    primaryStage.setScene(tela);
    primaryStage.show();
  }
}
