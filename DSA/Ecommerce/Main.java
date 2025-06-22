public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shoes", "Fashion"),
                new Product(3, "Smartphone", "Electronics"),
                new Product(4, "Blender", "Home"),
                new Product(5, "clothes", "Fashion")
        };

        // Sort products by name before binary search
        SearchUtils.sortProductsByName(products);

        // Perform binary search
        Product result = SearchUtils.binarySearch(products, "Blender");

        if (result != null) {
            System.out.println("Binary Search: " + result);
        } else {
            System.out.println("Binary Search: Product not found.");
        }
    }
}
