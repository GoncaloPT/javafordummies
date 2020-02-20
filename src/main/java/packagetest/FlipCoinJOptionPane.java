package packagetest;
import javax.swing.*;

public class FlipCoinJOptionPane {
    public static void main (String [] args){
        String input = JOptionPane.showInputDialog("Number:");
        int x = Integer.parseInt(input);
        for (int i=0;i<x;i++){
            if (Math.random() < 0.5) {
                System.out.println("Heads");
            } else {
                System.out.println("Tails");
            }
        }
    }
}
