package oleuzop.services.transaction.client;

import java.util.List;

import oleuzop.services.transaction.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service")
public interface ProductClient {

	@GetMapping("/{id}")
	ProductDto findById(@PathVariable("id") Long id);
	
}
