public class student {
    String name;
    String department;
    int grade;

    public void getdata(String name, String department, int grade) {
        this.name = name;
        this.department = department;
        this.grade = grade;
    }

public void printer(){
    System.out.println(this.name);
    System.out.println(this.department);
    System.out.println(this.grade);
}
}
