package co.com.sofka.crud.entities.values;

import java.util.Objects;

public class Label {
    private final String value;

    public Label(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String value()

    {
        return value;
    }


}
