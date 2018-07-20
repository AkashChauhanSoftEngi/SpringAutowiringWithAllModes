package com.java.spring.test;

import java.lang.reflect.InvocationTargetException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.java.spring.Area;
import com.java.spring.Dimention;
import com.java.spring.Triangle;

public class Test {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/applicationContext.xml");

		/* Autowiring ByName*/
		Triangle triangle = (Triangle) ap.getBean("trianglebean");
		triangle.draw();

		/* Autowiring ByType*/
		Triangle triangleTwo = (Triangle) ap.getBean("trianglebeanTwo");
		triangleTwo.draw();
		
		/* Autowiring using Constructor */
		Area area = (Area) ap.getBean("areabean");
		area.getTriangleAre();
		
		/* Autowiring using autodetect */
		Area areaTwo = (Area) ap.getBean("areabeatwo");
		areaTwo.getTriangleAre();
		
		/* Autowiring using "no"/"Default" */
		Dimention dimention = (Dimention) ap.getBean("dimentionbean");
		dimention.printDimention();

	}
}
