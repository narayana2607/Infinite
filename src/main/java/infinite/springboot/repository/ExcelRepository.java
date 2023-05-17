package infinite.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import infinite.springboot.model.Employees;



@Repository
public interface ExcelRepository extends JpaRepository<Employees, Long> {
	List<Employees> findAll();

}
