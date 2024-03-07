import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        String system_phrase_1 = "Enter five numbers: ";
        int n = 5;
        int[] arr = new int[n];
        int test;


        System.out.println(system_phrase_1);
        Scanner in = new Scanner(System.in);

        for (int i = 0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i<arr.length; i++){
                for (int j = i + 1; j<arr.length; j++){
                    if (arr[i] > arr[j]){
                        test = arr[i];
                        arr[i] = arr[j];
                        arr[j] = test;
                    }
                }
        }
        System.out.println(arr[0] + " and " + arr[4]);
    }
}
