import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {8,17,5,20,25};
        int temp;
        for(int i = 0; i < arr.length-1;i+=2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
