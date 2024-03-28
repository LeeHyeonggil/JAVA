package sec03;

public class GenExam2 {

	public static void main(String[] args) {
		
		HomeAgency homeAgency = new HomeAgency();
		OfficeAgency officeAgency = new OfficeAgency();
		
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		Office office = officeAgency.rent();
		office.work();
		

	}

}
