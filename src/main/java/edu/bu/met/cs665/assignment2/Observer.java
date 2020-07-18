package edu.bu.met.cs665.assignment2;

import java.util.Map;

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
