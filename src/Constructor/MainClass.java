package Constructor;

public class MainClass {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		Phone p2 = new Phone("White");
		Phone p3 = new Phone(20000);
		Phone p4 = new Phone(25000,"Pink");
		
		System.out.println("P1: Phone Price : "+ p1.price + " and Phone color :"+ p1.color);
		System.out.println("P2: Phone Price : "+ p2.price + " and Phone color :"+ p2.color);
		System.out.println("P3: Phone Price : "+ p3.price + " and Phone color :"+ p3.color);
		System.out.println("P4: Phone Price : "+ p4.price + " and Phone color :"+ p4.color);

	}

}
