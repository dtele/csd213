import java.util.ArrayList;

class Store {
    ArrayList<Item> itemsAvailable = new ArrayList<>();
    ArrayList<Cart> cartsInStore = new ArrayList<>();
    Packer packer = new Packer();
    Biller biller = new Biller();

    public final Cart createCart() {
        Cart cart = new Cart();
        cartsInStore.add(cart);
        return cart;
    }
    public void addItem(Item item) {
        itemsAvailable.add(item);
    }
    public void addItem(Perishable item) {
        itemsAvailable.add(item);
    }
    public void addItem(NonPerishable item) {
        itemsAvailable.add(item);
    }
    public void showItems() {
        System.out.println(itemsAvailable);
    }
    public void showCarts() {
        System.out.println(cartsInStore);
    }
}