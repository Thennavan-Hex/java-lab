import java.util.Scanner;

class Table {
    void display(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + a + " = " + i * a);
        }
    }
}

public class table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Enter a table:");
        a = s.nextInt();
        Table t = new Table();
        t.display(a);
    }
}

