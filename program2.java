import java.util.Scanner;

public class program2 {
    public static void main(String []args){
        double num1;
        int num2;
        int num3;
        double avg;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number 1");
        num1=scanner.nextDouble();
        System.out.println("Enter Number 2");
        num2=scanner.nextInt();
        System.out.println("Enter Number 3");
        num3=scanner.nextInt();
        avg=theAverage(num1,num2,num3);
        System.out.println("The average is "+theAverage(num1,num2,num3));
        System.out.println("The average is "+avg);
    }
    public static double theAverage(double num1,int num2, int num3){
        double avg;
        avg=(num1+num2+num3)/3;
        return avg;
    }
}
