package gr.parisk85.mappers.function;

import gr.parisk85.mappers.Buyer;
import gr.parisk85.mappers.Customer;

public class FunctionBuyerToCustomerMapper implements Mapper<Buyer, Customer> {

    @Override
    public Customer map(Buyer input) {
        return Customer.builder()
                .id(input.getId())
                .name(input.getLabel())
                .build();
    }
}
