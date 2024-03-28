package sec02;

import java.io.IOException;

public class Inexam {

	public static void main(String[] args) {
		
    int speed = 0;
    int keyCode = 0;
    
    while(true) {
    	//enter키를 읽지 않았을 경우 실행
    	if(keyCode ==49) {
    		System.out.println("일");
    		speed++;
    	}else if(keyCode == 50) {
    		System.out.println("이");
    		speed++;
    	}else if(keyCode == 51) {
    		System.out.println("삼");
    		break;
    	}
    	System.out.println("----------------");
    	System.out.println("1증속 | 2. 감속 | 3.중지");
    	System.out.println("----------------");
    	System.out.println("현재 속도 =" +speed);
    	System.out.println("선택 : ");
    	
    }
    try {
    	keyCode = System.in.read();
    }catch (IOException e) {
    	 e.printStackTrace();
    }
   
    System.out.println("프로그램 종료");
    //System.exit(0);
	}
    
}
