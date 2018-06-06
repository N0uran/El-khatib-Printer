/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elkhatib;

import javafx.scene.control.AlertView;
import elkhatib.SqliteConnection;
import javafx.fxml.FXML;
import javafx.scene.control.AlertView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author Farag
 */
public class LoginController {

    @FXML
    private TextField tf_username;

    @FXML
    private PasswordField pf_password;

    static {
        SqliteConnection.connect_db();
    }

    private String username;

    public void getlogin() {
        username = tf_username.getText();
        String password = pf_password.getText();

        if (username.equals("") || password.equals("")) {
            AlertView.getDialog(javafx.scene.control.AlertView.ERROR, "Error", " Empty Fields Not Allowed :)");
        } else {
            System.out.println(username + "-" + password);
            boolean b = SqliteConnection.login(username, password);
            System.out.println(b);
            if (b == false) {
                AlertView.getDialog(javafx.scene.control.AlertView.ERROR, "Error", " Login Failed  :)");
            } else {
                AlertView.getDialog(javafx.scene.control.AlertView.INFORMATION, "Information ", "", "Login Success :)");
            }
        }
    }
}
