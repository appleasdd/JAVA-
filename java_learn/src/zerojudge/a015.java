package zerojudge;
import java.util.Scanner;//導入掃描器
public class a015 {
    public static void main(String[] args){
    Scanner getSc = new Scanner(System.in);//啟動掃描器
    while(getSc.hasNext()){//沒有輸入後才結束程式
    int yAxis = getSc.nextInt();//輸入y軸
    int xAxis = getSc.nextInt();//輸入x軸
    int [][] array = new int[xAxis][yAxis];//建立二維矩陣
    int [][] flipArray = new int[yAxis][xAxis];//建立二維矩陣(翻轉)
    int i,j;//建立變數
    for(i = 0 ; i < yAxis ; i++){//迴圈跑y軸
        for(j = 0 ; j < xAxis ; j++){//迴圈跑x軸
        array[j][i] = getSc.nextInt();//矩陣輸入
        }
    }
    for(i = 0 ; i < xAxis ; i++){//迴圈跑x軸
        for(j = 0 ; j < yAxis ; j++){//迴圈跑y軸
        flipArray[j][i] = array[i][j];//翻轉矩陣
        }
    }
    for(i = 0 ; i < xAxis ; i++){//迴圈跑x軸
        for(j = 0 ; j < yAxis ; j++){//迴圈跑y軸
        System.out.print(flipArray[j][i] + " ");//輸出翻轉矩陣
        }
        System.out.print("\n");//每次輸出完一行就下一行
    }
}
getSc.close();//關閉掃描器
}
}
