import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MySpringMVCConfig extends WebMvcConfigurerAdapter{
	
	//自定义拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry){
		HandlerInterceptor handlerInterceptor = new HandlerInterceptor(){
	
			@Override
			public boolean preHandle(HttpServletRequest request,HttpServletResponse response,
					Object handler) throws Exception{
				System.out.println("自定义拦截器...");
				return true;
			}
			
			@Override
			public void postHandle(HttpServletRequest request,HttpServletResponse response
					,Object handler,ModelAndView modelAndView) throws Exception{
				
			}
			@Override
			public void afterCompletion(HttpServletRequest request,HttpServletResponse response,
					Object handler,Exception ex) throws Exception{
				
			}
		
		};
		registry.addInterceptor(handlerInterceptor).addPathPatterns("/**");
	}
	
	

}
