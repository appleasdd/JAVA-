package javanote;
//子代繼承了父代後，改寫父代的方法​。
class father{
    void prin(){
    System.out.println("father");
    }
}
class son extends father{
    void prin(){
        System.out.println("father change son");
        //super.prin();//呼叫父類的方式
        }
    void apple(){
        System.out.println("This is an apple");
    }
}
public class what_is_overriding {
    public static void main(String[] args){
        son test = new son();
        father test1 = new father();
        test1.prin();
        test.prin();
        test.apple();
    }
}
