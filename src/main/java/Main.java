

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;
import beans.Engine;
import beans.Student;

public class Main {
	
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/xml/applicationContext.xml");
        
        Car car = (Car) context.getBean("car");
        
        Engine eng = (Engine)context.getBean("engine");
        System.out.println("This is engine "+eng);
        car.drive();  // Output: Driving a car with a V8 engine.
        
        Student stu = (Student) context.getBean("student");
        stu.getDetails();
    }
}