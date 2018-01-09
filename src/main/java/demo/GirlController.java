package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {
	
	@Autowired
	private GirlRepository girlRepository;

	@GetMapping(value="/girls")
	public List<Girl> getAll(){
		return girlRepository.findAll();
		
	}
	
	@GetMapping(value="/girlsAdd")
	public String add(@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age){
		Girl girl = new Girl();
		girl.setCupSize(cupSize);
		girl.setAge(age);
		girlRepository.save(girl);
		return "添加成功";
	}
	
	@GetMapping(value="/girlsSelect/{id}")
	public Girl select(@PathVariable(value="id") Integer id){
		return girlRepository.findOne(id);
	}
	
	@GetMapping(value="/girlsUpdate/{id}")
	public Girl update(@PathVariable(value="id") Integer id,
						@RequestParam("cupSize") String cupSize,
						@RequestParam("age") Integer age){
		Girl girl = new Girl();
		girl.setId(id);
		girl.setAge(age);
		girl.setCupSize(cupSize);
		
		return girlRepository.save(girl);
	}
	
	@GetMapping(value="/girlsDelete")
	public String delete(@RequestParam("id") Integer id){
		 girlRepository.delete(id);
		 return "删除成功";
	}
	
	//通过年龄查询女生列表
	@GetMapping(value="/girlsFindByAge")
	public List<Girl> findByAge(@RequestParam("age") Integer age){
		return girlRepository.findByAge(age);
	}
}
