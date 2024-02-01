import java.util.ArrayList;
import java.util.Scanner;

public class users {
    public static int count=0;
    public String username;
    public ArrayList<String> medicinelist=new ArrayList<>();
    Scanner scanner =new Scanner(System.in);
    public users(String username){
        count++;
        this.username=username;
        getMedicineList();
        printMedicinelist();

    }
    public void getMedicineList(){
        String Medicine, cust;
        while(true){
            System.out.println("enter the medicine");
            Medicine=scanner.nextLine();
            System.out.println("do you want to add another medicine");
            cust=scanner.next();
            if(cust.equals("n")){
                break;

            }scanner.nextLine();
        }
    }
    public void printMedicinelist(){
        System.out.println("name:"+this.username);
        System.out.println("===============");
        System.out.println("Medicine List");
        for (String medicine:medicinelist){
            System.out.println("");
        }
             {

        }

    }
}
