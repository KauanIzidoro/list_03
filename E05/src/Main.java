import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        String system_phrase = "Enter a natural number: ";
        int number_n;
        int result = 1;

        Scanner in = new Scanner(System.in);
        System.out.println(system_phrase);
        number_n = Math.abs(in.nextInt());

        if(number_n == 0 || number_n == 1){
            System.out.println("The factorial of this number is: " + 1);
        }else{
            for(int i=1; i<=number_n; i++){
                 result*=i;
            }
            System.out.println("The factorial of this number is: " + result);
        }
    }
}