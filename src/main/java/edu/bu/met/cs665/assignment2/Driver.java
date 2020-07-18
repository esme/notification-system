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

  public void update(DeliveryRequest deliveryRequest) {
    latestDeliveryRequest = deliveryRequest;
    System.out.print(this.name + ": New delivery request [" + deliveryRequest.getId() + "] ");
    System.out.print("to [" + deliveryRequest.getAddress() + "]\n");
  }

  public void acceptDeliveryRequest(DeliveryRequest deliveryRequest) {
    deliveryRequest.changeDeliveryStatus(DeliveryStatus.OUT_FOR_DELIVERY);
  }

  public DeliveryRequest getLatestDeliveryRequest() {
    return this.latestDeliveryRequest;
  }
}
