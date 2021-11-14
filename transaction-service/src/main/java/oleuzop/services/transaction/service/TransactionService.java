package oleuzop.services.transaction.service;

import oleuzop.services.transaction.client.CustomerClient;
import oleuzop.services.transaction.client.ProductClient;
import oleuzop.services.transaction.dto.CustomerDto;
import oleuzop.services.transaction.dto.ProductDto;
import oleuzop.services.transaction.model.Transaction;
import oleuzop.services.transaction.repository.TransactionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class TransactionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TransactionService.class);

    @Autowired
    ProductClient productClient;

    @Autowired
    CustomerClient customerClient;

    @Autowired
    TransactionRepository repository;

    public Transaction customerBuysProduct(String username, Long productId) {

        LOGGER.info("{} is buying product with id {}", username, productId);

        // Get the ProductDto from product-service
        Optional<ProductDto> productDto = Optional.ofNullable(productClient.findById(productId));

        // Get the CustomerDto from customer-service
        Optional<CustomerDto> customerDto = Optional.ofNullable(customerClient.findByUsername(username));

        if(productDto.isPresent() && customerDto.isPresent()) {
            Transaction newTransaction = new Transaction(customerDto.get().getId(), productDto.get().getId(), productDto.get().getPrice());
            return repository.save(newTransaction);
        }

        throw new EntityNotFoundException();
    }

}
