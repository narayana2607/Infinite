package infinite.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import infinite.springboot.model.Mandal;

public interface MandalRepository extends JpaRepository<Mandal, Long> {

	List<Mandal> findByDistrictId(Long mandalId);

}
