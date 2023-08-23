import java.util.*;
interface Show {
    void display();
}
interface Edit {
    void edit();
}

class UserData implements Show, Edit {
    private String name;
    private int age;
    private int id;
    UserData(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new name: ");
        name = scanner.next();
        System.out.print("Enter new age: ");
        age = scanner.nextInt();
        System.out.println("User details updated.");
    }
}
public class exp3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ch = 0;
        int nextId = 1;
        List<UserData> users = new ArrayList<>();

        while (ch != 4) {
            System.out.println("1. Enter user details");
            System.out.println("2. Show user details");
            System.out.println("3. Edit user details");
            System.out.println("4. Exit");
            System.out.println("Enter your Choice: ");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = s.next();
                    System.out.print("Enter age: ");
                    int age = s.nextInt();
                    UserData newUser = new UserData(nextId, name, age);
                    users.add(newUser);
                    nextId++;
                    break;
                case 2:
                    System.out.print("Enter user ID to view details: ");
                    int userIdToView = s.nextInt();
                    boolean found = false;
                    for (UserData user : users) {
                        if (user.getId() == userIdToView) {
                            user.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("User not found with the given ID.");
                    }
                    break;
                case 3:
                    System.out.print("Enter user ID to edit details: ");
                    int userIdToEdit = s.nextInt();
                    found = false;
                    for (UserData user : users) {
                        if (user.getId() == userIdToEdit) {
                            user.edit();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("User not found with the given ID.");
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

