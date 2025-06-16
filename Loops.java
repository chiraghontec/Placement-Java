import java.util.Scanner;

public class Loops {
    static int i=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for option (0-2): ");
        int option = scanner.nextInt();
        switch (option) {
            case 0: 
                for(int i = 0; i < 5; i++) {
                    System.out.println("The value of i in for loop is: " + i);
                }   
                break;
            case 1:
                while(i < 5) {
                    System.out.println("The value of i in while loop is: " + i);
                    i++;
                }
                break;
            case 2:
                i = 0;
                do {
                    System.out.println("The value of i in do-while loop is: " + i);
                    i++;
                } while (i < 5);
                default:
                System.out.println("Enter a valid option!!");
                break;
        }
    }
}