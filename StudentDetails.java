import java.util.Scanner;

public class StudentDetails {
    String Name;
    byte Age;
    char Gender;
    int Salary;

    public static void Add(int size){
        StudentDetails[] arr = new StudentDetails[size];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<size; i++){
                arr[i] = new StudentDetails();
                System.out.println("Enter the name for "+ i+ "Student:");
                arr[i].Name = sc.next();
                System.out.println("Enter the Age for " +i+"Student:");
                arr[i].Age = sc.nextByte();
                System.out.println("Enter the Gender for "+i+"Student:");
                arr[i].Gender = sc.next().charAt(0);
                System.out.println("Enter the Salary for " +i+"Student:");
                arr[i].Salary = sc.nextInt();
        }
        System.out.println(arr.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students you want to add: ");
        int size = sc.nextInt();
        sc.nextLine();
        Add(size);
        sc.close();
    } 
}