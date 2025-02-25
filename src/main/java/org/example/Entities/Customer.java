import java.util.ArrayList;
import java.util.List;

class Customer {
    String name;
    String type; // "Regular", "Premium", "VIP"
    double discount;

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
        setDiscount();
    }

    private void setDiscount() {
        if (type.equals(CustomerEnum.REGULAR)) {
            discount = CustomerEnum.REGULAR.getPrice();
        } else if (type.equals(CustomerEnum.PREMIUM)) {
            discount = CustomerEnum.PREMIUM.getPrice();
        } else if (type.equals(CustomerEnum.VIP)) {
            discount = CustomerEnum.PREMIUM.getPrice();
        }
    }
}