package update_carstore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {

	@Test
	public void testKoreanTire() {
		Car car = new Car();
		assertEquals("현재 타이어: 한국 타이어", car.getTireBrand());
	}
	@Test
	public void testAmericanTire() {
		Car car = new Car();
		assertEquals("현재 타이어: 미국 타이어", car.getTireBrand());
	}

}
