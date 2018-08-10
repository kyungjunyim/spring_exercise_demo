package update_carstore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Factory {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/update_carstore/car_tire.xml");
//		Tire tire = (Tire) context.getBean("american_tire");
		Car car = (Car) context.getBean("car");
//		car.setTire(tire);
		System.out.println(car.getTireBrand());
	}
}
