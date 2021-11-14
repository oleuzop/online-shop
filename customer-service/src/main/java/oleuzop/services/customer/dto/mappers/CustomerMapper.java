package oleuzop.services.customer.dto.mappers;

import oleuzop.services.customer.dto.CustomerDto;
import oleuzop.services.customer.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDto customerToDto(Customer customer);

    Customer customerFromDto(CustomerDto customerDto);

    List<CustomerDto> customerToDtoList(List<Customer> customerList);

    List<Customer> customerFromDtoList(List<CustomerDto> customerDtoList);
}