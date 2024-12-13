import java.util.Scanner;

class Para {
    int number;
    String name;

    // Constructor with parameters
    Para(int num, String str) {
        number = num;
        name = str;
    }

    void display() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        sc.nextLine(); // Consume the newline

        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        Para obj = new Para(num, name);
        obj.display();
    }
}
