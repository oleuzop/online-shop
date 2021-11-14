package oleuzop.services.transaction;

import oleuzop.services.transaction.controller.TransactionController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootApplicationTests {

	@Autowired
	private TransactionController controller;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(controller);
	}

}
