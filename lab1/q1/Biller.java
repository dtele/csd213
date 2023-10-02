import java.util.ArrayList;
import java.util.Formatter;

class Biller {
    public void getTotalCost(Cart cart) {
        double billCost = 0.0;

        for (Item item: cart.itemsInCart) {
            billCost += item.quantityInCart * item.pricePerUnit;
        }

        cart.billCost = billCost;
        cart.totalCost = billCost + cart.shippingCost;

    }

    public String getReceipt(Cart cart) {
        ArrayList<String> lines = new ArrayList<>();
        Formatter fmt = new Formatter();

        for (Item item: cart.itemsInCart) {
            fmt.format("%14s %14s %17s\n", item.productName, item.quantityInCart, item.quantityInCart * item.pricePerUnit);
        }

        fmt.format("%14s %14s %17s\n", "Shipping", "", cart.shippingCost);
        fmt.format("%14s %14s %17s\n", "Total", "", cart.totalCost);

        return fmt.toString();
    }

    Biller() {}
}
