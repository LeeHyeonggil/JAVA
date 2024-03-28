package sec11;

public class Earth {

	//상수 선언과 동시에 초기화
	static final double EARTH_RADIUS = 6400;
	
	//상수 선언
	static final double EARTH_SURFACE_AREA;
	
	//정적블럭을 이용하여 초기화
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}

/*패키지

도메인 역순
io.github.leehyeonggil

ctrl+shift+O import*/