import java.util.Scanner;
public class RectanglesSides {
    public double Area(double x,double y)
    {
        return x*y;
    }
    public double Perimeter(double x,double y)
    {
        return (x * 2) + (y * 2);
    }
    public double Diogonal(double x,double y)
    {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public static void main(String[] args) {
        RectanglesSides rectanglesSides = new RectanglesSides();
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter First Value:");
        double x= sc.nextDouble();
        System.out.printf("Enter Second Value:");
        double y= sc.nextDouble();
        System.out.printf("Area :       %.2f\n",rectanglesSides.Area(x,y));
        System.out.printf("Perimeter:   %.2f\n",rectanglesSides.Perimeter(x,y));
        System.out.printf("Diogonal:    %.2f\n",rectanglesSides.Diogonal(x,y));


    }
}
