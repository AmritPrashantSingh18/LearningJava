public class PracticeQuestions {

    String printData(String data) {
        return data;
    }

    int sumOfTwoNos(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    void swapTwoNos(int firstNumber, int secondNumber) {
        int thirdNumber;
        thirdNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        System.out.println("First Number: " + firstNumber + ", Second Number: " + secondNumber);
    }

    String convertIntegerToBinaryNumber(int num) {
        String binaryNumber = "";
        while (num > 0) {
            binaryNumber += num % 2;
            num /= 2;
        }
        return binaryNumber;
    }

    void addTwoComplexNumber(int realNumber1, int imaginaryNumber1, int realNumber2, int imaginaryNumber2) {
        System.out.println((realNumber1 + realNumber2) + " + " + (imaginaryNumber1 + imaginaryNumber2) + "i");
    }

    int factorialOfNumber(int num) {
        int factorialResult = 1;
        for (int i = num; i > 0; i--) {
            factorialResult *= i;
        }
        return factorialResult;
    }

    void sumOfFibonacciSeries(int length) {
        int sum = 0;
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber;
        System.out.print(firstNumber + " " + secondNumber + " ");
        for (int i = 2; i < length; i++) {
            thirdNumber = firstNumber + secondNumber;
            System.out.print(thirdNumber + " ");

            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
        System.out.println();
    }

    int sumOfArrayElements(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    int largestNumberInArray(int[] num) {
        int largestNumber = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largestNumber) {
                largestNumber = num[i];
            }
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        PracticeQuestions pq = new PracticeQuestions();
        System.out.println(pq.printData("Hello World!"));
        System.out.println(pq.sumOfTwoNos(5, 15));
        pq.swapTwoNos(10, 20);
        System.out.println(pq.convertIntegerToBinaryNumber(9));
        pq.addTwoComplexNumber(1, 2, 4, 5);
        System.out.println(pq.factorialOfNumber(5));
        pq.sumOfFibonacciSeries(10);
        int[] num = {2, 4, 6, 7, 9};
        System.out.println(pq.sumOfArrayElements(num));
        System.out.println(pq.largestNumberInArray(num));
    }
}
