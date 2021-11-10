package gr.parisk85.mappers.generated;

import gr.parisk85.mappers.Buyer;
import gr.parisk85.mappers.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface GeneratedBuyerToCustomerMapper {

    @Mapping(source = "label", target = "name")
    Customer map(Buyer buyer);

    List<Customer> map(List<Buyer> buyers);
}
