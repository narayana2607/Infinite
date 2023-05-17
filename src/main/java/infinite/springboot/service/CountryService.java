package infinite.springboot.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infinite.springboot.model.Country;
import infinite.springboot.repository.CountryRepository;

@Service
public class CountryService {
	@Autowired
	private CountryRepository countryRepository;

	public List<Country> getAllCountries() {
	    return countryRepository.findAll();
	}

	public Country getCountryById(Long id) {
	    Optional<Country> optionalCountry = countryRepository.findById(id);
	    return optionalCountry.isPresent() ? optionalCountry.get() : null;
	}

	public Country addCountry(Country country) {
	    return countryRepository.save(country);
	}

	public Country updateCountry(Long id, Country country) {
	    Optional<Country> optionalCountry = countryRepository.findById(id);
	    if (optionalCountry.isPresent()) {
	        country.setId(id);
	        return countryRepository.save(country);
	    } else {
	        return null;
	    }
	}

	public boolean deleteCountry(Long id) {
	    Optional<Country> optionalCountry = countryRepository.findById(id);
	    if (optionalCountry.isPresent()) {
	        countryRepository.deleteById(id);
	        return true;
	    } else {
	        return false;
	    }
	}

}