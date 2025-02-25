public enum EnumLanguage {
    REGULAR(1, "Regular", 0.05);
    PREMIUM(2, "Premium", 0.1);
    VIP(3, "Vip", 0.2);

    public EnumLanguage(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    long id;
    String name;
    double price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}