package s3.testing.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class JunitApplicationTests {

	@Test
	public void contextLoads() {

		Assert.assertEquals(12, 12);
	}


	operatorCalculation objref = new operatorCalculation();

	@Test
	public void contextLoads1() {

		Assert.assertEquals(10,objref.add(4, 6));
	}


	@Test(expected = ArithmeticException.class)
	public void contextLoads2() {

		Assert.assertEquals(ArithmeticException.class, objref.divide(5, 0));
	}

	@Test
	public void contextLoads3() {

		Assert.assertEquals(1, objref.divide(5, 5));
	}

}
