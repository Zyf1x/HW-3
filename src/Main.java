public class Main {
    public static void main(String[] args) {
        double[] numbers = {8.0, 2.0, -4.0, 2.0, 3.0, 6.0, -7.0, 1.5, -2.5, 4.5, -1.0, 9.0, -3.0, 5.0, -6.0};


        double sumPositive = 0.0;
        boolean afterFirstNegative = false;

        for (double number : numbers) {
            if (number < 0) {
                afterFirstNegative = true;
            } else if (afterFirstNegative) {
                sumPositive += number;
            }
        }

        int countPositive = 0;
        for (double number : numbers) {
            if (afterFirstNegative && number > 0) {
                countPositive++;
            }
        }

        if (countPositive > 0) {
            double averagePositive = sumPositive / countPositive;
            System.out.println("Arithmetic mean of numbers after the first negative: " + averagePositive);
        } else {
            System.out.println("No positive numbers after the first negative.");
        }
    }
}
