package infinite.springboot.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import infinite.springboot.model.User;
import infinite.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

	List<User> listAll();
	
}
