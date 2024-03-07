import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String systemPhrase = "Enter two integers: ";
        int number_1, number_2;

        Scanner in = new Scanner(System.in);

        System.out.println(systemPhrase);

        number_1 = in.nextInt();
        number_2 = in.nextInt();


        if (number_1 < number_2) {
            for (int j = number_1; j <= number_2; j++) {
                System.out.println(j);
            }
        } else {
            for (int k = number_2; k <= number_1; k++) {
                System.out.println(k);
            }
        }
    }
}
