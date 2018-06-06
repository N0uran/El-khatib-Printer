/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.scene.control;

/**
 *
 * @author Asus Group
 */
public class AlertView {
    public static AlertType ERROR;
    public static AlertType INFORMATION;

     public static void getDialog(AlertView.AlertType type,
            String title, String header, String content) {
        AlertView alert;
         alert = new AlertView(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    
}

    public static void getDialog(AlertType ERROR, String error, String _Empty_Fields_Not_Allowed_) {
        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
    }

    private AlertView(AlertType type) {
        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
    }

    public void  Alert(AlertType type) {
        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTitle(String title) {
        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
    }

    private void setHeaderText(String header) {
        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
    }

    private void setContentText(String content) {
        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
    }

    private void showAndWait() {
        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
    }

    private static class AlertType {

        public AlertType() {
        }
    }

    
}
