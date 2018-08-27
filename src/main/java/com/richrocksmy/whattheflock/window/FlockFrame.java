package com.richrocksmy.whattheflock.window;

import java.awt.Frame;

public class FlockFrame {

  public static final int WIDTH = 1680;
  public static final int HEIGHT = 1050;

  private Frame frame;

  public FlockFrame() {
    frame = new Frame("WTFlock");
    frame.add(new FlockCanvas());
    frame.setSize(WIDTH, HEIGHT);
    frame.pack();
    frame.setVisible(true);
  }
}
