package sec02;

import java.io.IOException;

public class Inexam {

	public static void main(String[] args) {
		
    int speed = 0;
    int keyCode = 0;
    
    while(true) {
    	//enterŰ�� ���� �ʾ��� ��� ����
    	if(keyCode ==49) {
    		System.out.println("��");
    		speed++;
    	}else if(keyCode == 50) {
    		System.out.println("��");
    		speed++;
    	}else if(keyCode == 51) {
    		System.out.println("��");
    		break;
    	}
    	System.out.println("----------------");
    	System.out.println("1���� | 2. ���� | 3.����");
    	System.out.println("----------------");
    	System.out.println("���� �ӵ� =" +speed);
    	System.out.println("���� : ");
    	
    }
    try {
    	keyCode = System.in.read();
    }catch (IOException e) {
    	 e.printStackTrace();
    }
   
    System.out.println("���α׷� ����");
    //System.exit(0);
	}
    
}
