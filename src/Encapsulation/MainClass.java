package Encapsulation;

public class MainClass {

	public static void main(String[] args) {
		
		Phone ph = new Phone();
		ph.setPrice(20000);
		ph.setColor("Black");
		ph.setScreeenSize(5.5);
		
		System.out.println("Phone Price :"+ ph.getPrice());
		System.out.println("Phone Color :"+ ph.getColor());
		System.out.println("Phone Screen Size :"+ ph.getScreeenSize());
		System.out.println("#############################");
		ph.specification();

	}

}
