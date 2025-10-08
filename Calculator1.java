import java.util.Scanner;
class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by Zero is not defined!");
        } else {
            return a / b;
        }
    }

    public static void performAddition() {
        Scanner obj = new Scanner(System.in);
        System.out.println("What type of addition u want to do: ");
        System.out.println("1. Add 2 integers");
        System.out.println("2. Add 3 integers");
        System.out.println("3. Add 3 doubles");
        int choice = obj.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Enter two integers: ");
                int a = obj.nextInt();
                int b = obj.nextInt();
                System.out.println("Result: " + add(a, b));
                break;
            }

            case 2: {
                System.out.println("Enter three integers: ");
                int a = obj.nextInt();
                int b = obj.nextInt();
                int c = obj.nextInt();
                System.out.println("Result: " + add(a, b, c));
                break;
            }

            case 3: {
                System.out.println("Enter three double nos: ");
                double a = obj.nextDouble();
                double b = obj.nextDouble();
                double c = obj.nextDouble();
                System.out.println("Result: " + add(a, b, c));
                break;
            }
        }
    }

    public static void performSub() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = obj.nextInt();
        int b = obj.nextInt();
        System.out.println("Result: " + subtract(a, b));
    }

    public static void performMultiply() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = obj.nextInt();
        int b = obj.nextInt();
        System.out.println("Result: " + multiply(a, b));
    }

    public static void performDiv() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = obj.nextInt();
        int b = obj.nextInt();
        System.out.println("Result: " + divide(a, b));
    }

    public static void mainMenu() {
        Scanner obj = new Scanner(System.in);
        System.out.println("-------MainMenu!-------");
        System.out.println("Welcome! What do you want to do:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        int chara = obj.nextInt();
        switch (chara) {
            case 1:
                performAddition();
                break;
            case 2:
                performSub();
                break;
            case 3:
                performMultiply();
                break;
            case 4:
                performDiv();
                break;
            case 5:
                System.out.println("Exiting Calculator! Have a Nice Day!");
                break;
            default:
                System.out.println("Request Time Out");
        }
    }

    public static void main(String[] args)
    {
        mainMenu();
    }
}
