import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        String system_phrase_1 = "Enter a number: ";
        double number_1, result;
        double mult = 1;
        String decimal_setup = "#.#";

        DecimalFormat format = new DecimalFormat(decimal_setup);

        System.out.println(system_phrase_1);

        Scanner in = new Scanner(System.in);
        number_1 = in.nextDouble();

        while(mult <= 10){


            result = number_1*mult;
            System.out.println(format.format(number_1) + "x" + format.format(mult) + "=" + format.format(result));
            mult++;

        }
    }
}