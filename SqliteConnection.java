/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elkhatib;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.AlertView;


public class SqliteConnection {

    static Connection con = null;

    public static void connect_db() {

        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Asus Group\\Desktop\\Elkhatib\\db\\Elkhatib.db");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

    public static boolean login(String username, String password) {
        int flag = 0;
        try {
            PreparedStatement pre
                    = con.prepareStatement("SELECT * FROM users where username=?");
            pre.setString(1, username);
            ResultSet res = pre.executeQuery();
            while (res.next()) {
                System.out.println(res.getString(2) + " - " + res.getString(3));
                if (res.getString(3).equals(password)) {
                    flag = 1;
                    break;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error: SqliteConnection.java: login()\n" + ex.getMessage());
        }
        if (flag == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        connect_db();
        System.out.println(login("admin", "Admin123"));
    }
}
