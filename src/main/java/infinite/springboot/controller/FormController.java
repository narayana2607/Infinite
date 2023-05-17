package infinite.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import infinite.springboot.model.Appform;

@Controller
public class FormController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	
	@GetMapping("/register")
	public String showForm(Model model) {
		Appform appform = new Appform();
		
		//list.set();
		model.addAttribute("appform", appform);
		return "register_form";
	}
	
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("appform") Appform appform) {
		return "register_success";
	}

	public Logger getLog() {
		return log;
	}
	

}
