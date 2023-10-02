import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line == null || line.isEmpty()) break;
            items.add(line);
        }

        Store store = new Store();
        Cart cart = store.createCart();

        boolean endStocking = false;
        boolean checkOut = false;

        for (String s : items) {
            String[] itemString = s.split(" ");

            if (itemString[0].equals("End")) endStocking = true;
            else if (itemString[0].equals("Checkout")) checkOut = true;

            if (!endStocking && !checkOut && itemString.length > 1) {
                try {
                    NonPerishable item = new NonPerishable(itemString[0], Float.parseFloat(itemString[1]), Float.parseFloat(itemString[2]));
                    store.addItem(item);
                } catch (ArrayIndexOutOfBoundsException e) {
                    Perishable item = new Perishable(itemString[0], Float.parseFloat(itemString[1]));
                    store.addItem(item);
                }
            } if (endStocking && !checkOut && itemString.length > 1) {
                cart.addItem(store.itemsAvailable.stream().filter(item -> item.productName.equals(itemString[0])).findAny().get(), Float.parseFloat(itemString[1]));
            }
        }

        store.packer.getShippingCost(cart);
        store.biller.getTotalCost(cart);

        System.out.println(store.biller.getReceipt(cart));
    }
}
