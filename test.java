import java.util.*;
public class test {
    public static void main(String[] args) {
        int[] age = new int[100];
        String[] name = new String[100];
        int[] number = new int[100];
        String[] add = new String[100];
        int[] id = new int[100];
        int userCount = 0;
        Scanner s = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            System.out.println("1. Enter User Details");
            System.out.println("2. Show User Details");
            System.out.println("3. Exit");
            System.out.println("Enter your Choice: ");
            int ch = s.nextInt();
            switch (ch) {
                case 1:
                    userCount = data.getData(userCount, name, age, number, add, id);
                    break;
                case 2:
                    data.show(userCount, name, age, number, add);
                    break;
                case 3:
                    a = 0;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}
class data {
    static int getData(int userCount, String[] name, int[] age, int[] number, String[] add, int[] id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for User " + (userCount + 1) + ":");
        System.out.print("Name: ");
        name[userCount] = scanner.next();
        System.out.print("Age: ");
        age[userCount] = scanner.nextInt();
        System.out.print("Phone Number: ");
        number[userCount] = scanner.nextInt();
        System.out.print("Address: ");
        add[userCount] = scanner.next();
        id[userCount] = userCount + 1;
        System.out.println("User details collected.");
        return userCount + 1;
    }

    static void show(int userCount, String[] name, int[] age, int[] number, String[] add)
    {
        Scanner scanner = new Scanner(System.in);

        if (userCount == 0)
        {
            System.out.println("No user found");
            return;
        }
        System.out.print("Enter the user ID to display details (1-" + userCount + "): ");
        int userID = scanner.nextInt();

        if (userID < 1 || userID > userCount)
        {
            System.out.println("Invalid user ID.");
        }
        else
        {
            System.out.println("User " + userID + " Details:");
            System.out.println("Name: " + name[userID - 1]);
            System.out.println("Age: " + age[userID - 1]);
            System.out.println("Phone Number: " + number[userID - 1]);
            System.out.println("Address: " + add[userID - 1]);
        }
    }
}

