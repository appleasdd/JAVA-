//姓名:唐知謙，學號:411077018
package javawork;
import java.util.Scanner;//導入函數Scanner
import java.util.ArrayList;//導入函數ArrayList
public class A411077018_2_1 {//建立class A411077018_2_1
    public static void main(String[] args){//建物物件main
        Scanner getSc = new Scanner(System.in);//建立掃描器Scanner
        int xAxis = getSc.nextInt();//輸入xAxis軸的數值(屬性:int)
        int yAxis = getSc.nextInt();//輸入yAxis軸的數值(屬性:int)
        int checker = 0;//建立checker變數
        int initialPath_math = 0;//建立initialPath_math變數
        char initialPath_forword = 'n';//建立initialPath_math變數
        ArrayList <Integer> mathCheck_x = new ArrayList<Integer>();//建立動態數組mathCheck_x
        ArrayList <Integer> mathCheck_y = new ArrayList<Integer>();//建立動態數組mathCheck_y
        ArrayList <Character> mathCheck_initialPath = new ArrayList<Character>();//建立動態數組 mathCheck_initialPath
        while(getSc.hasNext()){//迴圈，直到沒有輸入為止
        int initialPosition_x = getSc.nextInt();//輸入initialPosition_x的值
        int initialPosition_y = getSc.nextInt();//輸入initialPosition_y的值
        char initialPath = getSc.next().charAt(0);//輸入initialPath的值
        int initialPath_ASCII = (int) initialPath;//將initialPath轉為ASCII並存入initialPath_ASCII裡
        if (initialPath_ASCII == 69){//如果initialPath_ASCII為69(字母為E)
            initialPath_math = 0;//initialPath_math為0
        }
        if (initialPath_ASCII == 83){//如果initialPath_ASCII為83(字母為S)
            initialPath_math = 1;//initialPath_math為1
        }
        if (initialPath_ASCII == 87){//如果initialPath_ASCII為87(字母為W)
            initialPath_math = 2;//initialPath_math為2
        }
        if (initialPath_ASCII == 78){//如果initialPath_ASCII為78(字母為N)
            initialPath_math = 3;//initialPath_math為3
        }
        getSc.nextLine();//讀入一行字串
        String robotRoute = getSc.nextLine();//讀入robotRoute的字串
        for(int i = 0 ; i < robotRoute.length() ; i++){//迴圈，由0跑到robotRoute的長度
            int robotRoute_ASCII = (int) robotRoute.charAt(i);//將robotRoute裡的各字元轉成ASCII並存入robotRoute_ASCII
            int initialPosition_x_Before = initialPosition_x;//將initialPosition_x的數值存入initialPosition_x_Before
            int initialPosition_y_Before = initialPosition_y;//將initialPosition_y的數值存入initialPosition_y_Before
            char initialPath_Before = initialPath;//將initialPath的數值存入initialPath_Before
            if(robotRoute_ASCII == 82){//如果robotRoute_ASCII等於82(字元為R)
                initialPath_math = initialPath_math + 1;//initialPath_math加1
            }
            if(robotRoute_ASCII == 76){//如果robotRoute_ASCII等於76(字元為L)
                initialPath_math = initialPath_math - 1;//initialPath_math減1
            }
            if(initialPath_math == 4){//如果initialPath_math等於4(代表被成東方)
                initialPath_math = 0;//initialPath_math變成0
            }
            if(initialPath_math == -1){//如果initialPath_math等於-1(代表被成北方)
                initialPath_math = 3;//initialPath_math變成3
            }
            if(robotRoute_ASCII == 70){//如果robotRoute_ASCII等於70(字元為F)
                if(initialPath_math == 0){//如果initialPath_math等於0(代表東方)
                    if(mathCheck_x.contains(initialPosition_x) && mathCheck_y.contains(initialPosition_y) && (initialPosition_x + 1) >= xAxis){//如果mathCheck_x裡有跟initialPosition_x相同的資料並且mathCheck_y裡有跟initialPosition_y相同的資料並且initialPosition_x加1大於等於xAxis
                        initialPosition_x = initialPosition_x_Before;//initialPosition_x存入initialPosition_x_Before的值
                        continue;//跳過這次迴圈
                    }
                    else{//否則
                        initialPosition_x = initialPosition_x + 1;//initialPosition_x加1
                    }
                }
                if(initialPath_math == 1){//如果initialPath_math等於0(代表北方)
                    if(mathCheck_x.contains(initialPosition_x) && mathCheck_y.contains(initialPosition_y) && (initialPosition_y - 1) <= 0){//如果mathCheck_x裡有跟initialPosition_x相同的資料並且mathCheck_y裡有跟initialPosition_y相同的資料並且initialPosition_y減1小於等於0
                        initialPosition_y = initialPosition_y_Before;//initialPosition_y存入initialPosition_y_Before的值
                        continue;//跳過這次迴圈
                    }
                    else{//否則
                    initialPosition_y = initialPosition_y - 1;//initialPosition_y減1
                    }
                }
                if(initialPath_math == 2){//如果initialPath_math等於0(代表西方)
                    if(mathCheck_x.contains(initialPosition_x) && mathCheck_y.contains(initialPosition_y) && (initialPosition_x - 1) <= 0){//如果mathCheck_x裡有跟initialPosition_x相同的資料並且mathCheck_y裡有跟initialPosition_y相同的資料並且initialPosition_x減1小於等於0
                        initialPosition_x = initialPosition_x_Before;//initialPosition_x存入initialPosition_x_Before的值
                        continue;//跳過這次迴圈
                    }
                    else{//否則
                    initialPosition_x = initialPosition_x - 1;//initialPosition_x減1
                    }
                }
                if(initialPath_math == 3){//如果initialPath_math等於0(代表北方)
                    if(mathCheck_x.contains(initialPosition_x) && mathCheck_y.contains(initialPosition_y) && (initialPosition_y + 1) >= yAxis){//如果mathCheck_x裡有跟initialPosition_x相同的資料並且mathCheck_y裡有跟initialPosition_y相同的資料並且initialPosition_y加1大於等於yAxis
                        initialPosition_y = initialPosition_y_Before;//initialPosition_y存入initialPosition_y_Before的值
                        continue;//跳過這次迴圈
                        }
                    else{//否則
                        initialPosition_y = initialPosition_y + 1;//initialPosition_y加1
                        }
                }
            }
            if(initialPath_math == 0){//如果initialPath_math等於0(代表東方)
                initialPath_forword = (char) 69;//將initialPath_forword存入E
            }
            if(initialPath_math == 1){//如果initialPath_math等於1(代表南方)
                initialPath_forword = (char) 83;//將initialPath_forword存入S
            }
            if(initialPath_math == 2){//如果initialPath_math等於2(代表西方)
                initialPath_forword = (char) 87;//將initialPath_forword存入W
            }
            if(initialPath_math == 3){//如果initialPath_math等於3(代表北方)
                initialPath_forword = (char) 78;//將initialPath_forword存入N
            }
            if((initialPosition_x > xAxis) || (initialPosition_y > yAxis)){//如果initialPosition_x大於xAxis或者initialPosition_y大於yAxis
                System.out.println(initialPosition_x_Before + " "+initialPosition_y_Before +" "+ initialPath_Before +" LOST");//輸出資料
                mathCheck_x.add(initialPosition_x_Before);//將initialPosition_x_Before存入mathCheck_x這個動態矩陣內
                mathCheck_y.add(initialPosition_y_Before);//將initialPosition_y_Before存入mathCheck_y這個動態矩陣內
                mathCheck_initialPath.add(initialPath_forword);//將initialPath_forword存入mathCheck_initialPath這個動態矩陣內
                checker += 1;//checker加1
                break;//中止迴圈
            } 
        }
        if(checker == 0){//如果checker等於0
        System.out.println(initialPosition_x + " "+initialPosition_y +" "+ initialPath_forword);//輸出資料
        }
        checker = 0;//checker為0
        }
        getSc.close();//關閉掃描器getSc
        }
}
