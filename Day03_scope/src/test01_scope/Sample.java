package test01_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sss")
@Scope("prototype")
public class Sample {
	//��ü ������ ���� Sample Ŭ����
	//������ ���׾Ƴ� applicationContext.xml�� �� Ŭ������ ��ü�� ����� ����.
	//scope�� ���� singleton, prototype���� �����ϰ�
	//�׽�Ʈ�غ���
	
}
