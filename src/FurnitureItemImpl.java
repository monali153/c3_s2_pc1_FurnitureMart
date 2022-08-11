import java.util.Scanner;

public class FurnitureItemImpl {

    public static void main(String[] args) {

        FurnitureItem object = new FurnitureItem();

        Scanner scanner = new Scanner(System.in);

        object.furnitureCode = 0;
        object.furnitureUsage = "outdoor";
        object.furnitureType = "table";
        object.color = "Red";
        object.gradeOfFurniture = "grade 1";
        object.price = 2000;

        System.out.println("Furniture Code =" + object.furnitureCode);
        System.out.println("Furniture Usage =" + object.furnitureUsage);
        System.out.println("Furniture Type =" + object.furnitureType);
        System.out.println("Color =" + object.color);
        System.out.println("Grade =" + object.gradeOfFurniture);
        System.out.println("Price =" + object.price);

        if (object.furnitureUsage.equals("outdoor")) {
            System.out.println("Discount on outdoor furniture = " + object.calculateDiscount(5));
        } else {
            System.out.println("No discount on indoor furniture");
        }
    }
}
