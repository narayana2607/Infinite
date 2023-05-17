package infinite.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infinite.springboot.model.Mandal;
import infinite.springboot.repository.MandalRepository;

@Service
public class MandalService {

    @Autowired
    private MandalRepository mandalRepository;

    public List<Mandal> getMandalsByDistrictId(Long districtId) {
        return mandalRepository.findByDistrictId(districtId);
    }


}
