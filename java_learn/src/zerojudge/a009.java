package zerojudge;
import java.util.Scanner;
public class a009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//掃描器定義
        String string = sc.nextLine();//輸入字串
        int iSum = string.length();//字算字串長度
        for(int i = 0 ; i < iSum ;i++){
        char scanner = string.charAt(i);//擷取字串裡的字元
        int scannerInt = scanner - 7;//將字元轉成int並計算ASCII
        char scannerInt2 = (char)scannerInt;//將ASCII的int轉為char
        System.out.print(scannerInt2);//印出

    }
    sc.close();
    }
}
