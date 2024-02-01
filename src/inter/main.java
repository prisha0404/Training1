package inter;

public interface main {
    String name="";
    default void printer(){
        System.out.println("this is printing from main interface");

    }
    default String stringprinter(){
        return "this is string printer";
    }
}
