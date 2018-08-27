package com.richrocksmy.whattheflock;

import com.richrocksmy.whattheflock.animation.Bird;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlockApplication extends Application {

//  private static final int WIDTH = 1680;
//  private static final int HEIGHT = 1050;
  private static final int WIDTH = 640;
  private static final int HEIGHT = 480;
  private static final String TITLE = "WTFlock";

  @Override
  public void start(Stage primaryStage) {
    Pane canvas = new Pane();
    Scene scene = new Scene(canvas, WIDTH, HEIGHT, Color.ALICEBLUE);
    Bird bird = new Bird(canvas.getBoundsInLocal());

    canvas.getChildren().add(bird);

    primaryStage.setTitle(TITLE);
    primaryStage.setScene(scene);
    primaryStage.show();

    Timeline birdTimeline = new Timeline(new KeyFrame(Duration.millis(20), bird));
    birdTimeline.setCycleCount(Timeline.INDEFINITE);
    birdTimeline.play();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}
