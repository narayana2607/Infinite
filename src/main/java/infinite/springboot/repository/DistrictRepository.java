package infinite.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import infinite.springboot.model.District;

public interface DistrictRepository extends JpaRepository<District, Long> {

	List<District> findByStateId(Long stateId);

}
