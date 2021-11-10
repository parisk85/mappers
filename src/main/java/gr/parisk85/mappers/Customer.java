package gr.parisk85.mappers;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Customer {
    String id;
    String name;
}
