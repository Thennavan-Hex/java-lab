import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a;
        System.out.println("Enter Email:");
        a = s.nextLine();

        int atIndex = a.indexOf("@");

        if (atIndex != -1) {
            String domain = a.substring(atIndex + 1);
            System.out.println("Domain: " + domain);
        } 
        else 
        {
            System.out.println("Invalid email format.");
        }
    }
}

