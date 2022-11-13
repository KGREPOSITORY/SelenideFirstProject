package enums;

public enum ComputerAndNetworkItem {
    LAPTOPS_COMPUTERS_DISPLAYS("Ноутбуки, компьютеры, мониторы");

    private final String item;

    ComputerAndNetworkItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}
