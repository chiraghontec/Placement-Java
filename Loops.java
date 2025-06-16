public class Loops {
    static int i=0;
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.println("The value of i in for loop is: " + i);
        }
        while (i < 5) {
            System.out.println("The value of i in while loop is: " + i);
            i++;
        }
        do {
            System.out.println("The value of i in do-while loop is: " + i);
            i++;
        } while (i < 10);
    }
}
