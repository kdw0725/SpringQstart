package polymorphism;

public class SamsungTV implements TV{
	public SamsungTV() {
		System.out.println("===> SamsungTV 1 객체 생성");
	}
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리...");		
	}
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리...");
	}
	
	private Speaker speaker;    //Samsung TV 클래스가 Speaker메소드를 사용하기 위하여 만듬.
	private int price;				//가격정보
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV 3 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV 2 객체생성");
		this.speaker = speaker;
	}
	
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
	
	public void powerOn(){
		System.out.println("Samsung TV ---전원 켠다. (가격:"+price+")");
	}
	public void powerOff() {
		System.out.println("Samsung TV ---전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
}
