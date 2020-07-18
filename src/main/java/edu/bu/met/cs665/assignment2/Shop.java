package edu.bu.met.cs665.assignment2;

import java.util.ArrayList;
import java.util.List;

/**
 * This Class represents a Shop.
 *
 * @author Esme
 *
 */

public class Shop extends DeliverySystem {
  private List<Order> orders = new ArrayList<>();
  private List<Customer> customers = new ArrayList<>();

  public void addOrder(Order order) {
    this.orders.add(order);
    notifyDrivers(new DeliveryRequest(order));
  }

  public void addCustomer(Customer customer) {
    this.customers.add(customer);
  }

  public List<Order> getOrders() {
    return this.orders;
  }

  public List<Customer> getCustomers() {
    return this.customers;
  }

  public void notifyCustomer(Customer customer, DeliveryRequest deliveryRequest) {
    customer.update(deliveryRequest);
  }
}
