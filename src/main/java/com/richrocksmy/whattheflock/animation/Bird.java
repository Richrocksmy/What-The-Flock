package com.richrocksmy.whattheflock.animation;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.Random;


public class Bird extends Circle implements EventHandler<ActionEvent> {

  private Bounds windowBounds;
  private double dx;
  private double dy;

  public Bird(Bounds bounds) {
    this.windowBounds = bounds;

    Random random = new Random();
    this.setCenterX(Math.abs(random.nextFloat()*100));
    this.setCenterY(Math.abs(random.nextFloat()*100));

    this.dx = random.nextDouble();
    this.dy = random.nextDouble();

    this.setRadius(random.nextFloat() * 10);
    this.setFill(getColor(random.nextInt(6)));
  }

  private Color getColor(int colorValue) {
    switch(colorValue) {
      case 0: return Color.AZURE;
      case 1: return Color.CORAL;
      case 2: return Color.CRIMSON;
      case 3: return Color.LEMONCHIFFON;
      case 4: return Color.BLUEVIOLET;
      default: return Color.DARKSEAGREEN;
    }
  }

  @Override
  public void handle(ActionEvent event) {
    setLayoutX(getLayoutX() + dx);
    setLayoutY(getLayoutY() + dy);

    if((getLayoutY() + 20) >= windowBounds.getMaxY() || (getLayoutY() + 20) <= windowBounds.getMinY() ) {
      dy = -dy;
    }

    if((getLayoutX() + 20) >= windowBounds.getMaxX() || (getLayoutX() + 20) <= windowBounds.getMinX()) {
      dx = -dx;
    }
  }
}
