package banking;

public class system {
    String userId;
    String password;



public system(String userId,String password){
    this.userId=userId;
    this.password=password;
}
public void printer(){
    System.out.println("userId"+userId);
    System.out.println("password"+password);

}
}
