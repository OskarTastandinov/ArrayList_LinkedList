
public class Driver <T extends Transport> {
    private final String name;
    private final String category;

    public Driver(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getFio() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
