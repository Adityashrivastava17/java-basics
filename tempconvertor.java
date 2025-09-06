import java.util.Scanner;

public class tempconvertor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Tempreature in Celcius: ");
        double Celcius = sc.nextDouble();

        double fahrenheit =(Celcius*9/5) + 32;
        System.out.println("Tempreature in Fahrenheit: " + fahrenheit ); 
    }
}
