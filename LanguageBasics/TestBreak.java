public class TestBreak {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        final char character = 'a';

        test:
        for (int argIndex = 0; argIndex < args.length; argIndex++) {
            for (int charIndex = 0; charIndex < args[argIndex].length(); charIndex++) {
                if (args[argIndex].charAt(charIndex) == character) {
                    System.out.println("At least one argument contains '" + character + "'.");
                    break;
//					break test;
                }
                System.out.println(args[argIndex].charAt(charIndex));
//				return;
            }
        }
        System.out.println("End of the program");
    }
}
