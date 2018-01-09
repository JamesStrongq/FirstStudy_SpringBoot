package demo;

import java.nio.charset.Charset;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Configuration
@SpringBootApplication
public class HelloWorldDemo {
//	@RequestMapping("hello")
//	@ResponseBody
//	public String hello(){
//		return "hello world";
//	}
	
	//自定义消息转换器
	//springboot 默认的消息转换器为utf-8
	@Bean
	public StringHttpMessageConverter stringHttpMessageConverter(){
		StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
		return converter;
		
	}
	
	public static void main(String[] args){
//		SpringApplication.run(HelloWorldDemo.class, args);
		SpringApplication spring = new SpringApplication(HelloWorldDemo.class);
		//关闭banner
		//spring.setBannerMode(Banner.Mode.OFF);
		spring.run(args);
	}

}
