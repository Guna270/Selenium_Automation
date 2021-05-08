package week1.day1;

public class Mobile {
	String mobileModel ="Redmi Note 7 pro";
	int mobileWeight = 50;
	boolean isFullCharge = true;
	double mobileCost = 17000.50;
	public void makeCall() {
		System.out.println("If you are free, please call me");
	}
	public void sendMeg() {
		System.out.println("Send message to Guna");
	}

	public static void main(String[] args) {
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMeg();
		
	 System.out.println(myMobile.mobileModel);
	 System.out.println(myMobile.mobileWeight);
	 System.out.println(myMobile.isFullCharge);
	 System.out.println(myMobile.mobileCost);

	}

}
