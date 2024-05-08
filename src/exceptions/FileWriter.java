package exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class FileWriter {

    public static void saveDataTryWithResources(){

        try(FileOutputStream fos = new FileOutputStream("save.data")){

            fos.write("ok3".getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Ecriture terminée (TWR)");
    }



    public static void saveDataFinally() {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("save.data");
            fos.write("OK".getBytes());

        } catch (IOException exception){
            exception.printStackTrace();

        } finally {
            //System.out.println("In the finally block");
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Ecriture terminée");
    }

    // Exemple avec une connection à une BDD
    // Les classes Connection, PreparedStatement et ResultSet sont autoclosable
    public void connectToDataBase(){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Webstore", "login", "pass")){
            String sql = "Select * from T_Users where login = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)){
                statement.setString(1, "bond");
                try (ResultSet resultSet = statement.executeQuery()){
                    // TODO
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {


        //saveDataFinally();
        saveDataTryWithResources();


    }
}
