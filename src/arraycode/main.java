package arraycode;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        student s1=new student("prisha","cse");
        student s2=new student("kavya","ece");
        student s3=new student("liya","cse");

        ArrayList<student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);


        for(student list: arr){
            list.det();
        }
    }
}
