package demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

//事务处理
//同时添加两个
public class GirlService {
	
	@Autowired
	private GirlRepository girlRepository;
	
	@Transactional
	public void insertTwo(){
		
		Girl girlA = new Girl();
		girlA.setAge(19);
		girlA.setCupSize("C");
		girlRepository.save(girlA);
		
		Girl girlB = new Girl();
		girlB.setAge(12);
		girlB.setCupSize("D");
		girlRepository.save(girlB);
		
	}
}
