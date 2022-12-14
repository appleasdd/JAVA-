package zerojudge;
import java.util.Scanner;
public class d489 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);//建立掃描器
    double a,b,c,area,p;//設定變數為double
    a = sc.nextInt();//利用掃描器寫入數字進a
    b = sc.nextInt();//利用掃描器寫入數字進b
    c = sc.nextInt();//利用掃描器寫入數字進c
    p = (a+b+c) / 2;//建立海龍公式需要的p
    area = p*(p-a)*(p-b)*(p-c);//算出area(因題目關係將海龍公式改成如此)
    int changeArea = (int) area;//更改變數
    System.out.println(changeArea);//輸出changeArea
    sc.close();//關閉掃描器
    }
}
