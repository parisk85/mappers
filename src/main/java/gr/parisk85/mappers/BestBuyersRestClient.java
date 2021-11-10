package gr.parisk85.mappers;

import java.util.List;

public interface BestBuyersRestClient {
    Buyer top1();
    List<Buyer> top2();
}
