package oleuzop.services.product.controller;

import java.util.List;

import oleuzop.services.product.dto.ProductDto;
import oleuzop.services.product.dto.mappers.ProductMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import oleuzop.services.product.repository.ProductRepository;

import javax.persistence.EntityNotFoundException;

@RestController
public class ProductController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	ProductRepository repository;

	@GetMapping("/{id}")
	public ProductDto findById(@PathVariable("id") Long id) {
		return ProductMapper.INSTANCE.productToDto(repository.findById(id).orElseThrow(EntityNotFoundException::new));
	}

	@GetMapping("/")
	public List<ProductDto> findAll() {
		return ProductMapper.INSTANCE.productToDtoList(repository.findAll());
	}
	
}
