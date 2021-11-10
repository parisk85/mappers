package gr.parisk85.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface GeneratedBuyerToCustomerMapper {

    @Mapping(source = "label", target = "name")
    Customer map(Buyer buyer);

    List<Customer> map(List<Buyer> buyers);
}
