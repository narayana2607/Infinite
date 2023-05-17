package infinite.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import infinite.springboot.model.Appform;

@Repository
	public interface FormRep extends JpaRepository<Appform, Integer>{

}
