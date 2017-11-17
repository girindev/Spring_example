package test01_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sss")
@Scope("prototype")
public class Sample {
	//객체 생성을 위한 Sample 클래스
	//스프링 컨테아너 applicationContext.xml에 이 클래스로 객체를 등록할 예정.
	//scope를 각각 singleton, prototype으로 설정하고
	//테스트해보기
	
}
