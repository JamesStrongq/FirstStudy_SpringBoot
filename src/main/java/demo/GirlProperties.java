package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
	
	private String CupSize;
	private String age;
	public String getCupSize() {
		return CupSize;
	}
	public void setCupSize(String cupSize) {
		CupSize = cupSize;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
