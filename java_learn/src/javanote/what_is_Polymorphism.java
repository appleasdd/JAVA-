package javanote;
//一種事物的多種存在形態，比如說男人和女人都是人，人可以分為男人和女人
class human{
    void a(){
    System.out.println("i am human");
    }
}
class man extends human{
    void a(){
        System.out.println("i am man");
    }
}
class woman extends human{
    void a(){
        System.out.println("i am woman");
    }
}
public class what_is_Polymorphism {
    public static void main(String[] args){
        human b = new human();
        human c = new man();
        human d = new woman();
        b.a();
        c.a();
        d.a();
    }
}
