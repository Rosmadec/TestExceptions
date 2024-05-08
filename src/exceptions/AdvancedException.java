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

        } catch (SQLException | IOException exception) { // multi catch possible depuis Java 7
            System.out.println("In my catch block");
            exception.printStackTrace();
        /*}catch (SQLException exception){
            exception.printStackTrace();
        }*/

        }
    }

    public static void exportData2() throws SQLException, IOException{
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Webstore", "login", "pass");
             FileOutputStream fos = new FileOutputStream("save.xml")) {

        } catch (Exception exception) { // multi catch possible depuis Java 7
            System.out.println("Partial handling - in my catch block");
            throw exception;
        }
    }

    public static void main(String[] args) {
        //exportData();
        try {
            exportData2();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
            System.out.println("End handling");
        }

    }




}
