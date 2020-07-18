package edu.bu.met.cs665;

import edu.bu.met.cs665.assignment2.*;
import edu.bu.met.cs665.example1.Person;
import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

public class Main {

  private static Logger logger = Logger.getLogger(Main.class);


  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    // This configuration is for setting up the log4j properties file.
    // It is better to set this using java program arguments.
    // PropertyConfigurator.configure("log4j.properties");

    // Let us create an object of the Main class.
    Main m = new Main();

    logger.info(m.doIt());

//    logger.trace("Trace Message!");
//    logger.debug("Debug Message!");
//    logger.info("Info Message!");
//    logger.warn("Warn Message!");
//    logger.error("Error Message!");
//    logger.fatal("Fatal Message!");

    // create new shop and customer
    Shop shop = new Shop();
    Customer customer = new Customer("john", "boston");

    // create new order
    Order order = new Order("1", shop, customer, "package1");
    shop.addOrder(order);

    // add 5 drivers
    shop.addDriver(new Driver("A"));
    shop.addDriver(new Driver("B"));
    shop.addDriver(new Driver("C"));
    shop.addDriver(new Driver("D"));
    shop.addDriver(new Driver("E"));

    // create delivery request
    DeliveryRequest deliveryRequest = new DeliveryRequest(order);
    shop.addDeliveryRequest(deliveryRequest);

    // notify drivers
    shop.notifyDriver(deliveryRequest);
  }



  private String doIt() {
    Person student = new Person("John", "Doe");
    return student.getLastName() + ',' + student.getLastName();
  }

}
