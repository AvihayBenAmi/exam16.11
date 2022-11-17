import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        int num;
        int sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        num = scanner.nextInt();
        sum = digitsum(num);
        System.out.println("The sum of digits is " + sum);
    }

    public static int digitsum(int num) {
        int sum = 0;
        do {
            sum = sum + (num % 10);
            num = num / 10;
        }
        while(num!=0);{
            return sum;
        }
    }
}
