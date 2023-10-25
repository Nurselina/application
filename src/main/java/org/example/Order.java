package org.example;

public class Order {
    public Order(int orderId, String orderDetails){
        this.orderId = orderId;
        this.orderDetails= orderDetails;
    }
    int orderId;
    String orderDetails;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }
}
