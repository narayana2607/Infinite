package infinite.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import infinite.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
//	@Query("SELECT p FROM Product p WHERE p.name LIKE %?1%"
//			+ " OR p.brand LIKE %?1%"
//			+ " OR p.madein LIKE %?1%"
//			+ " OR CONCAT(p.Salary, '') LIKE %?1%")
	@Query("SELECT p FROM Employee p WHERE CONCAT(p.name, ' ', p.mobile, ' ', p.email, ' ',p.department,' ', p.salary) LIKE %?1%")
	public List<Employee> search(String keyword);

	
	@Query("FROM Employee p")
	List<Employee> getAllEmployeeData();
}
