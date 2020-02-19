public class FourRandom {
    public static void main(String[] args) {
        double[] numbers = doubles();
        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        */
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);

    }

    public static double[] doubles() {
        return new double[]{Math.random(), Math.random(), Math.random(), Math.random()};

    }
}
