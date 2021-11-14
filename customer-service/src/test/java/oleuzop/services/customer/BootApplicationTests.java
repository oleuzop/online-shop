package oleuzop.services.customer;

import oleuzop.services.customer.controller.CustomerController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootApplicationTests {

	@Autowired
	private CustomerController controller;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(controller);
	}

}
