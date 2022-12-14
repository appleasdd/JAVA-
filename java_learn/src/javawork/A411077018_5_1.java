//姓名:唐知謙，學號:411077018
package javawork;
import java.util.Scanner;//導入函式Scanner
import java.util.ArrayList;//導入函示Arraylist
import java.util.Arrays;//導入函示Arrays
//輸入進來的兩筆資料先進行排序，在開始判斷，如果檢測到相同的字元就印出並且替換到以檢測完且相同的字元。
public class A411077018_5_1 {//命名class為A411077018_5_1
    public static void main(String[] args){//建立物件main
        Scanner getSc = new Scanner(System.in);//建立掃描器
        while(getSc.hasNext()){//判斷迴圈
            String wordOne = getSc.nextLine();//讀取資料並寫入wordOne
            String wordTwo = getSc.nextLine();//讀取資料並寫入wordTwo
            String[] CharacterWordOne = wordOne.split("");//進行分割
            String[] CharacterWordTwo = wordTwo.split("");//進行分割
            ArrayList<String> CharacterArrayWordOne = new ArrayList<String>(Arrays.asList(CharacterWordOne));//將array轉成arraylist
            ArrayList<String> CharacterArrayWordTwo = new ArrayList<String>(Arrays.asList(CharacterWordTwo));//將array轉成arraylist
            int WordOneSize = CharacterArrayWordOne.size();//讀入CharacterArrayWordOne的長度
            int WordTwoSize = CharacterArrayWordTwo.size();//讀入CharacterArrayWordTwo的長度
            String[] CharacterhashSetArrayWordOne = CharacterArrayWordOne.toArray(new String[WordOneSize]);//將arraylist轉成array
            String[] CharacterhashSetArrayWordTwo = CharacterArrayWordTwo.toArray(new String[WordTwoSize]);//將arraylist轉成array
            Arrays.sort(CharacterhashSetArrayWordOne);//進行排序
            Arrays.sort(CharacterhashSetArrayWordTwo);//進行排序
            ArrayList<String> CharacterArrayListWordOne = new ArrayList<String>(Arrays.asList(CharacterhashSetArrayWordOne));//將array轉成arraylist
            ArrayList<String> CharacterArrayListWordTwo = new ArrayList<String>(Arrays.asList(CharacterhashSetArrayWordTwo));//將array轉成arraylist
            int Count = CharacterArrayListWordOne.size();//求CharacterArrayListWordOne的長度
///////////////////////////////////////////////////////邏輯區塊分割線///////////////////////////////////////////////////////////////////////////////
            for(int i = 0 ; i < Count; i++){//進行迴圈
                if( CharacterArrayListWordTwo.indexOf(CharacterArrayListWordOne.get(i)) > -1){//如果查詢到相同字元
                    System.out.print(CharacterArrayListWordOne.get(i));//印出相同字元
                    CharacterArrayListWordTwo.set(CharacterArrayListWordTwo.indexOf(CharacterArrayListWordOne.get(i)),"0");//將查出的相同字元轉成0
                    CharacterArrayListWordOne.set(i,"1");//將查出的相同字元轉成1
                }
            }
            System.out.println();//印出一行
        }
        getSc.close();//關閉掃描器
    }
}
