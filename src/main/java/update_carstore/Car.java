package update_carstore;

import javax.annotation.Resource;

public class Car {
	@Resource
	Tire tire;
	
//	public void setTire(Tire tire) {
//		this.tire = tire;
//	}
//	
//	public Tire getTire() {
//		return tire;
//	}
	
	public String getTireBrand() {
		return "현재 타이어: " + tire.getBrand();
	}
}
