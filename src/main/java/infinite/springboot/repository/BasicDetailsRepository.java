package infinite.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import infinite.springboot.model.BasicDetails;

public interface BasicDetailsRepository extends JpaRepository<BasicDetails, Long> {
}
