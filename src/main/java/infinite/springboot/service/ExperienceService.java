package infinite.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infinite.springboot.model.Experience;
import infinite.springboot.repository.ExperienceRepository;

@Service
public class ExperienceService {

    @Autowired
    private ExperienceRepository experienceRepository;

    public Experience saveExperience(Experience experience) {
        return experienceRepository.save(experience);
    }

    public Experience getExperienceById(Long id) {
        return experienceRepository.findById(id).orElse(null);
    }

    public void deleteExperienceById(Long id) {
        experienceRepository.deleteById(id);
    }
}

