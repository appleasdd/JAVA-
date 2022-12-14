package javanote;
import java.util.Scanner;
//switch的規矩:
//1.switch 语句中的變量類型可以是： byte、short、int 或者 char。從 Java SE 7 開始，switch 支持字符串 String 類型了，同時 case 標籤必需為字符串常量或字面量。
//使用break;可以中止switch繼續判斷(跳出switch)如果沒有break;將會產生以下事件。
    //如果在case匹配成功時，將會連後續的case也一並運作，除非遇到break為止。
public class who_use_switch_case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
        case 0:
            System.out.println(a);
            break;
        case 1:
            System.out.println(a);
            break;
        case 2:
            System.out.println(a);
            break;
        }
    sc.close();
    }
}
