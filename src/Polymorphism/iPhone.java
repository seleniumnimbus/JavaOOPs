package Polymorphism;

public class iPhone extends Phone{
	
	public void init(int p){
		this.price = p+1000;
		this.color = "Black";
		System.out.println("Price :"+ this.price +",Color :"+ this.color);
	}
	
	public void call(){
		System.out.println("This is a call method under iPhone class");
	}

}
