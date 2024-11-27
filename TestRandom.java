public class TestRandom {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single non-negative integer argument.");
            return;
        }

        int N = Integer.parseInt(args[0]);
        if (N < 0) {
            System.out.println("Please provide a non-negative integer.");
            return;
        }

        int greaterThanHalf = 0;
        int lessThanOrEqualToHalf = 0;

        for (int i = 0; i < N; i++) {
            double randomValue = Math.random();
            if (randomValue > 0.5) {
                greaterThanHalf++;
            } else {
                lessThanOrEqualToHalf++;
            }
        }

        System.out.println("> 0.5: " + greaterThanHalf + " times");
        System.out.println("<= 0.5: " + lessThanOrEqualToHalf + " times");

        if (lessThanOrEqualToHalf == 0) {
            System.out.println("All numbers generated are greater than 0.5, ratio cannot be calculated.");
                } else if (greaterThanHalf == 0) {
                    System.out.println("All numbers generated are less than or equal to 0.5, ratio cannot be calculated.");
                        } else {
                            double ratio = (double) greaterThanHalf / lessThanOrEqualToHalf;
        System.out.println("Ratio: " + ratio);
        }
    }
}
