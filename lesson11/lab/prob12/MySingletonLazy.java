package lesson11.lab.prob12;

import java.util.Optional;

public class MySingletonLazy {
    // Use Optional to hold the instance
    private static Optional<MySingletonLazy> instance = Optional.empty();

    private MySingletonLazy() {}

    public static MySingletonLazy getInstance() {
        // Use orElseGet to initialize lazily without explicit null check
        instance = instance.or(() -> Optional.of(new MySingletonLazy()));
        return instance.get();
    }
}
