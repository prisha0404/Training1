package timemgmt;

public class constructor {
    public static void main(String[]args){
        printer(add(10,89));


    }
    public static int add(int a,int b) {
        return a + b;
    }

    public static int add(int a,int b,int c){
        return a+b+c;
    }
        public static void printer(int result) {
            System.out.println("total value:" + result);

    }
}
