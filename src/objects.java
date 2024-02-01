public class objects {
    public static void main(String[] args) {
        student1 s1;
        s1 = new student1();
        s1.getdata("prisha",90,89);
        objects(s1);
    }
    public static void objects(student1 a){
        System.out.println(a.name);
        System.out.println(a.rollno);
        System.out.println(a.marks);
    }
}
