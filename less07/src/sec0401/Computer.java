package sec0401;

public class Computer extends Calculator{
	
	@Override
	public double areaCircle(double r){
		System.out.println("computer ��ü�� areaCircle() ����");
		
		return Math.PI * r * r; 
	}
}
