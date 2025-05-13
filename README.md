# Menu-System

This project builds a dynamic restaurant menu system using Java. It reads menu items from a file, stores them as objects implementing a shared interface, sorts them by type and name, and outputs the formatted menu. The system demonstrates key object-oriented programming concepts, file I/O, and the use of Java's Comparable interface for custom sorting.

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
