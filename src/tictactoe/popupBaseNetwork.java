package tictactoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public  class popupBaseNetwork extends AnchorPane {

    protected final ImageView imageView;
    protected final Button playagain;
    protected final Button backTomenu;
    protected final Button exit;
    protected final Label label;

    public popupBaseNetwork(Stage primaryStage,String meg,String name,String pass) {
        if(meg!="DRAW"){
            AudioClip sound = new AudioClip(this.getClass().getResource("KidsCheering.wav").toString());  
            sound.play();
        }

        imageView = new ImageView();
        playagain = new Button();
        backTomenu = new Button();
        exit = new Button();
        label = new Label();
        label.setText(meg);
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(458.0);
        setPrefWidth(542.0);
        label.setStyle("-fx-font-weight: bold");

        imageView.setFitHeight(458.0);
        imageView.setFitWidth(542.0);
        imageView.setLayoutY(2.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("popup_1.png").toExternalForm()));

        playagain.setContentDisplay(javafx.scene.control.ContentDisplay.GRAPHIC_ONLY);
        playagain.setId("playButton");
        playagain.setLayoutX(179.0);
        playagain.setLayoutY(159.0);
        playagain.setMnemonicParsing(false);
        playagain.setOpacity(0.0);
        playagain.setPrefHeight(52.0);
        playagain.setPrefWidth(184.0);
        playagain.setText("playagain");
        playagain.setCursor(Cursor.HAND);
        playagain.setOnAction((ActionEvent event) -> {
            Parent root = new  Networkplayer( primaryStage, name, pass);
            Scene scene1 = new Scene(root);
            primaryStage.setScene(scene1);
            primaryStage.show();
        });
        

        backTomenu.setContentDisplay(javafx.scene.control.ContentDisplay.GRAPHIC_ONLY);
        backTomenu.setId("exitButton");
        backTomenu.setLayoutX(179.0);
        backTomenu.setLayoutY(229.0);
        backTomenu.setMnemonicParsing(false);
        backTomenu.setOpacity(0.0);
        backTomenu.setPrefHeight(52.0);
        backTomenu.setPrefWidth(184.0);
        backTomenu.setText("playback");
        backTomenu.setCursor(Cursor.HAND);
          backTomenu.setOnAction((ActionEvent event) -> {
              Parent root = new menu2Base(primaryStage);
              Scene scene1 = new Scene(root);
              primaryStage.setScene(scene1);
              primaryStage.show();
        });

        exit.setContentDisplay(javafx.scene.control.ContentDisplay.GRAPHIC_ONLY);
        exit.setId("exitButton");
        exit.setLayoutX(179.0);
        exit.setLayoutY(305.0);
        exit.setMnemonicParsing(false);
        exit.setOpacity(0.0);
        exit.setPrefHeight(45.0);
        exit.setPrefWidth(184.0);
        exit.setText("exit");
        exit.setCursor(Cursor.HAND);
          exit.setOnAction((ActionEvent event) -> {
              System.exit(0);
        });

        label.setLayoutX(174.0);
        label.setLayoutY(104.0);
        label.setPrefHeight(29.0);
        label.setPrefWidth(500.0);
        label.setStyle("-fx-font-size:17px;");
        label.setTextFill(Color.web("#f26132"));

        getChildren().add(imageView);
        getChildren().add(playagain);
        getChildren().add(backTomenu);
        getChildren().add(exit);
        getChildren().add(label);

    }
}
