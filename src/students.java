public class students {
    String name;
    String department;
    public students(String name,String department){
        this.name=name;
        this.department=department;
    }

    public void printer() {
        System.out.println(this.name);
        System.out.println(this.department);
    }

}

