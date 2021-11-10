package gr.parisk85.mappers;

import lombok.RequiredArgsConstructor;

import java.util.List;

public interface BestCustomerGateway {

    Customer findTop1();

    List<Customer> findTop2();
}
