package infinite.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infinite.springboot.model.District;
import infinite.springboot.repository.DistrictRepository;

@Service
public class DistrictService {

    @Autowired
    private DistrictRepository districtRepository;

    public List<District> getDistrictsByStateId(Long stateId) {
        return districtRepository.findByStateId(stateId);
    }

}
