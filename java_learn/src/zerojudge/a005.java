package zerojudge;
import java.util.Scanner;
public class a005 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int calculate,i;
    calculate = sc.nextInt();
    int x1,x2,x3,x4,x5=0;
    try{
    for(i = 1 ; i <= calculate ; i++){
    x1 = sc.nextInt();
    x2 = sc.nextInt();
    x3 = sc.nextInt();
    x4 = sc.nextInt();
    if((x2-x1) != (x4-x3)){
        x5 = x4 * (x4 / x3);
    }
    if((x2-x1) == (x4-x3)){
        x5 = x4 + (x4-x3);
    }
    System.out.println(x1+" "+x2+" "+x3+" "+x4+" "+x5);
    }
}
    finally{
    sc.close();
    }
    }
}
