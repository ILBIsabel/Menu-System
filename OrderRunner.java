import java.io.*;
import java.util.*;

public class OrderRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the filename 
        System.out.print("Enter the filename of the input file: ");
        String filename = scanner.nextLine();
        
        scanner.close(); 

        // Create a stack of orders 
        Stack<Order> orderStack = new Stack<>();
        
        // Track the simulated time and the cooks availability
        int simulatedTime = 0;
        int cookIsFree = 0;

        try {
            Scanner fileScanner = new Scanner(new File(filename));
            
            fileScanner.nextInt();
            fileScanner.nextLine(); 

            // Order details
            int nextOrderTime = -1;
            String nextOrderName = null, nextTypeOfOrder = null;
            int nextOrderPrepTime = 0;
            boolean hasNextOrder = false;

            // Read the first order
            if (fileScanner.hasNextInt()) {
                nextOrderTime = fileScanner.nextInt();
                nextOrderName = fileScanner.next();
                nextTypeOfOrder = fileScanner.next();
                nextOrderPrepTime = fileScanner.nextInt();
                hasNextOrder = true;
            }

            // Creating/opening the output file
            PrintWriter out = new PrintWriter("output.txt");
            boolean firstOrderWritten = false;

            // Simulating each minute
            while (hasNextOrder || !orderStack.isEmpty()) {
            	// When the time comes, add the order(s) to the stack
                while (hasNextOrder && nextOrderTime == simulatedTime) {
                	// Create a DineIn or ToGo order
                    Order order;
                    
                    if (nextTypeOfOrder.equalsIgnoreCase("dinein")) {
                        order = new DineIn(nextOrderName, nextOrderPrepTime);
                    } else {
                        order = new ToGo(nextOrderName, nextOrderPrepTime);
                    }
                    
                    // Push the order to the stack
                    orderStack.push(order);

                    // Keep reading the next order, if any
                    if (fileScanner.hasNextInt()) {
                        nextOrderTime = fileScanner.nextInt();
                        nextOrderName = fileScanner.next();
                        nextTypeOfOrder = fileScanner.next();
                        nextOrderPrepTime = fileScanner.nextInt();
                    } else {
                        hasNextOrder = false;
                    }
                }
                
                // If the cook is free, go through the order on top of the stack
                if (simulatedTime >= cookIsFree && !orderStack.isEmpty()) {
                    Order currentOrder = orderStack.pop();  // Take/remove the order on top
                    cookIsFree = simulatedTime + currentOrder.getTime();  // Update the availability of the cook
                    
                    // Formatting the output as told
                    String output = currentOrder.getString() + " " + cookIsFree + " min";

                    // Used this to prevent an extra line at the end of the orders, maybe?
                    if (firstOrderWritten) {
                        out.println();
                    }
                    
                    out.print(output);
                    firstOrderWritten = true;
                }

                // Go on to the next simulated minute
                simulatedTime++;
            }

            // Officially close the file when everything is done
            fileScanner.close();
            out.close(); 

            System.out.println("All orders are processed. Output written to output.txt. Hit Refresh.");

        } catch (FileNotFoundException e) {
            System.out.println("We did not find the file. Re-run.");
        }
    }
}