package zerojudge;
import java.util.Scanner;
public class a010 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);//建立掃描器
    int Order = sc.nextInt();//輸入數字
    int n;//設定n的變數為整數
    for(int i = 2 ; i <= Order ; i++){//進行迴圈進行設置i為2開始跑並檢測Order
        if(Order % i == 0){//如果Order 除以 i 的餘數為零就進行以下動作。
            n = 0;//設定n為零
            while(Order % i == 0){//如果Order除以i的餘數不為零時就結束迴圈(進行迴圈測出n的數值為多少)
                Order = Order / i;//改變Order的值
                n += 1;//結束一次迴圈後要加1
            }
        if(n == 1){//如果n等於1就執行以下輸出(代表此i沒有次方)
        System.out.print(i);
        }
        if(n != 1){//如果n大於1就執行以下輸出(代表此i有次方)
        System.out.print(i + "^" + n);
        }
        if(Order != 1){//如果Order不等於1就執行以下輸出(配合上面的"如果n等於1")
        System.out.print(" * ");
        }
        }
    }
    sc.close();
    }
    
}
