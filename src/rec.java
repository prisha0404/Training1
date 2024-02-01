import java.util.Scanner;

public class rec {
    public static void main(String[] args) {
        System.out.println("simple calculator");
                float pi=3.14f;
                int l,b,h,r;
                String shapes;
                Scanner scanner=new Scanner(System.in);
                System.out.println("enter the shapes");
                shapes=scanner.next();
                switch (shapes){
                    case"circle":
                        System.out.println("enter the radius");
                        r=scanner.nextInt();
                        System.out.println(pi*r*r);
                        break;
                    case"triangle":
                        System.out.println("enter the length");
                        l=scanner.nextInt();
                        System.out.println("enter the b");
                        b=scanner.nextInt();
                        System.out.println(2*l*b);
                        break;
                    case"rectangle":
                        System.out.println("enter the length");
                        l=scanner.nextInt();
                        System.out.println("enter the b");
                        b=scanner.nextInt();
                        System.out.println(l*b);
                        break;
                    default:
                        System.out.println("nothing");
                        break;

                }

    }
}
