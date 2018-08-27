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

import java.util.ArrayList;
import java.util.List;

public class FlockApplication extends Application {

  private static final int WIDTH = 1680;
  private static final int HEIGHT = 1050;
//  private static final int WIDTH = 640;
//  private static final int HEIGHT = 480;
  private static final int TOTAL_BIRDS = 10000;
  private static final String TITLE = "WTFlock";

  @Override
  public void start(Stage primaryStage) {
    Pane canvas = new Pane();
    Scene scene = new Scene(canvas, WIDTH, HEIGHT, Color.ALICEBLUE);

    primaryStage.setTitle(TITLE);
    primaryStage.setScene(scene);
    primaryStage.show();

    List<Timeline> birdTimelines = new ArrayList<>();
    List<Bird> birds = new ArrayList<>();

    for(int i=0; i<=TOTAL_BIRDS; i++){
      Bird bird = new Bird(canvas.getBoundsInLocal());
      birdTimelines.add(new Timeline(new KeyFrame(Duration.millis(10), bird)));
      birds.add(bird);
    }

    canvas.getChildren().addAll(birds);
    birdTimelines.forEach(birdTimeline -> {
      birdTimeline.setCycleCount(Timeline.INDEFINITE);
      birdTimeline.play();
    });
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}
