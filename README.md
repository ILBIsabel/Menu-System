# Menu-System

This Java program simulates a restaurant's order process using a stack data structure. The program reads an input file containing a series of orders, simulates the passage of time minute by minute, and outputs the order completion times in the correct sequence. The orders are processed by type (either "ToGo" or "DineIn"), and the program handles order preparation times accordingly. The simulation highlights the issues with using a stack for order processing, where orders are handled based on their arrival time but completed in reverse order.

# Features
Simulates a stack of orders.

Reads and processes order data from an input file.

Tracks the time of each order’s completion.

Outputs the order details and completion times in the correct sequence to an output file.

# Files Included
Order.java - Defines the general structure of an order.

DineIn.java - Inherits from Order and defines behaviors specific to dine-in orders.

ToGo.java - Inherits from Order and defines behaviors specific to to-go orders.

OrderRunner.java - The main driver program that handles file input/output and simulates the order processing.

sample.txt - A sample input file containing order data.

The program will prompt you to enter the name of the input file (ex., sample.txt). After processing, it will create an output file named output.txt with the order completion details. Be sure to refresh to see the output.txt.

# Input File Format
The input file should follow this structure:

The first line contains the number of orders.

Each subsequent line contains the following information for each order:

Time the order was placed (in minutes since the restaurant opened).

Customer’s name.

Order type: either togo or dinein.

Time in minutes it takes to prepare the order.

# Output File Format
The output file (output.txt) will contain the following information:

The order number (in the sequence they were processed).

The type of order (either Dine In or To Go).

The customer's name.

The time (in minutes) when the order is completed.

# How It Works
Order Input: The program reads the order details from the input file.

Processing Orders: Orders are added to a stack as they arrive. Each minute, the program checks if a new order has arrived, and if the cook is free, they start working on the order at the top of the stack.

Order Completion: The program tracks the time it takes to prepare each order, considering the order type (DineIn or ToGo). ToGo orders add an extra 5 minutes to the preparation time.

Output: Once all orders are processed, the program outputs the order completion times in the correct sequence to the output.txt file.
