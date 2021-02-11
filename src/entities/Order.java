/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;
import java.text.SimpleDateFormat;

/**
 *
 * @author Cesar
 */
public class Order {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private Date moment;
    
    private OrderStatus orderStatus;
    private Client client;
    
    private List<OrderItem> orderItem = new ArrayList<>();
    
    private Order(){        
    }

    public Order(Date moment, OrderStatus orderstatus, Client client) {
       this.moment = moment;
        this.orderStatus = orderstatus;
        this.client = client;
        
    }

    public Date getDate() {
        return moment;
    }

    public OrderStatus getOrderstatus() {
        return orderStatus;
    }

    public Client getClient() {
        return client;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderstatus(OrderStatus orderstatus) {
        this.orderStatus = orderstatus;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    
    public void addItem(OrderItem orderItem){
        this.orderItem.add(orderItem);
        
    }   
    
    public void removeItem(OrderItem orderItem){
        this.orderItem.add(orderItem);
    }
    
    public double total(){
        double sum = 0.0;        
        for (OrderItem c : orderItem){
            sum += c.subTotal();
        }
        
        return sum;
    }

    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Order Summary: \n");
       sb.append("Order moment: " );
       sb.append(sdf.format(moment)+"\n");
       sb.append("Order Status: " + orderStatus + "\n");
       sb.append("Client: " + client);
       sb.append("Order items: \n");
       for (OrderItem c : orderItem){
           sb.append(c + "\n");
       }
       sb.append("Total price: " );
       sb.append(String.format("%.2f",total()));
       
       return sb.toString();  
    }
    
   
}
