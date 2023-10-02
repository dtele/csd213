class Packer {
    private final float freePerishables = 5;
    private final float perKgPerishables = 5;
    private final float freeNonPerishables = 4;
    private final float perLiterNonPerishables = 2;

    public double getShippingCost(Cart cart) {
        double shippingCost = 0.0;
        double totalPerishableWeight = -freePerishables;
        double totalNonPerishableVolume = -freeNonPerishables;

        for (Item item: cart.itemsInCart) {
            if (item.isPerishable()) {
                totalPerishableWeight += item.quantityInCart;
            } else {
                totalNonPerishableVolume += item.quantityInCart * ((NonPerishable)item).volumePerUnit;
            }
        }

        if (totalPerishableWeight > 0) shippingCost += totalPerishableWeight * perKgPerishables;
        if (totalNonPerishableVolume > 0) shippingCost += totalNonPerishableVolume * perLiterNonPerishables;

        cart.shippingCost = shippingCost;
        return shippingCost;
    }

    Packer(){}
}