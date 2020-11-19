package org.kg.myapp2;

import org.kg.myapp.HelloController;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class InputMain {

	public static void main(String[] args) {
		AbstractApplicationContext con = new GenericXmlApplicationContext("app.xml");
		InputController inputController = con.getBean(InputController.class);
		inputController.Inject("플라스틱");

	}

}
