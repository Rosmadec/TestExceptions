package exceptions;

public class TestException {
    public static void method3(){
        System.out.println("BEGIN method3");
        int value = (int) (Math.random()*3);
        int res = 1/value;
        System.out.println("Res == " + res);
        System.out.println("END method3");
    }

    public static void method2(){
        System.out.println("BEGIN method2");
        method3();
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
