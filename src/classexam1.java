import java.util.Scanner;

public class classexam1 {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 5;
        int[] array = new int[ARRAY_SIZE];
        int Anoudernumber;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter Number");
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter anouter Number");
        Anoudernumber = scanner.nextInt();
        printArray(array);
        anouderNumberInArray(array, Anoudernumber);
        sumEvenPlace(array);
        sumEvenNumbers(array);
        ifDouble(array);
    }

    public static void printArray(int[] array) {
        System.out.println("the array is ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void anouderNumberInArray(int[] arr, int Anoudernumber) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Anoudernumber) {
                temp++;
            }
        }
        if (temp > 0) {
            System.out.println("The Anouder Number is in array");
        } else {
            System.out.println("The Anouder Number is not in array");
        }
    }

    public static void sumEvenPlace(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum = sum + arr[i];
        }
        System.out.println("the summury of numbers in Even Places is " + sum);

    }

    public static void sumEvenNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("the summury of Even numbers is " + sum);
    }

    public static void ifDouble(int[] arr) {
        boolean answer = false;
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == temp) {
                answer = true;
            }
        }
        System.out.println("is " + answer + " that have a double numbers in array");
    }
}
