package sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//적용대상 : METHOD, 유지정책:RUNTIME
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)


public @interface PrintAno {

	String value() default "-"; //선의 종류
	int number() default 15;   //출력 회쇼수
}
