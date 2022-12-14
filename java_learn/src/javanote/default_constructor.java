package javanote;
class add{
    int a;
    int b;
    void add_print(){
        System.out.println("A = " + a + "  B = " + b);
    }
    }
public class default_constructor {
    public static void main(String[] args){
        add x = new add();
        x.a = 100;
        x.b = 500;
        x.add_print();
    }
}
