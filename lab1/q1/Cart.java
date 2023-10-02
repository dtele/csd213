import java.util.ArrayList;
import java.util.stream.Collectors;

class Cart {
    ArrayList<Item> itemsInCart = new ArrayList<>();
    double shippingCost;
    double billCost;
    double totalCost;

    public void addItem(Item item, float itemQuantity) {
        itemsInCart.add(item);
        item.quantityInCart = itemQuantity;
    }
    public void addItem(Perishable item, float itemQuantity) {
        itemsInCart.add(item);
        item.quantityInCart = itemQuantity;
    }
    public void addItem(NonPerishable item, float itemQuantity) {
        itemsInCart.add(item);
        item.quantityInCart = itemQuantity;
    }

    public ArrayList<Item> getItems() {
        return itemsInCart;
    }
    public ArrayList<Item> getPerishables() {
        return (ArrayList<Item>) itemsInCart.stream().filter(item -> item.getClass().getName().equals("Perishable")).collect(Collectors.toList());
    }
    public ArrayList<Item> getNonPerishables() {
        return (ArrayList<Item>) itemsInCart.stream().filter(item -> item.getClass().getName().equals("NonPerishable")).collect(Collectors.toList());
    }
}