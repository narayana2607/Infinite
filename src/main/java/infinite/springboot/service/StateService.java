package infinite.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infinite.springboot.model.State;
import infinite.springboot.repository.StateRepository;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State> getStatesByCountryId(Long countryId) {
        return stateRepository.findByCountryId(countryId);
    }

}
