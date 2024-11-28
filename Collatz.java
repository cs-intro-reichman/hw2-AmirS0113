public class Collatz {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two arguments: the value of N and the mode ('v' or 'c').");
            return;
        }

        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        if (!mode.equals("v") && !mode.equals("c")) {
            System.out.println("Mode can only be 'v' (verbose) or 'c' (concise).");
            return;
        }
        for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 0;
            StringBuilder sequence = new StringBuilder();
            while (current != 1) {
                sequence.append(current).append(" ");
                if (current % 2 == 0) {
                    current /= 2;
                } else {
                    current = current * 3 + 1;
                }
                steps++;
            }

            sequence.append(1).append(" (").append(steps + 1).append(")");
            if (mode.equals("v")) {
                System.out.println(sequence);
            }
        }
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
