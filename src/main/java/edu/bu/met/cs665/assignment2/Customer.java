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
  private DeliveryRequest latestDeliveryRequest;

  public Customer(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() { return this.name; }

  public String getAddress() {
    return this.address;
  }

  public void update(DeliveryRequest deliveryRequest) {
    this.latestDeliveryRequest = deliveryRequest;
    System.out.print(this.getName() + ": [" + deliveryRequest.getId() + "]: ");
    System.out.print(" Status Change [" + deliveryRequest.getDeliveryStatus() + "] ");
  }

  public DeliveryRequest getLatestDeliveryRequest() {
    return this.latestDeliveryRequest;
  }
}
