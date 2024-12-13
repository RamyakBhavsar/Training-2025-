import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        //String message = greet();
        //System.out.println(message);

        Scanner sc = new Scanner(System.in);
        System.out.println("Name"); 
        String name = sc.nextLine();

        String personalized = myGreet("Ramyak");
        System.out.println(personalized);
        
    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }

    static String greet(){
        String greeting = "Hello ";
        return greeting;

    }
}
