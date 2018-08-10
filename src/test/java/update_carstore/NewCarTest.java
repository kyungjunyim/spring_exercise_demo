package update_carstore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("car_tire.xml")
public class NewCarTest {
	@Autowired
	Car car;

	@Test
	public void test() {
		assertEquals("현재 타이어: 미국 타이어", car.getTireBrand());
	}

}
