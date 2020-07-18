package edu.bu.met.cs665.assignment2;

/**
 * This Class represents an Order.
 *
 * @author Esme
 *
 */

public class Order {
  private String id;
  private Customer customer;

  public Order(String id, Customer customer) {
    this.id = id;
    this.customer = customer;
  }

  public String getId() {
    return this.id;
  }

  public String getAddress() {
    return this.customer.getAddress();
  }
}
