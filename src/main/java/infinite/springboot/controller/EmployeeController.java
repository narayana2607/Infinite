package infinite.springboot.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import infinite.sprinboot.util.PDFGeneratorUtility;
import infinite.springboot.model.Employee;
import infinite.springboot.repository.EmployeeRepository;
import infinite.springboot.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeeRepository employeeRepository;

	public Logger getLog() {
		return log;
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/")
	public String homepage() {
		return "home";
	}

	@GetMapping("/dept_page")
	public String dept_page(Model model) {
		return "dept_page";

	}

	@GetMapping("/search")
	public String search() {
		return "search";
	}

	@GetMapping("/imageindex")
	public String addProductPage() {
		return "imageindex";
	}

	@GetMapping("/employeeindex")
	public String viewHomePage(Model model, @Param("keyword") String keyword) {
		List<Employee> listEmployees = employeeService.listAll(keyword);
		model.addAttribute("listEmployees", listEmployees);
		model.addAttribute("keyword", keyword);
		return "employeeindex";
	}

	@GetMapping("/new")
	public String showNewemployeeForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}

	@PostMapping("/save")
	public String saveEmployees(@ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes) {
		employeeService.save(employee);
		redirectAttributes.addFlashAttribute("successMessage", "Employee Updated successfully!");
		return "redirect:/employeeindex";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView showEditEmployeeForm(@PathVariable(name = "id") Long id) {
		ModelAndView mav = new ModelAndView("edit_employee");

		Employee employee = employeeService.get(id);
		mav.addObject("employee", employee);

		return mav;
	}

	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable(name = "id") Long id, Model model,
			RedirectAttributes redirectAttributes) {
		try {
			employeeService.delete(id);
			redirectAttributes.addFlashAttribute("message",
					"The Tutorial with id=" + id + " has been deleted successfully!");
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("message", e.getMessage());
		}

		return "redirect:/employeeindex";
	}

	@GetMapping("/about")
	public String viewABOUPage(Model model) {
		return "about";
	}

	@GetMapping("/viewpdf")
	public String viewpdf() {
		return "viewpdf";
	}

	@GetMapping(value = "/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
	public void employeeDetailsReport(HttpServletResponse response) throws IOException {

		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
		String headerKey = "Content-Disposition";
		String headerVal = "attachment; filename=employee_details_" + dateFormat.format(new Date()) + ".pdf";
		response.setHeader(headerKey, headerVal);

		PDFGeneratorUtility.employeeDetailReport(response, employeeRepository.findAll());
	}
	
	@GetMapping("/page/{pageNs}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 5;
		
		Page<Employee> page = employeeService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Employee> listEmployees = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listEmployees", listEmployees);
		return "employeeindex";
	}
	@GetMapping("/employeelogin")
	public String employeelogin() {
		return "employeelogin";
	}
	@GetMapping("/emprequest")
	public String emprequest() {
		return "emprequest";
	}
	@GetMapping("/manager")
	public String manager() {
		return "manager";
	}
	@GetMapping("/teamlead")
	public String teamlead() {
		return "teamlead";
	}

}
