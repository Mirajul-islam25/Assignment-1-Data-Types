import java.util.Scanner;
public class Radius {
    public double Area(double x)
    {
        return Math.PI*Math.pow(x,2);
    }
    public double Circumference(double x)
    {
        return 2*Math.PI*x;
    }
    public double Surfacearea(double x)
    {
        return  4*Math.PI*Math.pow(x,2);
    } public double Volume(double x)
    {
        return (4 / 3)*Math.PI*Math.pow(x,3);
    }
    public static void main(String[] args) {
        Radius radius = new Radius();
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter The Value:");
        double x= sc.nextDouble();
        System.out.printf("Area :         %.2f\n",radius.Area(x));
        System.out.printf("Circumference: %.2f\n",radius.Circumference(x));
        System.out.printf("Surfacearea:   %.2f\n",radius.Surfacearea(x));
        System.out.printf("Volume:        %.2f\n",radius.Volume(x));

    }
}
