package sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//������ : METHOD, ������å:RUNTIME
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)


public @interface PrintAno {

	String value() default "-"; //���� ����
	int number() default 15;   //��� ȸ���
}
