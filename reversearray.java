import java.util.Arrays;

public class reversearray{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int l = arr.length-1;
        int f = 0;
        while (f<l) {
            int temp = arr[f];
           arr[f]=arr[l];
           arr[l]=temp;
           f++;
           l--; 
        }
        System.out.println(Arrays.toString(arr));
    }
}