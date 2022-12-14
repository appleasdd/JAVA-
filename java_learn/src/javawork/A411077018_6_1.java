package javawork;
import java.util.Scanner;//導入函式Scanner
import java.util.Arrays;//導入函式Arrays
public class A411077018_6_1 {//建立A411077018_6_1類別
    //每查找出@就對計數器加一並改成*並看八個方位是否是@。然後在最後變成*。
    public static void checkOil(String[][] oilLand , int i , int j){//建立方法checkOil
        oilLand[i][j] = "*";//改查找到的原本@
        if(oilLand[i+1][j+1].equals("@") == false || oilLand[i+1][j+1].equals("/") == true){//如果i+1，j+1的位置不是@或是是/就變成*
            oilLand[i+1][j+1] = "*";//變成*
        }
        else if(oilLand[i+1][j+1].equals("@") == true){//如果i+1，j+1的位置是@就改成/且進入迭代
            oilLand[i+1][j+1] = "/";//變成/
            checkOil(oilLand,i+1,j+1);//進入遞迴
        }
        if(oilLand[i][j+1].equals("@") == false || oilLand[i][j+1].equals("/") == true){//如果i，j+1的位置不是@或是是/就變成*
            oilLand[i][j+1] = "*";//變成*
        }
        else if(oilLand[i][j+1].equals("@") == true){//如果i，j+1的位置是@就改成/且進入迭代
            oilLand[i][j+1] = "/";//變成/
            checkOil(oilLand,i,j+1);//進入遞迴
        }
        if(oilLand[i-1][j+1].equals("@") == false || oilLand[i-1][j+1].equals("/") == true){//如果i-1，j+1的位置不是@或是是/就變成*
            oilLand[i-1][j+1] = "*";//變成*
        }
        else if(oilLand[i-1][j+1].equals("@") == true){//如果i-1，j+1的位置是@就改成/且進入迭代
            oilLand[i-1][j+1] = "/";//變成/
            checkOil(oilLand,i-1,j+1);//進入遞迴
        }
        if(oilLand[i-1][j].equals("@") == false || oilLand[i-1][j].equals("/") == true){//如果i-1，j的位置不是@或是是/就變成*
            oilLand[i-1][j] = "*";//變成*
        }
        else if(oilLand[i-1][j].equals("@") == true){//如果i-1，j的位置是@就改成/且進入迭代
            oilLand[i-1][j] = "/";//變成/
            checkOil(oilLand,i-1,j);//進入遞迴
        }
        if(oilLand[i-1][j-1].equals("@") == false || oilLand[i-1][j-1].equals("/") == true){//如果i-1，j-1的位置不是@或是是/就變成*
            oilLand[i-1][j-1] = "*";//變成*
        }
        else if(oilLand[i-1][j-1].equals("@") == true){//如果i-1，j-1的位置是@就改成/且進入迭代
            oilLand[i-1][j-1] = "/";//變成/
            checkOil(oilLand,i-1,j-1);//進入遞迴
        }
        if(oilLand[i][j-1].equals("@") == false || oilLand[i][j-1].equals("/") == true){//如果i，j-1的位置不是@或是是/就變成*
            oilLand[i][j-1] = "*";//變成*
        }
        else if(oilLand[i][j-1].equals("@") == true){//如果i，j-1的位置是@就改成/且進入迭代
            oilLand[i][j-1] = "/";//變成/
            checkOil(oilLand,i,j-1);//進入遞迴
        }
        if(oilLand[i+1][j-1].equals("@") == false || oilLand[i+1][j-1].equals("/") == true){//如果i+1，j-1的位置不是@或是是/就變成*
            oilLand[i+1][j-1] = "*";//變成*
        }
        else if(oilLand[i+1][j-1].equals("@") == true){//如果i+1，j-1的位置是@就改成/且進入迭代
            oilLand[i+1][j-1] = "/";//變成/
            checkOil(oilLand,i+1,j-1);//進入遞迴
        }
        if(oilLand[i+1][j].equals("@") == false || oilLand[i+1][j].equals("/") == true){//如果i+1，j的位置不是@或是是/就變成*
            oilLand[i+1][j] = "*";//變成*
        }
        else if(oilLand[i+1][j].equals("@") == true){//如果i+1，j的位置是@就改成/且進入迭代
            oilLand[i+1][j] = "/";//變成/
            checkOil(oilLand,i+1,j);//進入遞迴
        }
    }
    public static void main(String[] args){//建立main方式
        Scanner getSc = new Scanner(System.in);//建立掃描器
        while(true){//進行永續迴圈
        int count = 0;
        String scopeOil = getSc.nextLine();//讀入數值
        String[] scopeOilSplit = scopeOil.split(" ");//分割
        int scopeOilInteger1 = Integer.valueOf(scopeOilSplit[0]);//進行字串轉整數
        int scopeOilInteger2 = Integer.valueOf(scopeOilSplit[1]);//進行字串轉整數
        if(scopeOilInteger1 == 0 && scopeOilInteger2 == 0){//如果讀到0 0就終止迴圈
            break;//跳出迴圈
        }
        int scopeOilInteger11 = scopeOilInteger1 + 2;//對scopeOilInteger11+2
        int scopeOilInteger22 = scopeOilInteger2 + 2;//對scopeOilInteger22+2
        String[][] oilLand = new String[scopeOilInteger11][scopeOilInteger22];//建立物件oilLand
        for(int i = 0 ; i < scopeOilInteger11 ; i++){//迴圈(先產生全0二維矩陣)
            Arrays.fill(oilLand[i], "0");//建立全0二維矩陣
        }
        for(int i = 0 ; i < scopeOilInteger1 ; i++){//進行迴圈
            scopeOil = getSc.nextLine();//讀入資料
            String[] scopeOilArray = scopeOil.split("");//分割
            for(int j = 0 ; j < scopeOilInteger2 ; j++){//進行迴圈
                oilLand[i + 1][j + 1] = scopeOilArray[j];//進行資料分配
            }
        }
        for(int i = 0 ; i < scopeOilInteger1; i++){//進行迴圈
            for(int j = 0 ; j < scopeOilInteger2; j++){//進行迴圈
                if(oilLand[i + 1][j + 1].equals("@") == true){//查找@
                    checkOil(oilLand,i+1,j+1);//進入迭代
                    count = count + 1;//計數器加一
                }
            }
        }
        System.out.println(count);//印出記數器
        }
        getSc.close();//關閉掃描器
    }
}
