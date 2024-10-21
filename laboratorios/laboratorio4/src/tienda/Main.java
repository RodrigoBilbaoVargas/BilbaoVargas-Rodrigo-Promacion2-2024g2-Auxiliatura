package tienda;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));
        store.addProduct(new Accessory("Mouse", 20.0));
        store.addProduct(new Accessory("Keyboard", 30.0));

        // Apply a 10% discount
        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        System.out.println("Applying 10% discount:");
        store.applyDiscount(tenPercentDiscount);

        // Apply a fixed discount of $50
        Discountable fiftyDollarsDiscount = product -> product.getPrice() - 50.0;
        System.out.println("\nApplying fixed $50 discount:");
        store.applyDiscount(fiftyDollarsDiscount);

        // Apply a variable percentage discount (15% for accessories, 5% for electronics)
        Discountable variableDiscount = product -> {
            if (product instanceof Electronic) {
                return product.getPrice() * 0.95; // 5% discount for electronics
            } else {
                return product.getPrice() * 0.85; // 15% discount for accessories
            }
        };
        System.out.println("\nApplying variable percentage discount:");
        store.applyDiscount(variableDiscount);
    }
}