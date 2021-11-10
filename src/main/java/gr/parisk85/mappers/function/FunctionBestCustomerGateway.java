package gr.parisk85.mappers.function;

import gr.parisk85.mappers.BestBuyersRestClient;
import gr.parisk85.mappers.BestCustomerGateway;
import gr.parisk85.mappers.Customer;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class FunctionBestCustomerGateway implements BestCustomerGateway {

    private final BestBuyersRestClient bestBuyersRestClient;

    public Customer findTop1() {
        var buyer = bestBuyersRestClient.top1();
        return null;//mapper.map(buyer);
    }

    public List<Customer> findTop2() {
        var buyers = bestBuyersRestClient.top2();
        return null;//mapper.map(buyers);
    }
}
