package infinite.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import infinite.springboot.model.BasicDetails;
import infinite.springboot.model.Employee;
import infinite.springboot.model.Experience;
import infinite.springboot.model.Medical;
import infinite.springboot.model.Person;
import infinite.springboot.repository.BasicDetailsRepository;
import infinite.springboot.repository.ExperienceRepository;
import infinite.springboot.repository.MedicalRepository;
import infinite.springboot.repository.PersonRepository;

@Controller 
public class PersonController {

    @Autowired
    private PersonRepository personRepository;
    
    @GetMapping("/person")
	public String person() {
		return "person";
	}
    
    @GetMapping("/persons")
    public String listPersons(Model model) {
        List<Person> persons = personRepository.findAll();
        model.addAttribute("persons", persons);
        return "persons";
    }

    @Autowired
    private BasicDetailsRepository basicDetailsRepository;

    @PostMapping("/saveBasicDetails")
    public String saveBasicDetails(@ModelAttribute("basicDetails") BasicDetails basicDetails) {
        basicDetailsRepository.save(basicDetails);
        return "redirect:/person_basic";
    }
    
    
    
    @Autowired
    private ExperienceRepository experienceRepository;

    @PostMapping("/saveExperience")
    public String saveExperience(@ModelAttribute("experience") Experience experience) {
        experienceRepository.save(experience);
        return "redirect:/persons";
    }
    
    
    @Autowired
    private MedicalRepository medicalRepository;

    @PostMapping("/saveMedical")
    public String saveMedical(@ModelAttribute("medical") Medical medical) {
        medicalRepository.save(medical);
        return "redirect:/persons";
    }
    
   
    
}

