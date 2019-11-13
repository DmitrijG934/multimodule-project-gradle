package nn.dgord.api.common.domain;

import java.util.UUID;

public class Foo {
    private UUID id;
    private String message;

    public Foo(String message) {
        this.id = UUID.randomUUID();
        this.message = message;
    }

    public Foo() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
