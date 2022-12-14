//姓名:唐知謙，學號:411077018
package javawork;

import java.util.ArrayList; //導入函式ArrayList
import java.util.Scanner;//導入函式Scanner
import java.util.Arrays;//導入函式Arrays
//先進行輸入，並利用Arraylist分為word和testword兩大類儲存，隨後進行文字排序然後判斷，最後輸出。

public class A411077018_4_1 {// 建立A411077018_4_1的class
    public static void main(String[] args) {// 建立物件main
        Scanner getSc = new Scanner(System.in);// 建立掃描器getSc
        int capitalMeasurement = getSc.nextInt();// 建立capitalMeasurement並儲存資料
        String wordScanner = "open";// 建立wordScanner並儲存資料
        ArrayList<String> word = new ArrayList<String>();// 建立ArrayList word物件
        ArrayList<String> testWord = new ArrayList<String>();// 建立testWord word物件
        String space = getSc.nextLine();//// 建立space並儲存資料
        System.out.println(space);//不用的
        int count = 0;// 設定count為int
        for (int i = 0; i < capitalMeasurement; i++) {// 建立迴圈
            int frequency = getSc.nextInt();// 建立frequency並儲存資料
            getSc.nextLine();// 轉換
            for (int j = 0; j < frequency; j++) {// 建立迴圈
                wordScanner = getSc.nextLine();// 抓取資料
                word.add(wordScanner);// 將抓取的資料存入word
            }
            while (wordScanner.equals("END") != true) {// 建立迴圈
                wordScanner = getSc.nextLine();// 儲存資料
                testWord.add(wordScanner);// 將抓取的資料存入testWord
            }
            for (int k = 0; k < testWord.size() - 1; k++) {// 建立迴圈
                char[] StringtoChar_testWord = testWord.get(k).toCharArray();// 進行字元化
                Arrays.sort(StringtoChar_testWord);// 進行排序
                String check_TestWorld = new String(StringtoChar_testWord);// 建立check_TestWorld物件
                System.out.println("Anagrams for: " + testWord.get(k));// 輸出
                for (int l = 0; l < word.size(); l++) {// 建立迴圈
                    char[] StringtoChar_word = word.get(l).toCharArray();// 進行字元化
                    Arrays.sort(StringtoChar_word);// 進行排序
                    String check_World = new String(StringtoChar_word);// 建立check_World物件
                    if (check_TestWorld.equals(check_World) == true) {// 如果check_TestWorld等於check_World就執行以下程式
                        count = count + 1;// 計數
                        System.out.println("  " + count + ") " + word.get(l));// 輸出
                    }
                }
                if (count == 0) {// 如果count等於0
                    System.out.println("No anagrams for: " + testWord.get(k));// 輸出
                }
                count = 0;// count等於0
            }
            if (i < capitalMeasurement - 1) {// 如果i小於capitalMeasurement-1就執行以下程式
                System.out.print("\r\n");// 輸出
            }
            testWord.clear();// 清空testWord
            word.clear();// 清空word
        }
        getSc.close();// 關閉掃描器
    }
}