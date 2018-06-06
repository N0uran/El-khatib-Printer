
package elkhatib;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author Farag
 */
public class Elkhatib extends Application {

    public static Stage loginStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        initLoginStage().show();
    }

    public Stage initLoginStage() throws IOException {
        loginStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/elkhatib/Login.fxml"));
        //
        loginStage.setScene(new Scene(root));
        //
        loginStage.setTitle("Sing In !");
        loginStage.setResizable(false);
        //mainStage.show();
        return loginStage;
    }

    public static void main(String[] args) {
        launch(args);
    }

}