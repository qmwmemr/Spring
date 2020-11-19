package org.kg.myapp2;

import org.kg.myapp.IHelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class InputService {

	@Autowired
	InputRepository inputRepository ;
	
	public String Inject(String name) {
		return inputRepository.Inject(name);
	}
}
