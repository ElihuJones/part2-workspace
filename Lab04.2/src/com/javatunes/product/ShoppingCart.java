/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ShoppingCart<T extends Product> {

  // storage for the cart's contents
  private Collection<T> items = new ArrayList<T>();  // diamond not used here just to emphasize the T

  public void addItem(T item) {
    items.add(item);
  }

  public void removeItem(T item) {
    items.remove(item);
  }

  //Unmodifiable collection method
  public Collection<T> allItems() {
    return Collections.unmodifiableCollection(items);
  }

  //Size
  public int size() {
    return items.size();
  }

  //This iterates over a collection. You can iterate with enhanced for-loops
  //for each "item T in items"
  //get.Price has to have a IS-A relationship --> <T extends Product> and you can call getPrice()
  public double total() {
    double result = 0.0;
    for (T item : items) {
      result += item.getPrice();
    }
    return result;
  }
}
