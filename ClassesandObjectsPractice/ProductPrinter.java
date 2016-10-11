
public class ProductPrinter {

	public static void main(String[] args) {
	Product product1=new Product("toilet", 29.95);
	System.out.println(product1.getName());
	System.out.println(product1.getPrice());
	product1.reducePrice();
	System.out.println(product1.getPrice());
	}

}
