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

  public String getAddress() {
    return this.address;
  }

  /**
   * update method to get updated.
   */
  public void update(DeliveryRequest deliveryRequest) {
    this.latestDeliveryRequest = deliveryRequest;
    String template = "Customer %s: Status update: %s [%s]";
    String message = String.format(
        template,
        this.name,
        deliveryRequest.getId(),
        deliveryRequest.getDeliveryStatus()
    );
    System.out.println(message);
  }

  public DeliveryRequest getLatestDeliveryRequest() {
    return this.latestDeliveryRequest;
  }
}
