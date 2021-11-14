package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args); //The run is going to turn back an application context

		I18NController i18NController = (I18NController) ctx.getBean("i18NController");

		System.out.println("----------Profile");
		System.out.println(i18NController.sayGreeting());

		MyController myController = (MyController) ctx.getBean("myController"); //string name of the bean but beginning with a lower case
		//Essentially calling the spring to provide an instance of the bean
		System.out.println("----------Primary");
		System.out.println(myController.helloWorld());


		System.out.println("----------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------Controller");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}

}
