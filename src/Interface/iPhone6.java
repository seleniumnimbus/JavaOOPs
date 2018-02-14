package Interface;

public class iPhone6 extends iPhone5 implements Radio{
	
	public void music(){
		System.out.println("This is music method of iPhone6 class");
	}

	@Override
	public void radioChannel() {
		System.out.println("This is a method for Radio Channel Selection");
	}

}
