package gr.parisk85.mappers.staticmapper;

import gr.parisk85.mappers.Buyer;
import gr.parisk85.mappers.Customer;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class StaticBuyerToCustomerMapper {
    public static Customer toCustomer(final Buyer buyer) {
        return Customer.builder()
                .id(buyer.getId())
                .name(buyer.getLabel())
                .build();
    }

    public static List<Customer> toCustomers(final List<Buyer> buyers) {
        return buyers.stream()
                .map(StaticBuyerToCustomerMapper::toCustomer)
                .collect(Collectors.toList());
    }
}
