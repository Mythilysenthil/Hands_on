package Oops;
import java.util.List;
import java.util.ArrayList;

class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	Product(int productId, String productName, double price, int quantity){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getProductDetails() {
		return "Product ID: " + productId + ", Name: " + productName + ", Price: " + price + ", Quantity: " + quantity + ", Total: " + calculateTotal();
	}
	public void setQuantity(int newQty) {
		if(newQty > 0) {
			this.quantity = newQty;
		}else {
			System.out.println("Quantity is must greater than 0");
		}
	}
	public double calculateTotal() {
		return price*quantity;
	}
	public int getProductId() { 
		return productId; 
	}
}
class Cart{
	private List<Product> products = new ArrayList<>();
	public void addProduct(Product p) {
		products.add(p);
		System.out.println("Added: "+p.getProductDetails());
	}
	public void removeProduct(int productId) { 
		products.removeIf(p -> p.getProductId() == productId); 
		System.out.println("Removed product with ID: " + productId); 
	}
	public double calculateCartTotal() {
		double total = 0;
		for(Product p : products) {
			total += p.calculateTotal();
		}
		return total;
	}
	public void displayCartItems() {
		System.out.println("-------Cart Items------");
		for(Product p : products) {
			System.out.println(p.getProductDetails());
		}
		System.out.println("Cart Total: "+calculateCartTotal());
	}
}
public class ProductCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		
		Product p1 = new Product(101, "Laptop", 60000.0, 1);
		Product p2 = new Product(102, "Headphones", 2000.0, 2); 
		Product p3 = new Product(103, "Mouse", 800.0, 1);
		
		cart.addProduct(p1);
		cart.addProduct(p2);
		cart.addProduct(p3);
        
		cart.displayCartItems();
		p2.setQuantity(3);
		cart.removeProduct(103);
		cart.displayCartItems();
	}

}
