package credits;

public class main {
    public static void main(String[] args) {
        card card=new gold();
        card card1=new platinum();
        user u1=new user("prisha",card);user u2=new user("kavya",card);

        u1.calculate(1000);
        u2.calculate(1000);



    }



    }

