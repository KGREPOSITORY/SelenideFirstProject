package enums;

public enum LaptopsComputersScreensItem {
    ALL_SCREENS("Все мониторы");

    private final String item;

    LaptopsComputersScreensItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}
