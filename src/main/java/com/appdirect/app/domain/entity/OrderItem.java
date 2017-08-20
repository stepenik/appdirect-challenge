package com.appdirect.app.domain.entity;



import javax.persistence.*;

@Entity
@Table(name = "SubscriptionOrderItem")
public class OrderItem extends BaseEntity {

    @Column
    private Long quantity;

    @Column
    private String unit;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private Order order;


    public OrderItem() {
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", order=" + order +
                '}';
    }
}