package com.bereczki.work.spring.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders", indexes = { @Index(columnList = "ordered_by"), @Index(columnList = "status") })
public class Order {

    public enum TakingMode {
        DELIVER,
        IN_SHOP

    }
    public enum OrderStatus {
        ORDERED,
        ORDER_READY,
        SENT,
        TOOK

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    @Column(nullable = false, columnDefinition= "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime orderTime;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ordered_item")
    private ShopItem orderedItem;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ordered_by")
    private User orderedBy;

    @Embedded
    private Address orderAddress;

    private int orderedCount;

    private String userNote;

    @Enumerated(EnumType.STRING)
    private TakingMode takingMode;

    private boolean paid;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;


    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public ShopItem getOrderedItem() {
        return orderedItem;
    }

    public void setOrderedItem(ShopItem orderedItem) {
        this.orderedItem = orderedItem;
    }

    public User getOrderedBy() {
        return orderedBy;
    }

    public void setOrderedBy(User orderedBy) {
        this.orderedBy = orderedBy;
    }

    public Address getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(Address orderAddress) {
        this.orderAddress = orderAddress;
    }

    public int getOrderedCount() {
        return orderedCount;
    }

    public void setOrderedCount(int orderedCount) {
        this.orderedCount = orderedCount;
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }

    public TakingMode getTakingMode() {
        return takingMode;
    }

    public void setTakingMode(TakingMode takingMode) {
        this.takingMode = takingMode;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}

