import java.util.Scanner;

public class program5 {
    public static void main (String []args){
        int num1;
        int num2;
        int num3;
        boolean answer=false;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number 1");
        num1=scanner.nextInt();
        System.out.println("Enter Number 2");
        num2=scanner.nextInt();
        System.out.println("Enter Number 3");
        num3=scanner.nextInt();
        answer=isPitagoric(num1,num2,num3);
        if (answer == true) {
            System.out.println("This is pitagoric Trio");}
        else {
            System.out.println("This is not a pitagoric Trio");}
    }
    public static boolean isPitagoric(int num1,int num2,int num3){
        boolean answer=false;
        if((num1*num1)+(num2*num2)==(num3*num3)){
            answer=true;}
        else{
            answer=false;}
        return answer;
        }
    }
