package gr.parisk85.mappers.function;

import gr.parisk85.mappers.BestBuyersRestClient;
import gr.parisk85.mappers.BestCustomerGateway;
import gr.parisk85.mappers.Buyer;
import gr.parisk85.mappers.Customer;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class FunctionBestCustomerGateway implements BestCustomerGateway {

    private final BestBuyersRestClient bestBuyersRestClient;
    private final FunctionBuyerToCustomerMapper mapper;

    public Customer findTop1() {
        var buyer = bestBuyersRestClient.top1();
        return mapper.apply(buyer);
    }

    public List<Customer> findTop2() {
        var buyers = bestBuyersRestClient.top2();
        return mapper.apply(buyers);
    }
}
