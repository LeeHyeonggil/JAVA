package sec02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		
		Date now = new Date();
		String snow = now.toString();
		System.out.println(snow);

		SimpleDateFormat ssnow = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String snow2 = ssnow.format(now);
		System.out.println(snow2);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1;
		int day = cal.get(Calendar.DAY_OF_MONTH);  //��
		int week = cal.get(Calendar.DAY_OF_WEEK);  //����
		
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY: strWeek = "��";break;
		case Calendar.TUESDAY: strWeek = "ȭ";break;
		case Calendar.WEDNESDAY: strWeek = "��";break;
		case Calendar.THURSDAY: strWeek = "��";break;
		case Calendar.FRIDAY: strWeek = "��";break;
		case Calendar.SATURDAY: strWeek = "��";break;
		case Calendar.SUNDAY: strWeek = "��";break;
		}
		
		
		System.out.println(year + "-" + month + "-" + day + "-" + "(" + strWeek + ")");
		
	}

}
