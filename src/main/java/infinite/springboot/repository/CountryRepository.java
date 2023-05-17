package infinite.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import infinite.springboot.model.Country;


@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
	
}
