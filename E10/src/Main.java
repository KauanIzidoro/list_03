import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter the term in which you want to observe the Fibonacci sequence: ";
        int f_1 = 0, f_2 = 1, number;
        int temp;

        Scanner in = new Scanner(System.in);
        System.out.println(system_phrase_1);
        number = in.nextInt();

        for(int i=0; i<number; i++){
            System.out.println(f_2);
            temp = f_2;
            f_2 = f_2 + f_1;
            f_1 = temp;
        }
    }
}
