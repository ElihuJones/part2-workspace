/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;



public class Order {
  private final String id;
  
  public Order(String id) {
    this.id = id;
  }
  


  //This is a ShoppingCart invokes any type that has an IS-A relationship with Product?
  public void processCart(ShoppingCart<? extends Product> cart) {
      for(Product items : cart.allItems()) {    //To use something on the rt side it has to be an Iterable(Set, Collection or Array)
        System.out.println(items.getCode());    //Call getCode method  of reference item
        System.out.println(cart.total());       //Call the total method of reference cart
        System.out.println(getId());            //
    }
    }

  
  public String getId() {
    return id;
  }
}