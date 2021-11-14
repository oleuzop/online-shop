package oleuzop.services.transaction.service;

import oleuzop.services.transaction.client.CustomerClient;
import oleuzop.services.transaction.client.ProductClient;
import oleuzop.services.transaction.dto.CustomerDto;
import oleuzop.services.transaction.dto.ProductDto;
import oleuzop.services.transaction.model.Transaction;
import oleuzop.services.transaction.repository.TransactionRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.persistence.EntityNotFoundException;

@SpringBootTest
class TransactionServiceTests {

	@MockBean
	TransactionRepository transactionRepository;

	@MockBean
	ProductClient productClient;

	@MockBean
	CustomerClient customerClient;

	@Autowired
	TransactionService transactionService;

	@Test
	void customerBuysProduct__whenCorrectInput_thenEverythingIsOk() {
		when(transactionRepository.save(any())).thenAnswer(i -> i.getArguments()[0]);

		ProductDto productDto = new ProductDto(1L, "product1", 1.00F, "product1.jpg");
		Mockito.when(productClient.findById(eq(1L))).thenReturn(productDto);

		CustomerDto customerDto = new CustomerDto(1L, "jsmith", "John", "Smith");
		Mockito.when(customerClient.findByUsername(eq("jsmith"))).thenReturn(customerDto);

		Transaction transaction = transactionService.customerBuysProduct("jsmith", 1L);

		Mockito.verify(transactionRepository, times(1)).save(transaction);
		Assertions.assertEquals(transaction.getCustomerId(), customerDto.getId());
		Assertions.assertEquals(transaction.getProductId(), productDto.getId());
		Assertions.assertEquals(transaction.getPrice(), productDto.getPrice());
	}

	@Test
	void customerBuysProduct__whenProductDoesntExist__thenThrowException() {
		when(transactionRepository.save(any())).thenAnswer(i -> i.getArguments()[0]);

		Mockito.when(productClient.findById(eq(1L))).thenReturn(null);

		CustomerDto customerDto = new CustomerDto(1L, "jsmith", "John", "Smith");
		Mockito.when(customerClient.findByUsername(eq("jsmith"))).thenReturn(customerDto);

		Assertions.assertThrows(EntityNotFoundException.class, ()-> transactionService.customerBuysProduct("jsmith", 1L));
	}

	@Test
	void customerBuysProduct__whenCustomerDoesntExist__thenThrowException() {
		when(transactionRepository.save(any())).thenAnswer(i -> i.getArguments()[0]);

		ProductDto productDto = new ProductDto(1L, "product1", 1.00F, "product1.jpg");
		Mockito.when(productClient.findById(eq(1L))).thenReturn(productDto);

		Mockito.when(customerClient.findByUsername(eq("jsmith"))).thenReturn(null);

		Assertions.assertThrows(EntityNotFoundException.class, ()-> transactionService.customerBuysProduct("jsmith", 1L));
	}

}
