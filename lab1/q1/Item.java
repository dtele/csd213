class Item {
    String productName;
    float pricePerUnit;
    float quantityInCart;

    public boolean isPerishable() {
        return (this.getClass().getName().equals("Perishable"));
    }

    public Item(String productName, float pricePerUnit) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
    }
    public Item() {
    }
}