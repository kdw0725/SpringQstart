package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LGTV implements TV{
	@Autowired
	private Speaker speaker;
	
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��...");		
	}
	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ó��...");
	}
	public void powerOn(){
		System.out.println("LG TV ---���� �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("LG TV ---���� ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
