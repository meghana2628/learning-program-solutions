
// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter document type (word/pdf/excel): ");
        String docType = scanner.nextLine().toLowerCase();

        DocumentFactory factory;

        switch (docType) {
            case "word":
                factory = new WordDocumentFactory();
                break;
            case "pdf":
                factory = new PdfDocumentFactory();
                break;
            case "excel":
                factory = new ExcelDocumentFactory();
                break;
            default:
                System.out.println("❌ Invalid document type.");
                scanner.close();
                return;
        }

        Document document = factory.createDocument();
        document.open();

        scanner.close();
    }
}
