package infinite.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import infinite.springboot.model.Medical;

public interface MedicalRepository extends JpaRepository<Medical, Long> {
}

