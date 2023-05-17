package infinite.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import infinite.springboot.model.Village;

public interface VillageRepository extends JpaRepository<Village, Long> {

	List<Village> findByMandalId(Long villageId);

}
