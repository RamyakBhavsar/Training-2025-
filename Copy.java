class CopyConstructor {
    int number;

    // Parameterized Constructor
    CopyConstructor(int num) {
        number = num;
    }

    // Copy Constructor
    CopyConstructor(CopyConstructor obj) {
        number = obj.number;
    }

    void display() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(50);
        CopyConstructor obj2 = new CopyConstructor(obj1); // Copy Constructor

        System.out.println("Original Object:");
        obj1.display();

        System.out.println("Copied Object:");
        obj2.display();
    }
}
