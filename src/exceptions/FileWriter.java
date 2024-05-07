package exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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

    public static void main(String[] args) {


        //saveDataFinally();
        saveDataTryWithResources();


    }
}
