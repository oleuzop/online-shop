package oleuzop.services.transaction.controller;

import java.util.List;

import oleuzop.services.transaction.dto.ProductDto;
import oleuzop.services.transaction.dto.TransactionDto;
import oleuzop.services.transaction.dto.mappers.TransactionMapper;
import oleuzop.services.transaction.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import oleuzop.services.transaction.repository.TransactionRepository;

import javax.persistence.EntityNotFoundException;

@RestController
public class TransactionController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TransactionController.class);
	
	@Autowired
	TransactionRepository repository;

	@Autowired
	TransactionService transactionService;

	@GetMapping("/{id}")
	public TransactionDto findById(@PathVariable("id") Long id) {
		return TransactionMapper.INSTANCE.transactionToDto(repository.findById(id).orElseThrow(EntityNotFoundException::new));
	}
	
	@GetMapping
	public List<TransactionDto> findAll() {
		LOGGER.info("Transaction find");
		return TransactionMapper.INSTANCE.transactionToDtoList(repository.findAll());
	}

	@PostMapping
	public TransactionDto customerBuysProduct(@RequestBody ProductDto product) {

		// For now using fixed username until I implement Spring Security with Oauth2
		// then I'll use session-id coming from the OAuth2 implementation
		String username = "jsmith";

		LOGGER.info("Customer \"{}\" buys product \"{}\"", username, product);
		return TransactionMapper.INSTANCE.transactionToDto(transactionService.customerBuysProduct(username, product.getId()));
	}
	
}
