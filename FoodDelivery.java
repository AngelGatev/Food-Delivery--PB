package PbJavaNovember.src.FirstStepsInCoding.Excercise;

        import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double chicken = Double.parseDouble(scanner.nextLine());
        double fish = Double.parseDouble(scanner.nextLine());
        double vegetarian = Double.parseDouble(scanner.nextLine());
        double sumFood = chicken * 10.35 + fish * 12.40 + vegetarian * 8.15;
        double dessert = 0.2 * sumFood;

        System.out.println(sumFood + dessert + 2.5);

    }
}
