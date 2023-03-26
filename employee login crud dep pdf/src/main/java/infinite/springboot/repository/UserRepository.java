package infinite.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import infinite.springboot.model.Role;
import infinite.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
 interface RoleRepository extends CrudRepository<Role, Integer> {
    
}