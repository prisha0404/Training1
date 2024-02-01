import java.util.InputMismatchException;
import java.util.Scanner;

public class sampleexception {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scanner=new Scanner(System.in);
        try {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            System.out.println(num1 / num2);
        }catch(InputMismatchException err){
            System.out.println(err);

        }catch(Exception err){
            System.out.println(err);
        }


        }
    }

