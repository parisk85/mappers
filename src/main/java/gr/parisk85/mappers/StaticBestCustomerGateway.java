package gr.parisk85.mappers;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class StaticBestCustomerGateway implements BestCustomerGateway {

    private final BestBuyersRestClient bestBuyersRestClient;

    public Customer findTop1() {
        var buyer = bestBuyersRestClient.top1();
        return StaticBuyerToCustomerMapper.toCustomer(buyer);
    }

    public List<Customer> findTop2() {
        var buyers = bestBuyersRestClient.top2();
        return StaticBuyerToCustomerMapper.toCustomers(buyers);
    }
}
