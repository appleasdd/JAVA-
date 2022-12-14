package javawork;
import java.util.Scanner;
public class 唐知謙411077018_0_2 {
    public static void main(String[] args) {
        try (Scanner inputReader = new Scanner(System.in)) {
            int Frequency = inputReader.nextInt(); 
            int i;
            for(i = 1 ; i <= Frequency ; i++){
            int Start = inputReader.nextInt();
            int End = inputReader.nextInt();
            int j;
            int Sum = 0;
            for(j = Start ; j <= End ; j++){
                if (j%2 != 0){
                    Sum = Sum + j; 
            }
            }
            System.out.println("Case "+i+":"+" "+ Sum);
            }
            inputReader.close();
        }
}
}
