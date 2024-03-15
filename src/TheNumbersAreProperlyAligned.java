import java.util.Scanner;

public class TheNumbersAreProperlyAligned {
    public double Add(double x,double y)
    {
        return x+y;
    }
    public double Difference(double x,double y)
    {
        return x-y;
    }
    public double Multiplication(double x,double y)
    {
        return x*y;
    } public double Average(double x,double y)
    {
        return (x+y)/2;
    }
    public double Distances(double x,double y)
    {
        return Math.abs(x-y);
    }
    public double Max(double x,double y)
    {
        return Math.max(x,y);
    }
    public double Min(double x,double y)
    {
        return Math.min(x,y);

    }
    public static void main(String[] args) {
        TheNumbersAreProperlyAligned theNumbersAreProperlyAligned = new TheNumbersAreProperlyAligned();
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter First Value:");
        double x= sc.nextDouble();
        System.out.printf("Enter Second Value:");
        double y= sc.nextDouble();
        System.out.printf("Add :            %.2f\n", theNumbersAreProperlyAligned.Add(x,y));
        System.out.printf("difference:      %.2f\n",theNumbersAreProperlyAligned.Difference(x,y));
        System.out.printf("Multiplication:  %.2f\n",theNumbersAreProperlyAligned.Multiplication(x,y));
        System.out.printf("Average:         %.2f\n",theNumbersAreProperlyAligned.Average(x,y));
        System.out.printf("Distance :       %.2f\n",theNumbersAreProperlyAligned.Distances(x,y));
        System.out.printf("Max:             %.2f\n",theNumbersAreProperlyAligned.Max(x,y));
        System.out.printf("Min :            %.2f\n",theNumbersAreProperlyAligned.Min(x,y));

        }
     }