package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${cupSize}")
	private String cupSize;
	
	@Value("${age}")
	private String age;
	
	@Value("${content}")
	private String content;
	
	@Autowired
	private GirlProperties girlProperties;
	
	//@RequestMapping(value = "/helloworld/{id}",method = RequestMethod.GET)
	//public String say(@PathVariable("id") String id){
		
//		return "Hello World" + content;
//		return girlProperties.getCupSize() + girlProperties.getAge();
		//return id;
	//}
	
	@RequestMapping(value = "/helloworld",method = RequestMethod.GET)
	public String say(@RequestParam(value="id" , required = false , defaultValue="0") String id){
		return id;
	}
	

}
