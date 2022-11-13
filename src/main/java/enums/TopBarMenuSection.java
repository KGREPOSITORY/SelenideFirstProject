package enums;

public enum TopBarMenuSection {
    CATALOG("Каталог"),
    NEWS("Новости");

    private final String section;

    TopBarMenuSection(String section) {
        this.section = section;
    }

    public String getSection() {
        return section;
    }
}
