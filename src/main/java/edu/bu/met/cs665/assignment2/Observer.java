package edu.bu.met.cs665.assignment2;

/**
 * This interface represents an Observer.
 *
 * @author Esme
 *
 */

interface Observer {
  void update(DeliveryRequest deliveryRequest);

  DeliveryRequest getLatestDeliveryRequest();
}
