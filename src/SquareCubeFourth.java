import java.util.Scanner;

public class SquareCubeFourth {
    public double square(double a,double b)
    {
        return a*b;
    }
    public double cube(double a,double b,double c)
    {
        return a*b*c;
    }
    public double fourth(double a,double b,double c,double d)
    {
        return a*b*c*d;
    }

    public static void main(String[] args) {
        SquareCubeFourth squareCubeFourth = new SquareCubeFourth();
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter First Value:");
        double a= sc.nextDouble();
        System.out.printf("Enter Second Value:");
        double b= sc.nextDouble();
        System.out.printf("Enter Third Value:");
        double c= sc.nextDouble();
        System.out.printf("Enter Fourth Value:");
        double d= sc.nextDouble();

        System.out.printf("square : %.2f\n",squareCubeFourth.square(a,b));
        System.out.printf("cube:    %.2f\n",squareCubeFourth.cube(a,b,c));
        System.out.printf("fourth:  %.2f\n",squareCubeFourth.fourth(a,b,c,d));

    }

}
