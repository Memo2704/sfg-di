package com.springframework.sfgdi;

import com.springframework.sfgdi.controllers.ConstructorInjectorController;
import com.springframework.sfgdi.controllers.MyController;
import com.springframework.sfgdi.controllers.PropertiesInjectedController;
import com.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greetings = myController.sayHello();

		System.out.println(greetings);

		System.out.println("--------------Properties");
		PropertiesInjectedController propertiesInjectedController = (PropertiesInjectedController) ctx.getBean("propertiesInjectedController");
		System.out.println(propertiesInjectedController.getGreeting());

		System.out.println("---------------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---------------Constructor");
		ConstructorInjectorController constructorInjectorController = (ConstructorInjectorController) ctx.getBean("constructorInjectorController");
		System.out.println(constructorInjectorController.getGreeting());

	}

}
