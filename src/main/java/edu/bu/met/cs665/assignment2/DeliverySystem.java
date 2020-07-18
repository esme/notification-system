package edu.bu.met.cs665.assignment2;

import java.util.*;

/**
 * This Class represents a DeliverySystem (Subject).
 *
 * @author Esme
 *
 */

public class DeliverySystem {
  private Map<String, DeliveryRequest> deliveryRequests = new HashMap<>();
  private List<Driver> drivers = new ArrayList<>();

  public void addDeliveryRequest(DeliveryRequest deliveryRequest) {
    deliveryRequests.put(deliveryRequest.getId(), deliveryRequest);
  }

  public Map<String, DeliveryRequest> getDeliveryRequests() {
    return this.deliveryRequests;
  }

  public void notifyDrivers(DeliveryRequest deliveryRequest) {
    for (Observer driver: drivers) {
      driver.update(deliveryRequest);
    }
  }

  public void addDriver(Driver driver) {
    this.drivers.add(driver);
  }

  public void removeDriver(Driver driver) {
    this.drivers.remove(driver);
  }

  public List<Driver> getDrivers() {
    return this.drivers;
  }
}
