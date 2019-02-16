package polymorphism;

public class BeanFactory {
	public Object getBean(String beanName) {
		if(beanName.contentEquals("samsung")) {
			return new SamsungTV();
		}else if (beanName.contentEquals("lg")) {
			return new LGTV();
		}
		return null;
	}
}
