import java.util.Scanner;

public class program9 {
    public static void main(String []args){
        System.out.print("Welcome to Calculator! ");
        menu();
    }
    public static void menu(){
        Scanner scanner=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Please enter your choice: ");
            System.out.println("1. Calculation of distance between two points (X1,Y1)(X2,Y2)");
            System.out.println("2. Calculation of the excess length of a right triangle");
            System.out.println("3. Calculating the perimeter and area of a circle");
            System.out.println("4. Calculation of square area");
            System.out.println("5. Calculating the area of a rectangle");
            System.out.println("6. Exit");
            choice= scanner.nextInt();
            if(choice<1||choice>6){
                System.out.println("The value you selected is invalid, please select again.");
            menu();}
            if(choice==1){
                prog1();}
            if(choice==2){
                prog2();}
            if(choice==3){
                prog3();}
            if(choice==4){
               prog4(choice);}
            if(choice==5){
               prog4(choice);}
        }
        while(choice!=6);
    }
    public static void prog1(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Calculation of distance between two points (X1,Y1)(X2,Y2)");
        double x1=0;
        double y1=0;
        double x2=0;
        double y2=0;
        double distance;
        System.out.println("Please Enter x1 Cordinates");
        x1=scanner.nextDouble();
        System.out.println("Please Enter y1 Cordinates");
        y1=scanner.nextDouble();
        System.out.println("Please Enter x2 Cordinates");
        x2=scanner.nextDouble();
        System.out.println("Please Enter y2 Cordinates");
        y2=scanner.nextDouble();
        distance=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println("The distance between two points (X1,Y1)(X2,Y2) is "+distance);
        menu();
    }
    public static void prog2(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Calculation of the excess length of a right triangle");
        double sideA=0;
        double sideB=0;
        double sideC;
        System.out.println("Please Enter Side A of triangle");
        sideA=scanner.nextDouble();
        System.out.println("Please Enter side B of triangle");
        sideB=scanner.nextDouble();
        sideC=Math.sqrt((sideA*sideA)+(sideB*sideB));
        System.out.println("The length of a right triangle is "+sideC);
        menu();
    }
    public static void prog3(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Calculating the perimeter and area of a circle");
        double radius;
        double perimeter;
        double area;
        System.out.println("Please Enter radius of circle");
        radius=scanner.nextDouble();
        perimeter=2*Math.PI*radius;
        area=Math.PI*radius*radius;
        System.out.println("The perimeter of a circle is "+perimeter+" and the area is "+area);
        menu();
    }
    public static void prog4(int choice){
        Scanner scanner=new Scanner(System.in);
        double sideA;
        double sideB;
        double area;
        System.out.println("Please Enter a length side");
        sideA=scanner.nextDouble();
        if(choice==4){
            area=sideA*4;
            System.out.println("the square area is "+area);}
        else{
            System.out.println("Please Enter a width side");
            sideB=scanner.nextDouble();
            area=sideA*sideB;
            System.out.println("the rectangle area is "+area);}
        menu();
    }
}
