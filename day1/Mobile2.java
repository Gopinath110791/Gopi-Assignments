package week1.day1;

public class Mobile2 {

	public void makecall() {

		String mobileModel = "Vivo";
		float mobileWeight = 15.27f;

		System.out.println("Make a call");

	}

	private void sendMsg() {
		
		boolean fullyCharged=true;
		int mobileCost=12000;
System.out.println("Send a Msg");
	}

	public static void main(String[] args) {
Mobile2 info= new Mobile2();
info.makecall();
info.sendMsg();
System.out.println("This is my mobile");
	}

}
