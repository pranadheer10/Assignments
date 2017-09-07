package com.springs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	public static void main(String[] args) {

		// BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
			
		
		Triangle triangle = (Triangle) context.getBean("triangle");
			triangle.draw();
		
		//Using Bean Collections
		TriangleCollections_List triangleList = (TriangleCollections_List) context.getBean("triangleList");
			triangleList.draw();

		// AutowireByName
		System.out.println("\nByName Autowiring");
		TriangleAutoWiring triAutoWire = (TriangleAutoWiring) context.getBean("triangleByName");
		triAutoWire.draw();

		// AutoWireByType
		System.out.println("\n Constructor Autowiring");
		TriangleAutoWiring triAutoWireByCon = (TriangleAutoWiring) context.getBean("triangleByConstructor");
		triAutoWireByCon.draw();
	}
}
