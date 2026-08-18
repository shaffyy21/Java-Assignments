package library.main;

import library.model.Book;
import library.model.DigitalResource;
import library.model.LibraryResource;
import library.service.Printable;
import library.util.InputValidator;

public class Librarymain{

    public static void main(String[] args){

        if (!InputValidator.validateResourceId(1) ||
            !InputValidator.validateResourceId(2) ||
            !InputValidator.validateResourceId(3) ||
            !InputValidator.validateResourceId(4) ||
            !InputValidator.validateResourceId(5)) {

            System.out.println("Invalid Resource ID");
            return;
        }
        LibraryResource r1 =
                new Book(1, "Data Structures", "Mark Allen", "Computer Science");

        LibraryResource r2 =
                new Book(2, "Operating Systems", "William Stallings", "Computer Science");

        LibraryResource r3 =
                new Book(3, "Database Systems", "Raghu Ramakrishnan", "Database");

        LibraryResource r4 =
                new DigitalResource(4, "Machine Learning", "Tom Mitchell", "PDF");

        LibraryResource r5 =
                new DigitalResource(5, "Artificial Intelligence", "Stuart Russell", "E-Book");

        // Store objects in an array
        LibraryResource[] resources = {
                r1, r2, r3, r4, r5
        };

        System.out.println("======================================");
        System.out.println("       SMART LIBRARY RESOURCES");
        System.out.println("======================================");

        for (LibraryResource resource : resources) {

            if(resource instanceof Printable) {
                Printable printable = (Printable) resource;
                printable.printDetails();
            }

            System.out.println();
        }

        // Overdue days for each resource
        int[] overdueDays = {5, 2, 0, 10, 4};

        double totalFine = 0;

        System.out.println("======================================");
        System.out.println("           FINE CALCULATION");
        System.out.println("======================================");

        for (int i = 0; i < resources.length; i++) {

            if (!InputValidator.validateFineDays(overdueDays[i])) {
                System.out.println("Invalid overdue days for Resource "
                        + resources[i].getResourceId());
                continue;
            }

            double fine = resources[i].calculateFine(overdueDays[i]);

            System.out.println(
                    "Resource ID: " + resources[i].getResourceId()
                    + " | Overdue Days: " + overdueDays[i]
                    + " | Fine: Rs. " + fine
            );

            totalFine += fine;
        }

        System.out.println("--------------------------------------");
        System.out.println("Total Fine: Rs. " + totalFine);

        // Display static object counter
        System.out.println();
        LibraryResource.displayTotalResources();
    }
}
    