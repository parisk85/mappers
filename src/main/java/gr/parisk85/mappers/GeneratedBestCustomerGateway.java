package gr.parisk85.mappers;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class GeneratedBestCustomerGateway implements BestCustomerGateway {

    private final BestBuyersRestClient bestBuyersRestClient;
    private final GeneratedBuyerToCustomerMapper mapper;

    public Customer findTop1() {
        var buyer = bestBuyersRestClient.top1();
        return mapper.map(buyer);
    }

    public List<Customer> findTop2() {
        var buyers = bestBuyersRestClient.top2();
        return mapper.map(buyers);
    }
}
