//姓名:唐知謙，學號:411077018
package javawork;
import java.util.ArrayList; //導入函式ArrayList
import java.util.Collections;//導入函式Collections
import java.util.Scanner;//導入函式Scanner
//輸入完全部的(Li,Hi,Ri)之後要在輸入EOF來終止輸入，輸入完後會利用矩陣排出所有高度並找出Li的最小值和Ri的最高值，並去判斷如果高度有發生改變時就印出資料。
public class A411077018_3_1 {
    public static void main(String[] args){//建立物件main
        Scanner getSc = new Scanner(System.in);//建立掃描器getSc
        String string = " ";//建立字串string
        ArrayList <Integer> Li = new ArrayList<Integer>();//動態數組Li
        ArrayList <Integer> Hi = new ArrayList<Integer>();//動態數組Hi
        ArrayList <Integer> Ri = new ArrayList<Integer>();//動態數組Ri
        int[] HiLine = new int[10000];//建立矩陣HiLine
        while(string.equals("EOF") != true){//判斷字串是否讀取到EOF，如果沒有就執行以下程式
        String sArray[] = string.split("\\ ");//以空白切割string字串
        for(int i = 0 ; i < sArray.length ; i++){//進行迴圈
            if (i == 0){//如果i == 0 就將sArray[i]存入Li動態數組
                int change = Integer.parseInt(sArray[i]);//變數charge存入sArray[i]
                Li.add(change);//change存入Li
            }
            if (i == 1){//如果i == 1 就將sArray[i]存入Hi動態數組
                int change = Integer.parseInt(sArray[i]);//變數charge存入sArray[i]
                Hi.add(change);//change存入Li
            }
            if (i == 2){//如果i == 1 就將sArray[i]存入Ri動態數組
                int change = Integer.parseInt(sArray[i]);//變數charge存入sArray[i]
                Ri.add(change);//change存入Li
            }
        }
        if(Li.size() > 0){//如果Li大於0
        for(int i = Li.get(Li.size()-1) ; i < Ri.get(Li.size()-1) ; i++){//此迴圈是在存取高度資料
            HiLine[i] = Math.max(HiLine[i], Hi.get(Hi.size()-1));//比較HiLine[i]和Hi.get(Hi.size()-1那個比較大，比完後存入HiLine[i]
        }
        }
        string = getSc.nextLine();//將讀進來的資料存入string字串中
        }
        int HCheck = -1;//建立HCheck並且值為-1
        int Limin = Collections.min(Li);//找出Li最小值
        int Rimax = Collections.max(Ri);//找出Ri最大值
        for(int i = Limin ; i <= Rimax ; i++){//進行迴圈(判斷高度變化)
            if (HiLine[i] != HCheck) {//如果HiLine[i]不等於HCheck(代表高度改變)
                System.out.print(i + " " + HiLine[i] + " ");//輸出資料
                HCheck = HiLine[i];//將HCheck改為HiLine[i]
            }
        }
        getSc.close();//關閉掃描器
    }
}

