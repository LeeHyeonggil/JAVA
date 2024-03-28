package sec03;

public class RemoteControlExam {

	public static void main(String[] args) {
		System.out.println("최대볼륨은 : " + RemoteControl.MAX_VOLUME + "입니다.");
		System.out.println("최소볼륨은 : " + RemoteControl.MIN_VOLUME + "입니다.");
		RemoteControl cc;
		cc = new Television();
		cc.turnOn();
		cc.setVolume(5);
		cc.setMute(true);
		cc.setMute(false);
		cc.turnOff();
		
//		cc = new Audio();
//		cc.turnOn();
//		cc.setVolume(5);
//		cc.setMute(true);
//		cc.setMute(false);
//		cc.turnOff();
		
		System.out.println();
		
		RemoteControl.changeBattery();
	}

}
