package Constructor;

public class Phone {
	
	int price;
	String color;
	
	public Phone(){
		this.price = 10000;
		this.color = "Black";
	}
	
	public Phone(String c){
		this.color = c;
		this.price = 15000;
	}
	
	public Phone(int p){
		this.color = "Blue";
		this.price = p;
	}
	
	public Phone(int p,String c){
		this.color = c;
		this.price = p;
	}

}
