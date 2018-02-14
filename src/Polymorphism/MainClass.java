package Polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		Phone ph = new Phone();
		ph.init(10000);
		System.out.println("############################");
		
		iPhone iph = new iPhone();
		iph.init(20000);
		iph.call();
		System.out.println("############################");
		
		Phone ph2 = new iPhone();
		ph2.init(20000);
		System.out.println("############################");

	}

}
