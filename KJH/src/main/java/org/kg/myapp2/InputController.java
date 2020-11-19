package org.kg.myapp2;

import org.kg.myapp.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

public class InputController {

	@Autowired
	InputService inputService;
	
	
	public void Inject(String name) {
		System.out.println(inputService.Inject(name));
	}
}
