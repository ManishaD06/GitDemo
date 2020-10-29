package CoreJavaPractice;

public class UseofInterface implements InterfaceOne{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Created object 
		
		//InterfaceOne obj = new UseofInterface();
		UseofInterface obj = new UseofInterface();
		obj.GreenGo();
		obj.FlashYellowWait();
		obj.RedStop();
		obj.localRule();
		System.out.println(myNum);
		
		
		//local Class object
		//UseofInterface ui = new UseofInterface();
		//ui.localRule();		
		
		
	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("You can Go");
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("You can STOP");
	}

	@Override
	public void FlashYellowWait() {
		// TODO Auto-generated method stub
		System.out.println("You can Wait");
	}

	
	public void localRule() {
		
		System.out.println("Stop at ZebraCrossing");
	}
}
