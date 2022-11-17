import java.util.Scanner;
public class project1 {
    public static void main(String []args){
        final int ARRAY_SIZE=5;
        int [] array=new int[ARRAY_SIZE];
        int Anoudernumber;
        Scanner scanner=new Scanner(System.in);
        for(int i=0; i< array.length; i++){
            System.out.println("enter Number");
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter anouter Number");
        Anoudernumber=scanner.nextInt();
        printarray(array);
        anoudernumberinarray(array,Anoudernumber);
    }
    public static void printarray(int[] array){
        System.out.println ("the array is "+ array);
    }
    public static void anoudernumberinarray(int[] array,  int Anoudernumber){
        for(int i=0; i< array.length; i++){
            if(array[i]==Anoudernumber){
                System.out.println("The Anouder Number is in array");}
            else{
                System.out.println("The Anouder Number is not in array");}
            }
        }
    }
