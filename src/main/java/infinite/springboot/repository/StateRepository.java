package infinite.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import infinite.springboot.model.State;

public interface StateRepository extends JpaRepository<State, Long> {
    List<State> findByCountryId(Long countryId);
}
