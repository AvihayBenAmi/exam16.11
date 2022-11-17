import java.util.Scanner;

public class program1 {
    public static void main(String []args){
        int num1;
        int num2;
        int num3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number 1");
        num1=scanner.nextInt();
        System.out.println("Enter Number 2");
        num2=scanner.nextInt();
        System.out.println("Enter Number 3");
        num3=scanner.nextInt();
        theBigger(num1,num2,num3);
        }
        public static void theBigger(int num1,int num2,int num3){
        int tempnum=num1;
        if(num2>tempnum){
            tempnum=num2;}
        if(num3>tempnum){
            tempnum=num3;}
        System.out.println("The Bigger Number is "+tempnum);
        }
        }
