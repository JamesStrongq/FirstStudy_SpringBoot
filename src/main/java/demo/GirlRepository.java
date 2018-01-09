package demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl,Integer>{
	//通过年龄来查询
	//方法名必须按照这种格式来写
	public List<Girl> findByAge(Integer age);
}
