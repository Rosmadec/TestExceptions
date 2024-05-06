package exceptions;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestException {

    public static void method4(){
        System.out.println("BEGIN method4");
        try {
            FileOutputStream fos = new FileOutputStream("save.data");
            fos.write("Ok\n".getBytes());
            fos.close();
        }catch (Exception exception){
            System.out.println("Problème d'écriture fichier. Voulez-vous recommencer (Y/N) : ");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }
        System.out.println("END method4");
    }

    public static void method3(){
        System.out.println("BEGIN method3");
        int value = (int) (Math.random()*3);
        if (value == 0){
            throw new RuntimeException("Value cannot be null");
        } else {
            int res = 1 / value;
            System.out.println("Res == " + res);
        }
        System.out.println("END method3");
    }

    public static void method2(){
        System.out.println("BEGIN method2");
        method4();
        System.out.println("END method2");
    }

    public static void method1(){
        System.out.println("BEGIN method1");
        method2();
        System.out.println("END method1");
    }

    public static void main(String[] args) {
        System.out.println("BEGIN main");
        method1();
        System.out.println("END main");
    }

}
