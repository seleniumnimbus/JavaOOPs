package Interface;

public class MainClass {

	public static void main(String[] args) {
		
		iPhone4 iph4 = new iPhone4();
		iph4.color = "Black";
		iph4.price = 10000;
		iph4.call();
		System.out.println("IPhone 4 : price : "+ iph4.price + ", color :"+ iph4.color);
		System.out.println("############################");
		
		iPhone5 iph5 = new iPhone5();
		iph5.color = "Blue";
		iph5.price = 15000;
		iph5.call();
		iph5.message();
		System.out.println("IPhone 5 : price : "+ iph5.price + ", color :"+ iph5.color);
		System.out.println("############################");
		
		iPhone6 iph6 = new iPhone6();
		iph6.color = "White";
		iph6.price = 20000;
		iph6.call();
		iph6.message();
		iph6.music();
		iph6.radioChannel();
		System.out.println("IPhone 6 : price : "+ iph6.price + ", color :"+ iph6.color);
		System.out.println("############################");

	}

}
