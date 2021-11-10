package gr.parisk85.mappers;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Buyer {
    String id;
    String label;
}
