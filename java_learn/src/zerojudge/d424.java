package zerojudge;
import java.util.ArrayList; //導入函式ArrayList
import java.util.Scanner;//導入函式Scanner
import java.util.Collections;//導入函式Collections
//輸入完全部的(Li,Hi,Ri)之後要在輸入EOF來終止輸入，輸入完後會利用矩陣排出所有高度並找出Li的最小值和Ri的最高值，並去判斷如果高度有發生改變時就印出資料。
public class d424 {
    public static void main(String[] args){
        Scanner getSc = new Scanner(System.in);
        String string = " ";
        ArrayList <Integer> Li = new ArrayList<Integer>();
        ArrayList <Integer> Hi = new ArrayList<Integer>();
        ArrayList <Integer> Ri = new ArrayList<Integer>();
        int[] HiLine = new int[10000];
        while(string.equals("EOF") != true){
        String sArray[] = string.split("\\ ");
        for(int i = 0 ; i < sArray.length ; i++){
            if (i == 0){
                int change = Integer.parseInt(sArray[i]);
                Li.add(change);
            }
            if (i == 1){
                int change = Integer.parseInt(sArray[i]);
                Hi.add(change);
            }
            if (i == 2){
                int change = Integer.parseInt(sArray[i]);
                Ri.add(change);
            }
        }
        if(Li.size() > 0){
        for(int i = Li.get(Li.size()-1) ; i < Ri.get(Li.size()-1) ; i++){
            HiLine[i] = Math.max(HiLine[i], Hi.get(Hi.size()-1));
        }
        }
        string = getSc.nextLine();
        }
        int HCheck = -1;
        int Limin = Collections.min(Li);
        int Rimax = Collections.max(Ri);
        for(int i = Limin ; i <= Rimax ; i++){
            if (HiLine[i] != HCheck) {
                System.out.print(i + " " + HiLine[i] + " ");
                HCheck = HiLine[i];
            }
        }
        getSc.close();
    }
    
}
