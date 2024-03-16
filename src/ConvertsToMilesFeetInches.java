import java.util.Scanner;
public class ConvertsToMilesFeetInches {
    public double Miles(double x)
    {
        return x*0.000621371192;
    }
    public double Feet(double x)
    {
        return x*3.2808399;
    }
    public double Inches(double x)
    {
        return x*39.3700787;
    }

    public static void main(String[] args) {
        ConvertsToMilesFeetInches convertsToMilesFeetInches = new ConvertsToMilesFeetInches();
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter The Value:");
        double x= sc.nextDouble();
        System.out.printf("Miles :  %.4f\n",convertsToMilesFeetInches.Miles(x));
        System.out.printf("Feet:    %.4f\n",convertsToMilesFeetInches.Feet(x));
        System.out.printf("Inches:  %.4f\n",convertsToMilesFeetInches.Inches(x));


    }

}
