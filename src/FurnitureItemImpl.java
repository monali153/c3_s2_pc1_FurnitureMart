import java.util.Scanner;

public class FurnitureItemImpl {

    public static void main(String[] args) {

        FurnitureItem object = new FurnitureItem();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which type Of furniture usage you want ?");
        object.furnitureUsage = scanner.nextLine();
        System.out.println("Enter type of furniture you want");
        object.furnitureType = scanner.nextLine();
        System.out.println("Which color do you want in furniture?");
        object.color = scanner.nextLine();
        System.out.println("Enter grade");
        object.gradeOfFurniture = scanner.nextInt();
        scanner.nextLine();

        object.furnitureCode = 1234;
        object.price = 2000;

        if (object.furnitureUsage.equals("outdoor")) {
            System.out.println("Discount on outdoor furniture = " + object.calculateDiscount(5));
        } else {
            System.out.println("No discount on indoor furniture");
        }
    }
}
