package oleuzop.services.product.dto.mappers;

import oleuzop.services.product.dto.ProductDto;
import oleuzop.services.product.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDto productToDto(Product product);

    Product productFromDto(ProductDto productDto);

    List<ProductDto> productToDtoList(List<Product> productList);

    List<Product> productFromDtoList(List<ProductDto> productDtoList);
}