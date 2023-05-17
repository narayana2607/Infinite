package infinite.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infinite.springboot.model.BasicDetails;
import infinite.springboot.repository.BasicDetailsRepository;

@Service
public class BasicDetailsService {

    @Autowired
    private BasicDetailsRepository basicDetailsRepository;

    public BasicDetails saveBasicDetails(BasicDetails basicDetails) {
        return basicDetailsRepository.save(basicDetails);
    }

    public BasicDetails getBasicDetailsById(Long id) {
        return basicDetailsRepository.findById(id).orElse(null);
    }

    public void deleteBasicDetailsById(Long id) {
        basicDetailsRepository.deleteById(id);
    }
}

