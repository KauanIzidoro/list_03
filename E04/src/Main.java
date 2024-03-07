public class Main{
    public static void main(String[] args){
        int f, c;

        for(c=-80; c<=80; c+=10){
            f=((9*c)/5)+32;
            System.out.println("In Celsius degrees = " + c + " In Fahrenheit degrees = " + f);
        }
    }
}
