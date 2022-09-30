/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

public class MessagePrinterClient {

  public static void main(String[] args) {

    MessagePrinter printer1 = new MessagePrinter("This is printer 1");
    printer1.start();

    MessagePrinter printer2 = new MessagePrinter("This is printer 2", 1000);
    printer2.start();
  }
}