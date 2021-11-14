package oleuzop.services.customer.controller;

import java.util.List;

import oleuzop.services.customer.dto.CustomerDto;
import oleuzop.services.customer.dto.mappers.CustomerMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import oleuzop.services.customer.repository.CustomerRepository;

import javax.persistence.EntityNotFoundException;

@RestController
public class CustomerController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CustomerRepository repository;

	@GetMapping("/{id}")
	public CustomerDto findById(@PathVariable("id") Long id) {
		return CustomerMapper.INSTANCE.customerToDto(repository.findById(id).orElseThrow(EntityNotFoundException::new));
	}
	
	@GetMapping("/")
	public List<CustomerDto> findAll() {
		return CustomerMapper.INSTANCE.customerToDtoList(repository.findAll());
	}

	@GetMapping("/username/{username}")
	public CustomerDto getByUsername(@PathVariable("username") String username) {
		LOGGER.info("Customer find: username={}", username);
		return CustomerMapper.INSTANCE.customerToDto(repository.findByUsername(username));
	}
	
}
