import java.lang.reflect.Array;
import java.util.Arrays;

public class arraysandfor {
    /*public static void main(String[] args) {
int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};

// Declare sum variable, assign it initial value of zero
int sum = 0;*/
    public static void main(String[] args) {
        int[] numbers={2,29,33,4,15,62,7,81,9,10};
        int sum=0;

        for(int i=0;i<=9;i++){
            sum=sum+numbers[i];


        }
        System.out.println("the sum is "+ sum);
    }
}
