import java.util.*;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enteer your age:");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("You can vote");
        }else{
            System.out.println("No vote for you");
        }
    }
}
