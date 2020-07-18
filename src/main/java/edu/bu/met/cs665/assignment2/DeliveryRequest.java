package edu.bu.met.cs665.assignment2;
/**
 * This Class represents a DeliveryRequest.
 *
 * @author Esme
 *
 */

public class DeliveryRequest {
  private String id;
  private String address;
  private DeliveryStatus deliveryStatus;

  public DeliveryRequest(Order order) {
    this.id = order.getId();
    this.address = order.getAddress();
    this.deliveryStatus = DeliveryStatus.PENDING;
  }

  public String getId() {
    return this.id;
  }

  public String getAddress() {
    return this.address;
  }

  public DeliveryStatus getDeliveryStatus() { return this.deliveryStatus; }
}
