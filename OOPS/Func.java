import java.util.*;

public class Func {
    public static void main(String[] args) {
       //sum(); //function call
       //int ans = sum2();
       //System.out.println(ans);

       int answ = sum3(30, 20);
       System.out.println(answ);
    }

    //pass the number when you are calling a method 
    static int sum3(int a ,int b){
        int sum = a+b;
        return sum;

    }
    //return value
    static int  sum2(){
        Scanner sc = new Scanner(System.in);
        int num1,num2,sum;

        System.out.println("Enter First Num");
        num1 = sc.nextInt();

        System.out.println("Enter Second Num");
        num2 = sc.nextInt();

        sum = num1+num2;
        return sum;// function over
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        int num1,num2,sum;

        System.out.println("Enter First Num");
        num1 = sc.nextInt();

        System.out.println("Enter Second Num");
        num2 = sc.nextInt();

        sum = num1+num2;
        System.out.println("Ans=" +sum);
    }
}
