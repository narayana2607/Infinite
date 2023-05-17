package infinite.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import infinite.springboot.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
