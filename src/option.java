import java.util.Scanner;

public class option {
    public static void main(String[] args) {
        int a,b,result;
        Scanner scanner=new Scanner(System.in);
        String option;
        char operation;

        while(true){
            System.out.println("running");
            System.out.println("enter the operation");
            operation=scanner.next().charAt(0);
            switch(operation){
                case '+':
                    System.out.println("enter the numbers a:");
                    a= scanner.nextInt();
                    System.out.println("enter the number b:");
                    b= scanner.nextInt();
                    System.out.println(a+b);
                    break;
                case '-': System.out.println("enter the numbers a:");
                    a= scanner.nextInt();
                    System.out.println("enter the number b:");
                    b= scanner.nextInt();
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println("enter the numbers a:");
                    a= scanner.nextInt();
                    System.out.println("enter the number b:");
                    b= scanner.nextInt();
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println("enter the numbers a:");
                    a= scanner.nextInt();
                    System.out.println("enter the number b:");
                    b= scanner.nextInt();
                    System.out.println(a/b);
                    break;
                default:
                    System.out.println("nothing");
                    break;



            }
            System.out.println("continue");
            option=scanner.next();
            if(option.equals("no")){
                System.out.println();
                break;
            }


        }
    }
}