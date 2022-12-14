package zerojudge;
import java.util.Scanner;
public class a006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        double d,x1,x2;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = Math.pow(b,2) - 4*a*c;
        if(d > 0){
        x1 = (-b + Math.sqrt(d)) / (2*a);
        x2 = (-b - Math.sqrt(d)) / (2*a);
        int x1_1 = (int)x1;
        int x2_1 = (int)x2;
        if(x1 > x2){
        System.out.println("Two different roots"+" "+"x1="+x1_1 + " , "+ "x2="+x2_1);
        }
        if(x1 < x2){
        System.out.println("Two different roots"+" "+"x1="+x2_1 + " , "+ "x2="+x1_1);
        }
        }
        else if(d == 0){
        x1 = -b / (2*a);
        int x1_1 = (int)x1;
        System.out.println("Two same roots "+"x="+ x1_1);    
        }
        else if(d < 0){
        System.out.println("No real root");
        }
        sc.close();
    }
}
