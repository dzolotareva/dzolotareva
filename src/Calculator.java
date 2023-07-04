public class Calculator {
    public static void main(String[] args) {

        int a = 20;
        int b = 0;
        char sign = '^';
        if (sign == '+') {
            int result = a + b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '-') {
            int result = a - b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '*') {
            int result = a * b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '/') {
            int result = a / b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '^') {
            int result = 1;
            for (int i = 0; i < b; i++) {
                result = result * a;
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '%') {
           int result = a % b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}


