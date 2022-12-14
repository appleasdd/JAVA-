package javanote;
class Add{
    int a = 5;
    int b = 10;
    int c;
    public void add(){
        System.out.println(a+b);
    }
    private void add_private(int a ,int b){
        this.a = a;
        this.b = b;
        c = 5 + a + b;
    }
    public void add_print(){
        add_private(10,20);
        System.out.println(c);
    }
}
public class what_is_Modifier {
    public static void main(String[] args){
    Add as =  new Add();
    as.add();
    as.add_print();
}
}
