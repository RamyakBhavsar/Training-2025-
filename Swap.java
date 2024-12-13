
public class Swap {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Ramyak Bhavsar";
        changeName(name);
        System.out.println(name);

    }

    static void changeName(String name) {
        name = "RAM RAM";
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
