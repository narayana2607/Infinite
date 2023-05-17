package infinite.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infinite.springboot.model.Appform;
import infinite.springboot.repository.FormRep;

@Service
public class FormSer {
	@Autowired
	private FormRep repository;
	 public void save(Appform appform) {
	  repository.save(appform);
	 }

}
