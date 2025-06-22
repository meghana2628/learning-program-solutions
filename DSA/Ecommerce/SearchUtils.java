import java.util.Arrays;
import java.util.Comparator;

public class SearchUtils {

    // Binary search requires sorted input
    public static Product binarySearch(Product[] products, String targetName) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(targetName);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    // Optional: Sort before binary search
    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    }
}
