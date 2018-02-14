package Encapsulation;

public class Phone {
	
	private int price;
	private String color;
	private double screensize;
	
	public int getPrice(){
		return this.price;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public double getScreeenSize(){
		return this.screensize;
	}
	
	public void setPrice(int p){
		this.price = p;
	}
	
	public void setColor(String c){
		this.color = c;
	}
	
	public void setScreeenSize(double ss){
		this.screensize = ss;
	}
	
	public void specification(){
		System.out.println("Phone Price :"+ this.price);
		System.out.println("Phone Color :"+ this.color);
		System.out.println("Phone Screen Size :"+ this.screensize);
	}

}
