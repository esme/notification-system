package edu.bu.met.cs665.assignment2;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopTest {
  private Shop shop = null;
  private Customer customer = null;
  private Order order = null;
  private DeliveryRequest deliveryRequest = null;
  private Driver driver1 = null;
  private Driver driver2 = null;
  private Driver driver3 = null;
  private Driver driver4 = null;
  private Driver driver5 = null;

  @Before
  public void init() {
    // create new shop and customer
    shop = new Shop();
    customer = new Customer("john", "boston");

    // create new order
    order = new Order("1", shop, customer, "package1");
    shop.addOrder(order);

    // add 5 drivers
    driver1 = new Driver("A");
    driver2 = new Driver("B");
    driver3 = new Driver("C");
    driver4 = new Driver("D");
    driver5 = new Driver("E");
    shop.addDriver(driver1);
    shop.addDriver(driver2);
    shop.addDriver(driver3);
    shop.addDriver(driver4);
    shop.addDriver(driver5);

    // add delivery request to shop
    deliveryRequest = new DeliveryRequest(order);
    shop.addDeliveryRequest(deliveryRequest);
  }

  @Test
  public void testDriverMethods() {
    shop.removeDriver(driver1);
    Driver driver6 = new Driver("F");
    shop.addDriver(driver6);

    ArrayList<Driver> drivers = new ArrayList<>(Arrays.asList(driver2, driver3, driver4, driver5, driver6));

    assertEquals(shop.getDrivers(), drivers);
  }

  @Test
  public void testCustomerMethods() {
    shop.addCustomer(customer);
    List<Customer> customers = new ArrayList<>();
    customers.add(customer);
    assertEquals(shop.getCustomers(), customers);
  }

  @Test
  public void testAddOrder() {
    List<Order> orders = new ArrayList<>();
    orders.add(order);
    assertEquals(shop.getOrders(), orders);
  }

  @Test
  public void testAddDeliveryRequest() {
    assertEquals(shop.getDeliveryRequests().get("1"), deliveryRequest);
  }

  @Test
  public void testNotifyDriver() {
    assertEquals(driver1.getLatestDeliveryRequest(), null);
    assertEquals(driver2.getLatestDeliveryRequest(), null);
    assertEquals(driver3.getLatestDeliveryRequest(), null);
    assertEquals(driver4.getLatestDeliveryRequest(), null);
    assertEquals(driver5.getLatestDeliveryRequest(), null);

    shop.notifyDrivers(deliveryRequest);

    assertEquals(driver1.getLatestDeliveryRequest(), deliveryRequest);
    assertEquals(driver2.getLatestDeliveryRequest(), deliveryRequest);
    assertEquals(driver3.getLatestDeliveryRequest(), deliveryRequest);
    assertEquals(driver4.getLatestDeliveryRequest(), deliveryRequest);
    assertEquals(driver5.getLatestDeliveryRequest(), deliveryRequest);
  }

  @Test
  public void testNotifyCustomer() {
    assertEquals(customer.getLatestDeliveryRequest(), null);

    shop.notifyCustomer(customer, deliveryRequest);

    assertEquals(customer.getLatestDeliveryRequest(), deliveryRequest);
  }

  @Test
  public void testAcceptDeliveryRequest() {
    driver1.acceptDeliveryRequest(deliveryRequest);
    assertEquals(deliveryRequest.getDeliveryStatus(), DeliveryStatus.OUT_FOR_DELIVERY);
  }
}