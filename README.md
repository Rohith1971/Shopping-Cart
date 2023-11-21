ShoppingCart Application Readme

Overview :

This Java program is a simple shopping cart application that allows users to input details for two items, including the item name, price, and quantity. The program then calculates and displays the total cost of the items in the shopping cart.

 Classes :

1. ItemToPurchase

Fields :
- `productName` (String): The name of the item.
- `productPrice` (int): The price per unit of the item.
- `productQuantity` (int): The quantity of the item.

Methods :
- `ItemToPurchase()`: Default constructor that initializes the fields to default values ("none" for the name, 0 for the price and quantity).
- `getName()`: Returns the name of the item.
- `setName(String itemName)`: Sets the name of the item.
- `getPrice()`: Returns the price per unit of the item.
- `setPrice(int price)`: Sets the price per unit of the item (ensures it is non-negative).
- `getQuantity()`: Returns the quantity of the item.
- `setQuantity(int quantity)`: Sets the quantity of the item (ensures it is non-negative).
- `printItemPurchase()`: Prints a formatted representation of the item purchase, including quantity, name, unit price, and total cost.

2. ShoppingCartPrinter :

This class contains the main method to interact with the user and demonstrate the functionality of the shopping cart.

Main Method :
- Collects user input for two items (name, price, and quantity).
- Creates instances of `ItemToPurchase` for each item.
- Calculates and displays the total cost of the items in the shopping cart.

Usage :

1. Run the `ShoppingCartPrinter` class.
2. Follow the prompts to input details for two items (name, price, and quantity).
3. The program will display a summary of each item and the total cost of the shopping cart.
![image](https://github.com/Rohith1971/Shopping-Cart/assets/148032748/cc06a9b0-5ed3-409d-8448-41ee27344584)
