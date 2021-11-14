package oleuzop.services.customer.repository;

import oleuzop.services.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Customer findByUsername(String username);
}
