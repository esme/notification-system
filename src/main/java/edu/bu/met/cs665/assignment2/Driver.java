package edu.bu.met.cs665.assignment2;

/**
 * This Class represents a Driver (ConcreteObserverA).
 *
 * @author Esme
 *
 */

public class Driver implements Observer {

  private String name;
  private DeliveryRequest latestDeliveryRequest = null;

  public Driver(String name) {
    this.name = name;
  }

  /**
   * update method to get updated.
   */
  public void update(DeliveryRequest deliveryRequest) {
    latestDeliveryRequest = deliveryRequest;
    String template = "Driver %s: New delivery request: %s to %s";
    String message = String.format(template, this.name, deliveryRequest.getId(),
        deliveryRequest.getAddress());
    System.out.println(message);
  }

  public void acceptDeliveryRequest(DeliveryRequest deliveryRequest) {
    deliveryRequest.changeDeliveryStatus(DeliveryStatus.OUT_FOR_DELIVERY);
  }

  public DeliveryRequest getLatestDeliveryRequest() {
    return this.latestDeliveryRequest;
  }
}
