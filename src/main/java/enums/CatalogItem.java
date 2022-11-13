package enums;

public enum CatalogItem {
    ELECTRONIC(1),
    COMPUTERS_AND_NETWORK(2);

    private final int item;

    CatalogItem(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }
}
