package ClassObject;

public class Home {
	
	int price;
	String color;
	
	public void ds(){
		System.out.println("This is your ds");
	}
	
	public static void main(String[] args) {
		
		Home home1 = new Home();
		Home home2 = new Home();
		
		home1.price = 10000;
		home1.color ="White";
		
		home2.price = 20000;
		home2.color ="Blue";
		
		System.out.println("Home1 price :"+ home1.price + ",Home1 color :"+ home1.color);
		System.out.println("Home2 price :"+ home2.price + ",Home1 color :"+ home2.color);
		

	}

}
