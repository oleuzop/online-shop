package oleuzop.services.transaction.dto.mappers;

import oleuzop.services.transaction.dto.TransactionDto;
import oleuzop.services.transaction.model.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TransactionMapper {

    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    TransactionDto transactionToDto(Transaction transaction);

    Transaction transactionFromDto(TransactionDto transactionDto);

    List<TransactionDto> transactionToDtoList(List<Transaction> transactionList);

    List<Transaction> transactionFromDtoList(List<TransactionDto> transactionDtoList);
}