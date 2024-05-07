package exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {

    public static void saveDataFinally() {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("save.data");
            fos.write("OK".getBytes());

        } catch (IOException exception){
            exception.printStackTrace();

        } finally {
            System.out.println("In the finally block");
        }

    }

    public static void main(String[] args) {


        saveDataFinally();


    }
}
