package tictactoe;

import java.util.List;
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

public class popupBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Button playagain;
    protected final Button backTomenu;
    protected final Button exit;
    protected final Button playback;
    protected final Label label;
    List<Integer> record;

    public popupBase(Stage primaryStage , String meg, List<Integer> record) {
        if(meg!="DRAW"){
            AudioClip sound = new AudioClip(this.getClass().getResource("KidsCheering.wav").toString());  
            sound.play();
        }
        this.record=record;
        imageView = new ImageView();
        playagain = new Button();
        backTomenu = new Button();
        exit = new Button();
        playback = new Button();
        label = new Label();
        label.setText(meg);
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(458.0);
        setPrefWidth(542.0);

        imageView.setFitHeight(458.0);
        imageView.setFitWidth(542.0);
        imageView.setLayoutY(2.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("popup.png").toExternalForm()));

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
         playagain.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               
                
                Parent root = new gameBase(primaryStage);
                Scene scene = new Scene(root);

                primaryStage.setScene(scene);
                primaryStage.show();

                    }
            
        });
        

        backTomenu.setContentDisplay(javafx.scene.control.ContentDisplay.GRAPHIC_ONLY);
        backTomenu.setId("exitButton");
        backTomenu.setLayoutX(179.0);
        backTomenu.setLayoutY(229.0);
        backTomenu.setMnemonicParsing(false);
        backTomenu.setOpacity(0.0);
        backTomenu.setPrefHeight(52.0);
        backTomenu.setPrefWidth(184.0);
        backTomenu.setText("back to menu");
        backTomenu.setCursor(Cursor.HAND);
         backTomenu.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
                Parent root = new menu2Base(primaryStage);
                
                Scene scene = new Scene(root);

                primaryStage.setScene(scene);
                primaryStage.show();

                    }
            
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
        exit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
              System.exit(0);

                    }
            
        });

        playback.setContentDisplay(javafx.scene.control.ContentDisplay.GRAPHIC_ONLY);
        playback.setId("exitButton");
        playback.setLayoutX(132.0);
        playback.setLayoutY(364.0);
        playback.setMnemonicParsing(false);
        playback.setOpacity(0.0);
        playback.setPrefHeight(37.0);
        playback.setPrefWidth(38.0);
        playback.setText("playback");
        playback.setCursor(Cursor.HAND);
        playback.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
                Parent root = new PlayAgain(primaryStage,record);
                
                Scene scene = new Scene(root);

                primaryStage.setScene(scene);
                primaryStage.show();

                    }
            
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
        getChildren().add(playback);
        getChildren().add(label);

    }
}
