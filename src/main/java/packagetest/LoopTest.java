package packagetest;

public class LoopTest {
    public static void main (String [] args) {
        //printNums(3);
        //printNums2(7);
        printNums3(7);
    }

    public static void printNums (int upperlimit){
        for (int i=0; i<=upperlimit;i++) {
            System.out.println(i);
        }
    }

    public static void printNums2(int top){
        for(int i=0; i<top; i=i+ 2){
            System.out.println(i);
        }
    }

    public static void printNums3 (int banana ){
        for(int i =banana;i>=0;i--){
            System.out.println(i);
        }
    }
}
