public class Cheers {
    public static void main(String[] args) {
        // Get the inputs from the command line
        String inputString = args[0].toUpperCase();
        int repeatCount = Integer.parseInt(args[1]);

        // Define the list of letters that require "an" instead of "a"
        String vowels = "AEFHILMNORSX";

        // Print the "Give me..." lines
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            String article = (vowels.indexOf(ch) >= 0) ? "an" : "a";
            System.out.println("Give me " + article + " " + ch + ": " + ch + "!");
        }

        // Print the spell line
        System.out.println("What does that spell?");
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(inputString + "!!!");
        }
    }
}
