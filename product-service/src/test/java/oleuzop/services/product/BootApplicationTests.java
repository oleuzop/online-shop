package oleuzop.services.product;

import oleuzop.services.product.controller.ProductController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootApplicationTests {

	@Autowired
	private ProductController controller;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(controller);
	}

}
