package com.richrocksmy.whattheflock.window;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class FlockCanvas extends Canvas {

  public FlockCanvas() {
    setBackground (Color.GRAY);
    setSize(FlockFrame.WIDTH, FlockFrame.HEIGHT);
  }

  public void paint(Graphics g) {
    g.setColor(Color.CYAN);
    g.fillOval(10, 10, 10, 10);
  }

}

