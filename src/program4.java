import java.util.Scanner;
public class program4 {
    public static void main(String[] args) {
        int num;
        boolean answer=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        num = scanner.nextInt();
        answer=isPrime(num);
        if (answer == true) {
            System.out.println("This is Prime Number");}
        else {
            System.out.println("This is not a prime number");}
    }

    public static boolean isPrime(int num) {
        boolean answer=false;
        for (int i = 2; i< num; i++) {
            if (num % i == 0) {
                answer = false;
            break;}
            else {
                answer = true;}
        }
        return answer;
    }
}
