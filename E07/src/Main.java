import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result, number;
        String decimal_setup = "#.#";

        DecimalFormat format = new DecimalFormat(decimal_setup);




        for(int i=1; i<10; i++){
            for(int j=1; j<10;j++){
                result = j*i;
                System.out.println(i + "x" + format.format(result/i) + "=" + result);

            }
            System.out.println("-----");
        }
    }
}
