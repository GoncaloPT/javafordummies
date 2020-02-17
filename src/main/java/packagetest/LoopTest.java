package packagetest;

import java.sql.SQLOutput;

public class LoopTest {
    public static void main (String [] args){
        printNums1(3);
        System.out.println("");
        printNums2(7);
        System.out.println("");
        printNums3(10);
    }
    public static void printNums1 (int upperLimit){
    for(int i=0; i<upperLimit; i++) {
        System.out.println(i);
    }
}
    public static void printNums2 (int upperLimit){
        for(int i=0; i<=upperLimit; i = i +2) {
            System.out.println(i);
        }
    }

    public static void printNums3 (int banana){
        for (int i=banana;i>=0; i--){
            System.out.println(i);
        }
    }
}

