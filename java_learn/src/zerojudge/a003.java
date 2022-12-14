package zerojudge;
import java.util.Scanner;
public class a003 {
    public static void main(String[] args){
    Scanner getSc = new Scanner(System.in);
    int x1,x2,S;
    x1 = getSc.nextInt();
    x2 = getSc.nextInt();
    S = (x1*2 + x2) % 3 ;
    if(S == 0){
        System.out.println("普通");
    }
    if(S == 1){
        System.out.println("吉");
    }
    if(S == 2){
        System.out.println("大吉");
    }
    getSc.close();
    }
}
