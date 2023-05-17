package infinite.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import infinite.springboot.model.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}

