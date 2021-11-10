package gr.parisk85.mappers.function;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

interface Mapper<I, O> extends Function<I, O> {
    O map(I input);

    default O apply(I input) {
        return map(input);
    }

    default List<O> apply(List<I> input) {
        return input.stream()
                .map(this)
                .collect(Collectors.toList());
    }
}
