package edu.bu.met.cs665.assignment2;
/**
 * This Class represents a Customer.
 *
 * @author Esme
 *
 */

public class Customer implements Observer {
  private String name;
  private String address;

  public Customer(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getAddress() {
    return this.address;
  }

  public void update(DeliveryRequest deliveryRequest) {
    System.out.println("Status change: " + deliveryRequest.getDeliveryStatus());
  }
}
