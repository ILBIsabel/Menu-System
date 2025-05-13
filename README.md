# Menu-System

This project creates a restaurant menu system that reads menu items from a file, organizes them by type (Appetizer, Main Course, Dessert), and sorts them alphabetically by name. The program stores menu items as objects using a shared interface, allowing for easy management and sorting. It then outputs the sorted menu to a new file, demonstrating the use of Java interfaces, file input/output, and custom sorting with the Comparable interface.

# Features
Defines a MenuItem interface with required methods for name, price, type, and comparison.

Implements MenuItem in three distinct classes:

      Appetizer

      MainCourse

      Dessert

Reads menu data from a structured input file.

Stores items in an ArrayList<MenuItem>.

Sorts items using Collections.sort():

      First by type: Appetizer → MainCourse → Dessert

      Then alphabetically by item name

Displays a clean, formatted restaurant menu to the user.

# File Input Specifications
menu.txt

The menu file must follow this format:

First line: An integer representing the total number of items.

Subsequent lines: One menu item per line, in the format:

Type,Name,Price
