import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;
        System.out.println("Enter the string:");
        input = s.nextLine();

        String vowels = "aeiouAEIOU";
        StringBuilder v = new StringBuilder();
        StringBuilder c = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if (vowels.contains(String.valueOf(ch))) {
                    v.append(ch);
                }
                else {
                    c.append(ch);
                }
            }
        }

        System.out.println("Vowels found: " + v+"("+v.length()+")");
        System.out.println("Consonants found: " + c+"("+c.length()+")");
    }
}

