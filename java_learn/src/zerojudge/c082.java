package zerojudge;
import java.util.Scanner;
import java.util.ArrayList;
public class c082 {
    public static void main(String[] args){
    Scanner getSc = new Scanner(System.in);
    int xAxis = getSc.nextInt();
    int yAxis = getSc.nextInt();
    int checker = 0;
    int initialPath_math = 0;
    char initialPath_forword = 'n';
    ArrayList <Integer> mathCheck_x = new ArrayList<Integer>();
    ArrayList <Integer> mathCheck_y = new ArrayList<Integer>();
    ArrayList <Character> mathCheck_initialPath = new ArrayList<Character>();
    while(getSc.hasNext()){
    int initialPosition_x = getSc.nextInt();
    int initialPosition_y = getSc.nextInt();
    char initialPath = getSc.next().charAt(0);
    int initialPath_ASCII = (int) initialPath;
    if (initialPath_ASCII == 69){
        initialPath_math = 0;
    }
    if (initialPath_ASCII == 83){
        initialPath_math = 1;
    }
    if (initialPath_ASCII == 87){
        initialPath_math = 2;
    }
    if (initialPath_ASCII == 78){
        initialPath_math = 3;
    }
    getSc.nextLine();
    String robotRoute = getSc.nextLine();
    for(int i = 0 ; i < robotRoute.length() ; i++){
        int robotRoute_ASCII = (int) robotRoute.charAt(i);
        int initialPosition_x_Before = initialPosition_x;
        int initialPosition_y_Before = initialPosition_y;
        char initialPath_Before = initialPath;
        if(robotRoute_ASCII == 82){
            initialPath_math = initialPath_math + 1;
        }
        if(robotRoute_ASCII == 76){
            initialPath_math = initialPath_math - 1;
        }
        if(initialPath_math == 4){
            initialPath_math = 0;
        }
        if(initialPath_math == -1){
            initialPath_math = 3;
        }
        if(robotRoute_ASCII == 70){
            if(initialPath_math == 0){
                if(mathCheck_x.contains(initialPosition_x) && mathCheck_y.contains(initialPosition_y) && (initialPosition_x + 1) >= xAxis){
                    initialPosition_x = initialPosition_x_Before;
                    continue;
                }
                else{
                    initialPosition_x = initialPosition_x + 1;
                }
            }
            if(initialPath_math == 1){
                if(mathCheck_x.contains(initialPosition_x) && mathCheck_y.contains(initialPosition_y) && (initialPosition_y - 1) < 0){
                    initialPosition_y = initialPosition_y_Before;
                    continue;
                }
                else{
                initialPosition_y = initialPosition_y - 1;
                }
            }
            if(initialPath_math == 2){
                if(mathCheck_x.contains(initialPosition_x) && mathCheck_y.contains(initialPosition_y) && (initialPosition_x - 1) < 0){
                    initialPosition_x = initialPosition_x_Before;
                    continue;
                }
                else{
                initialPosition_x = initialPosition_x - 1;
                }
            }
            if(initialPath_math == 3){
                if(mathCheck_x.contains(initialPosition_x) && mathCheck_y.contains(initialPosition_y) && (initialPosition_y + 1) >= yAxis){
                    initialPosition_y = initialPosition_y_Before;
                    continue;
                    }
                else{
                    initialPosition_y = initialPosition_y + 1;
                    }
            }
        }
        if(initialPath_math == 0){
            initialPath_forword = (char) 69;
        }
        if(initialPath_math == 1){
            initialPath_forword = (char) 83;
        }
        if(initialPath_math == 2){
            initialPath_forword = (char) 87;
        }
        if(initialPath_math == 3){
            initialPath_forword = (char) 78;
        }
        if((initialPosition_x > xAxis) || (initialPosition_y > yAxis)){
            System.out.println(initialPosition_x_Before + " "+initialPosition_y_Before +" "+ initialPath_Before +" LOST");
            mathCheck_x.add(initialPosition_x_Before);
            mathCheck_y.add(initialPosition_y_Before);
            mathCheck_initialPath.add(initialPath_forword);
            checker += 1;
            break;
        } 
    }
    if(checker == 0){
    System.out.println(initialPosition_x + " "+initialPosition_y +" "+ initialPath_forword);
    }
    checker = 0;
    }
    getSc.close();
    }
}
