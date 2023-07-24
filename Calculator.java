class Calculator {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    int subtract(int num1, int num2) {
        return num1 - num2;
    }

    int multiply(int num1, int num2) {
        return num1 * num2;
    }

    double divide(int num1, int num2) {
        int num3 = 0;
        try {
            num3 = num1 / num2;
            return num3;
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 not possible hence returning 0 as output");
            return 0;
        }

    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1, 2));
        System.out.println(c.subtract(5, 2));
        System.out.println(c.multiply(3, 8));
        System.out.println(c.add(8, 6));
        System.out.println(c.subtract(12, 48));
        System.out.println(c.divide(32, 4));
        System.out.println(c.divide(2, 0));

    }
}