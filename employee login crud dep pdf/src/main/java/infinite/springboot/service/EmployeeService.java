package infinite.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infinite.springboot.model.Employee;
import infinite.springboot.model.User;
import infinite.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> listAll(String keyword) {
		if (keyword != null) {
			return repo.search(keyword);
		}
		return repo.findAll();
	}
	
	public void save(Employee product) {
		repo.save(product);
	}
	
	public Employee get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}

	public List<Employee> getemployee() {
		return null;
	}

	public List<User> listAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
