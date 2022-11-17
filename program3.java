import java.util.Scanner;

public class program3 {
    public static void main(String []args){
        int num1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number");
        num1=scanner.nextInt();
        if(isEven(num1)==true){
        System.out.println("the Number is Even");}
        else {
            System.out.println("The Number is odd");
        }
    }
    public static boolean isEven(int num){
        if(num%2==0){
            return true;}
        else{
            return false;}
        }
    }

