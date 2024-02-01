package banking;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        system s1 = new system("kavya", "root");
        system s2 = new system("kavi", "root1");
        system s3 = new system("mouni", "root3");
        ArrayList<system> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        for (system list : arr) {
            list.printer();
        }
    }
}
