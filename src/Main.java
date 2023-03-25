import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();
        if (delta > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        } else if (delta == 0) {
            double root = equation.getRoot1();
            System.out.println("The equation has one root " + root);
        } else {
            System.out.println("The equation has no roots");
            System.out.println();
        }
    }
}