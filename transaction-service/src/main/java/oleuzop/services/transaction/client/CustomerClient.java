package oleuzop.services.transaction.client;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import oleuzop.services.transaction.dto.CustomerDto;

@FeignClient(name = "customer-service")
public interface CustomerClient {

	@GetMapping("/username/{username}")
	CustomerDto findByUsername(@PathVariable("username") String username);
	
}
