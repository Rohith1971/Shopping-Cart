
public class ItemToPurchase {
     String productName;
     int productPrice;
     int productQuantity;
     //Private fields - itemName, itemPrice, and itemQuanity
     /*Default Constructor*
     itemName - Initialized to "none"
     itemPrice - Initialized to 0
     itemQuantity - Initialized into 0
     */
     public ItemToPurchase() {
     productName = "none";
     productPrice = 0;
     productQuantity = 0;

}
     //public member methods 
     //setName() & getName()
     //setPrice() & getPrice()
     //setQuantity() & getQuantity()
     //print item to purchase
     public String getName() {
         return productName;
}
     public void setName(String itemName) {
         this.productName = itemName;
}
     public int getPrice() {
         return productPrice;
}
     public void setPrice(int price) {
         if (price < 0) {
              productPrice = 0;
         }
         else {
              productPrice = price;
} }
     public int getQuantity() {
         return productQuantity;
}
     public void setQuantity(int quantity) {
         if (quantity < 0) {
              productQuantity = 0;
         }

else {
              productQuantity = quantity;
} }
     public void printItemPurchase() {
     System.out.println(productQuantity + " " + productName +
     " $" + productPrice +
" = $" + (productPrice * productQuantity)); }
}