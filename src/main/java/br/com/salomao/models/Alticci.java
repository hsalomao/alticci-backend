package br.com.salomao.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alticci")
public class Alticci {

    @Id
    private Long id;
    private Long number;

    protected Alticci() {
    }

    private Alticci(Builder builder) {
        id = builder.id;
        number = builder.number;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public Long getNumber() {
        return number;
    }

    public static final class Builder {
        private Long id;
        private Long number;

        private Builder() {
        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withNumber(Long number) {
            this.number = number;
            return this;
        }

        public Alticci build() {
            return new Alticci(this);
        }
    }
}
