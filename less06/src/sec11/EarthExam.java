package sec11;

public class EarthExam {

	public static void main(String[] args) {
		
		System.out.println("지구의 반지름 :" + Earth.EARTH_RADIUS+"km");
		System.out.println("지구의 표면적 :" + Earth.EARTH_SURFACE_AREA+"km^2");

		
/*final 필드에 초기값을 주는 방법

1. 필드 선언할 때 초기값 대입
2. 생성자에 초기값을 대입

final String name;

생성자(name){
    this.mame = name;
}

final String name = "김철수";

상수 선언 불변의 값을 저장하는 필드

static final 타입 상수;
static {
    상수 = 초기값;
}

static final (상수를 쓸때는 일반적으로 대문자로 쓴다)
클래스명 . 상수

상수로 double 타입으로 earth_radius 를 선언하고 6400을 대입

상수 더블타입으로 earth_surface_area를 선언하고 지구의
원주율을 대입한다.

실행클래스에서 지구의 반지름 00km 지구의 표면적 00km^2 를 출력한다. */
	}

}
