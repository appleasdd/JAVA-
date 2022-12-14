package javawork;
import java.util.Scanner;//導入函式Scanner
import java.util.ArrayList;//導入函式ArrayList
//將字串拆成字元陣列然後開始組合並用檢查矩陣看是否有重複，如果重複就跳過，沒有出現過就記數器加1並丟入檢查矩陣中。
public class A411077018_7_1 {//建立類別A411077018_7_1
    public static void main(String[] args){//建立main方式
        Scanner getScInt = new Scanner(System.in);//建立getScInt掃描器
        Scanner getScString = new Scanner(System.in);//建立getScString掃描器
        int count = 0;//建立計數器並等於0
        int total = getScInt.nextInt();//輸入資料
        for(int i = 0 ; i < total ; i++){//迴圈
            String checkString = getScString.nextLine();//輸入資料
            char[] checkChar = checkString.toCharArray();//將資料字元矩陣化
            ArrayList<String> useString = new ArrayList<String>();//建立ArrayList
            StringBuilder stringBuilder;//建立StringBuilder
            if(checkChar.length < 3){//判斷字元陣列長度是否小於3
                System.out.println(count);//印出資料
                continue;//跳出此次迴圈
            }
            for(int j = 0 ; j < checkChar.length - 2 ; j++){//迴圈跑第一字元
                for(int k = j+1 ; k < checkChar.length - 1 ; k++){//迴圈跑第二字元
                    for(int l = k+1 ; l < checkChar.length ; l++){//迴圈跑第三字元
                        stringBuilder = new StringBuilder().append(checkChar[j]).append(checkChar[k]).append(checkChar[l]);//將字元結合成字串
                        String stringString = stringBuilder.toString();//將StringBuilder轉成String
                        if(useString.contains(stringString) == true){//判斷此字串是否有出現在ArrayList中
                            continue;//有出現過就跳出此次迴圈
                        }
                        if(useString.contains(stringString) == false){//判斷此字串是否有出現在ArrayList中
                            count = count + 1;//計數器加一
                            useString.add(stringString);//加入沒出現在ArrayList的字串
                        }
                    }
                }
            }
            System.out.println(count);//印出計數器
            count = 0;//計數器清零
            useString.clear();//ArrayList清零
        }
        getScInt.close();//關閉掃描器
        getScString.close();//關閉掃描器
    }
    
}
