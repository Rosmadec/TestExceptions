package exceptions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdvancedException {

    public static void exportData() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Webstore", "login", "pass");
             FileOutputStream fos = new FileOutputStream("save.xml")) {

        } catch (SQLException | IOException exception) {
            System.out.println("In my catch block");
            exception.printStackTrace();
        /*}catch (SQLException exception){
            exception.printStackTrace();
        }*/

        }
    }

    public static void main(String[] args) {
        exportData();
    }




}
