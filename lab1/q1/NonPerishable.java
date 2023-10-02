class NonPerishable extends Item {
    float volumePerUnit;

    NonPerishable(String productName, float pricePerUnit, float volumePerUnit) {
        super(productName, pricePerUnit);
        this.volumePerUnit = volumePerUnit;
    }
}