import java.util.Scanner;

class Month {
    static void display(int m) {
        String month;
        int days;

        switch (m) {
            case 1:  
                month = "January";
                days = 31; break;
            case 2:  
                month = "February";  
                days = 28; break;
            case 3:  
                month = "March";     
                days = 31; break;
            case 4:  
                month = "April";     
                days = 30; break;
            case 5:  
                month = "May";       
                days = 31; break;
            case 6:  
                month = "June";      
                days = 30; break;
            case 7:  
                month = "July";      
                days = 31; break;
            case 8:  
                month = "August";    
                days = 31; break;
            case 9:  
                month = "September"; 
                days = 30; break;
            case 10: 
                month = "October";   
                days = 31; break;
            case 11: 
                month = "November";  
                days = 30; break;
            case 12: 
                month = "December";  
                days = 31; break;
            default: 
                month = "Invalid month number."; 
                days = 0; break;
        }

        System.out.println(month + " has " + days + " days.");
    }
}

public class calander {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter the month number (1-12, 0 to exit):");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 12) {
                Month.display(choice);
            } else if (choice != 0) {
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            }
        } 
        while (choice != 0);

        scanner.close();
    }
}

