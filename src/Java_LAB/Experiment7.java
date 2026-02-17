package Java_LAB;

public class Experiment7 {
    static class calculator {

        int add(int a, int b) {
            return a + b;
        }

        float add(float a, float b) {
            return a + b;
        }

        // Method to add three integers
        int add(int a, int b, int c) {
            return a + b + c;
        }
    }


        public static void main(String[] args) {

            calculator calc = new calculator();

            // Calling overloaded methods
            System.out.println("Sum of two integers: " + calc.add(10, 20));
            System.out.println("Sum of two floats: " + calc.add(5.5f, 4.5f));
            System.out.println("Sum of three integers: " + calc.add(10, 20, 30));
        }
    }


