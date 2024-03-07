import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        String start = "Multiplication Game";
        int User_result;
        boolean user_option = true;
        String decimal_setup = "#.#";

        Scanner in = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat(decimal_setup);

        System.out.println(start);

        while (user_option) {
            System.out.println("For a new game enter 1. To exit enter 0.");

            int userChoice = in.nextInt();

            if (userChoice == 1) {
                for (int k = 1; k < 10; k++) {
                    for (int j = 1; j < 10; j++) {
                        int result = j * k;

                        System.out.println(k + "x" + j + "=");
                        User_result = in.nextInt();

                        if (User_result == result) {
                            System.out.println("Nice, next question: ");
                        } else {
                            System.out.println("Wrong answer. Do you want to play again? (Y = 1/N = 0)");
                            int new_game = in.nextInt();
                            if (new_game == 1) {
                                break;
                            } else {
                                user_option = false;
                                break;
                            }
                        }
                    }
                }
            } else if (userChoice == 0) {
                user_option = false;
            } else {
                System.out.println("Invalid choice. Please enter 1 to play or 0 to exit.");
            }
        }

        System.out.println("Thanks for playing!");
    }
}
