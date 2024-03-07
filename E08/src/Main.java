import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        String system_phrase_1 = "Enter a number: ";
        int number;

        Scanner in = new Scanner(System.in);
        System.out.println(system_phrase_1);
        number = in.nextInt();

        if(number == 2)
            System.out.println("This number is prime.");
        if(number < 2)
            System.out.println("This number not is prime.");


        for(int i=2; i<number; i++){
            if(number%i == 0){
                System.out.println("This number not is prime.");
            }else{
                System.out.println("This number is prime");
                break;
            }
        }
    }
}