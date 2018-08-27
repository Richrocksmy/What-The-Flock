package com.richrocksmy.whattheflock.animation;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import org.apache.commons.lang3.tuple.Pair;


public class Bird extends Circle implements EventHandler<ActionEvent> {

  private static final float RADIUS = 6.0f;
  private static final Color COLOR = Color.CADETBLUE;
  private static final Pair<Float, Float> START_LOCATION = Pair.of(10.0f, 10.0f);

  private Bounds windowBounds;
  private double dx = 7;
  private double dy = 3;

  public Bird(Bounds bounds) {
    this.windowBounds = bounds;
    this.setCenterX(START_LOCATION.getLeft());
    this.setCenterY(START_LOCATION.getRight());
    this.setRadius(RADIUS);
    this.setFill(COLOR);
  }

  @Override
  public void handle(ActionEvent event) {
    System.out.print("x:" + getLayoutX());
    System.out.print("y:" + getLayoutY());
    System.out.println("----");

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
