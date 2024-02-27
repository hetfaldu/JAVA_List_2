public class Calculator {

   
    public int add(int a, int b) {
        return a + b;
    }


    public int subtract(int a, int b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }


    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) 
{
  
        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(10, 5);
        int resultSubtract = calculator.subtract(10, 5);
        int resultMultiply = calculator.multiply(10, 5);
        int resultDivide = calculator.divide(10, 5);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSubtract);
        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
    }
}
