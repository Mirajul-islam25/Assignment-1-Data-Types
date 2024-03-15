public class LetterSize {
    public static void main(String[] args) {

        final double MILIMETERS_INCH = 25.4;
        final double width = 8.5;
        final double height = 11;
        double milimeters_width;
        double milimeters_height;
        double perimeter = (8.5 * 2) + (11 * 2);
        double diagonal = (8.5 * 8.5) + (11 * 11);
        diagonal = Math.sqrt(diagonal);

        milimeters_width = width * MILIMETERS_INCH;
        milimeters_height = height * MILIMETERS_INCH;

        System.out.printf("Dimensions in milimeters: %.2f, %.2f", milimeters_width, milimeters_height);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);

      }
    }
