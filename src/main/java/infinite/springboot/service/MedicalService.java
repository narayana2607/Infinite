package infinite.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infinite.springboot.model.Medical;
import infinite.springboot.repository.MedicalRepository;

@Service
public class MedicalService {

    @Autowired
    private MedicalRepository medicalRepository;

    public Medical saveMedical(Medical medical) {
        return medicalRepository.save(medical);
    }

    public Medical getMedicalById(Long id) {
        return medicalRepository.findById(id).orElse(null);
    }

    public void deleteMedicalById(Long id) {
        medicalRepository.deleteById(id);
    }
}
