import java.util.Random;
import java.util.Scanner;
public class program8 {
    public static void main(String[] args) {
        boolean iswon = false;
        int guessnumber = 0;
        int player1tries = 0;
        int player2tries = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretnumber = random.nextInt(0, 1000);
        System.out.println(secretnumber);
        do {
            System.out.println("player 1:plaese guess a number");
            guessnumber = scanner.nextInt();
            player1tries++;
            if (guessnumber == secretnumber) {
                System.out.println("Player 1 is The winner, tries: " + player1tries);
                iswon = true;
            } else {
                iswon = biggerorsmaller(secretnumber, guessnumber);
                System.out.println("player 2:plaese guess a number");
                guessnumber = scanner.nextInt();
                player2tries++;
                if (guessnumber == secretnumber) {
                    System.out.println("Player 2 is The winner, tries: " + player2tries);
                    iswon = true;
                }
                else{
                    iswon = biggerorsmaller(secretnumber, guessnumber);
                }
            }
        }
        while (iswon == false) ;
    }

    public static boolean biggerorsmaller(int secretnumber, int guessnumber) {
        boolean iswon = false;
        if (guessnumber > secretnumber) {
            System.out.println("The Number that you guess is bigger from the secret number");
        }
        if (guessnumber < secretnumber) {
            System.out.println("The Number that you guess is smaller from the secret number");
        }
        if (guessnumber == secretnumber) {
            iswon = true;
        }
        return iswon;
    }
}
