package edu.bu.met.cs665.assignment2;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ShopTest {
  private Shop shop = null;
  private Order order = null;

  @Before
  public void init() {
    // create new shop and customer
    shop = new Shop();
    Customer customer = new Customer("john", "boston");

    // create new order
    order = new Order("1", shop, customer, "package1");
    shop.addOrder(order);

    // add 5 drivers
    shop.addDriver(new Driver("A"));
    shop.addDriver(new Driver("B"));
    shop.addDriver(new Driver("C"));
    shop.addDriver(new Driver("D"));
    shop.addDriver(new Driver("E"));

  }

  @Test
  public void testAddDeliveryRequest() {
    DeliveryRequest deliveryRequest = new DeliveryRequest(order);
    shop.addDeliveryRequest(deliveryRequest);
    assertEquals(shop.getDeliveryRequests().get("1"), deliveryRequest);
  }

  @Test
  public void testNotifyDriver() {
    DeliveryRequest deliveryRequest = new DeliveryRequest(order);
    shop.addDeliveryRequest(deliveryRequest);
    shop.notifyDriver(deliveryRequest);
  }

  public void testAddOrder() {
  }
}