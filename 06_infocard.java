import java.util.Scanner;

public class infocard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your collage name: ");
        String collage = sc.nextLine();

        System.out.println("Enter your hobby: ");
        String hobby = sc.nextLine();

        System.out.println("---------info card------------");
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("collage: " + collage );
        System.out.println("hobby: " + hobby);


        
    }
}

