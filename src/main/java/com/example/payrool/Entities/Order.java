package com.example.payrool.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "CUSTOMER_ORDER")
@Getter
@Setter
public
class Order {

    private @Id @GeneratedValue Long id;

    private String description;
    private Status status;

    public Order(String description, Status status) {

        this.description = description;
        this.status = status;
    }

    public Order() {

    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Order order))
            return false;
        return Objects.equals(this.id, order.id) && Objects.equals(this.description, order.description)
                && this.status == order.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.description, this.status);
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + this.id + ", description='" + this.description + '\'' + ", status=" + this.status + '}';
    }
}
