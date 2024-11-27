public class CalcPi {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single non-negative integer.");
            return;
        }
            int terms = Integer.parseInt(args[0]);
            if (terms < 0) {
                System.out.println("Please provide a non-negative integer.");
                return;
            }
                double piApproximation = 0.0;
                    for (int i = 0; i < terms; i++) {
                        double term = Math.pow(-1, i) / (2 * i + 1);
                        piApproximation += term;
                    }
                    piApproximation *= 4;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + piApproximation);
    }
}
