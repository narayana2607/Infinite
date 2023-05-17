package infinite.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infinite.springboot.model.Village;
import infinite.springboot.repository.VillageRepository;

@Service
public class VillageService {

    @Autowired
    private VillageRepository villageRepository;

    public List<Village> getVillagesByMandalId(Long mandalId) {
        return villageRepository.findByMandalId(mandalId);
    }


}
