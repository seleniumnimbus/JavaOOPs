package Polymorphism;

public class Phone {
	
	int price;
	String color;
	
	public void init(){
		this.price = 10000;
		this.color = "Black";
		System.out.println("Price :"+ this.price +",Color :"+ this.color);
	}
	
	public void init(int p){
		this.price = p;
		this.color = "Black";
		System.out.println("Price :"+ this.price +",Color :"+ this.color);
	}
	
	public void init(String c){
		this.price = 20000;
		this.color = c;
		System.out.println("Price :"+ this.price +",Color :"+ this.color);
	}
	

}
