package co.com.sofka.crud.entities.values;

import java.util.Objects;

public class IsCompleted {
    private final Boolean value;

    public IsCompleted(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }

    public Boolean getValue()

    {
        return value;
    }


}
