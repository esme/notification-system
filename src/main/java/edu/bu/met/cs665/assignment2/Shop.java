package edu.bu.met.cs665.assignment2;
/**
 * This Class represents a Shop.
 *
 * @author Esme
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Shop extends DeliverySystem {
  private List<Order> orders = new ArrayList<>();
  private List<Customer> customers = new ArrayList<>();

  public void addOrder(Order order) {
    this.orders.add(order);
    notifyDriver(new DeliveryRequest(order));
  }

  public void addCustomer(Customer customer) {
    this.customers.add(customer);
  }
}
