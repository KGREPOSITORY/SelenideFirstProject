package enums;

public enum ProductOrder {
    BY_POPULARITY(1),
    BY_CHEAPER(2);

    private final int order;

    ProductOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }
}
