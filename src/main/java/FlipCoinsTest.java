public class FlipCoinsTest {
    public static void main (String [] args) {
        flipCoins();

    }
    public static void flipCoins() {
        for (int i=0; i<10;i++) {
            if (Math.random() < 0.5) {
                System.out.println("Heads");
            } else {
                System.out.println("Tails");
            }
        }
    }

}
