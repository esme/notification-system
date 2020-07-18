package edu.bu.met.cs665.assignment2;
/**
 * This Class represents an Order.
 *
 * @author Esme
 *
 */

public class Order {
  private String id;
  private Shop shop;
  private Customer customer;
  private String product;

  public Order(String id, Shop shop, Customer customer, String product) {
    this.id = id;
    this.shop = shop;
    this.customer = customer;
    this.product = product;
  }

  public String getId() {
    return this.id;
  }

  public String getAddress() {
    return this.customer.getAddress();
  }
}
