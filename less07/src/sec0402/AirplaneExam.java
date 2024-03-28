package sec0402;

public class AirplaneExam {

	public static void main(String[] args) {
		
		
		KF21Airplane kf = new KF21Airplane();
		kf.takeOff();
		kf.fly();
		kf.flyMode = KF21Airplane.SUPERSONIC;
		kf.fly();
		kf.flyMode = KF21Airplane.NORMAL;
		kf.fly();
		kf.land();
		
	}

}
