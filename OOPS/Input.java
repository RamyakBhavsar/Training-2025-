import java.util.*;
public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name");
        String name = sc.nextLine();

        System.out.println("Age");
        int age = sc.nextInt();

        System.out.println("Hello"+name+  " Hii" +age);
    }
}