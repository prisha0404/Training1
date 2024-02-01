public class movie {
    String name;
    String hero;
    String heroine;
    public void printer(){
        System.out.println(this.name);
        System.out.println(this.hero);
        System.out.println(this.heroine);
    }
    public void getdata(String name,String hero,String heroine){
        this.name=name;
        this.hero=hero;
        this.heroine=heroine;
    }

}
