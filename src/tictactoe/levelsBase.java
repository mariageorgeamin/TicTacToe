package tictactoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class levelsBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Button low;
    protected final Button medium;
    protected final Button high;
    protected final Button back;

    public levelsBase(Stage primaryStage) {

        imageView = new ImageView();
        low = new Button();
        medium = new Button();
        high = new Button();
        back = new Button();

        imageView.setFitHeight(458.0);
        imageView.setFitWidth(542.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("levels.png").toExternalForm()));

        low.setLayoutX(171.0);
        low.setLayoutY(92.0);
        low.setMnemonicParsing(false);
        low.setOpacity(0.0);
        low.setPrefHeight(47.0);
        low.setPrefWidth(200.0);
        low.setText("Button");
        low.setCursor(Cursor.HAND);
           low.setOnAction((ActionEvent event) -> {
               Parent root = new gameAiBase( primaryStage,3);
               Scene scene1 = new Scene(root);
               primaryStage.setScene(scene1);
               primaryStage.show();
        }//         position_9.setOnAction(new EventHandler<ActionEvent>(){
        );

        medium.setLayoutX(171.0);
        medium.setLayoutY(173.0);
        medium.setMnemonicParsing(false);
        medium.setOpacity(0.0);
        medium.setPrefHeight(47.0);
        medium.setPrefWidth(200.0);
        medium.setText("Button");
        medium.setCursor(Cursor.HAND);
        medium.setOnAction((ActionEvent event) -> {
            Parent root = new gameAiBase( primaryStage,6);
            Scene scene1 = new Scene(root);
            primaryStage.setScene(scene1);
            primaryStage.show();
        }//         position_9.setOnAction(new EventHandler<ActionEvent>(){
        );


        high.setLayoutX(171.0);
        high.setLayoutY(253.0);
        high.setMnemonicParsing(false);
        high.setOpacity(0.0);
        high.setPrefHeight(47.0);
        high.setPrefWidth(200.0);
        high.setText("Button");
        high.setCursor(Cursor.HAND);
        high.setOnAction((ActionEvent event) -> {
            Parent root = new gameAiBase( primaryStage,9);
            Scene scene1 = new Scene(root);
            primaryStage.setScene(scene1);
            primaryStage.show();
        }//         position_9.setOnAction(new EventHandler<ActionEvent>(){
        );


        back.setLayoutX(171.0);
        back.setLayoutY(333.0);
        back.setMnemonicParsing(false);
        back.setOpacity(0.0);
        back.setPrefHeight(47.0);
        back.setPrefWidth(200.0);
        back.setText("Button");
        back.setCursor(Cursor.HAND);
            back.setOnAction((ActionEvent event) -> {
                Parent root = new menu2Base(primaryStage);
                Scene scene1 = new Scene(root);
                primaryStage.setScene(scene1);
                primaryStage.show();
        }//         position_9.setOnAction(new EventHandler<ActionEvent>(){
        );

        getChildren().add(imageView);
        getChildren().add(low);
        getChildren().add(medium);
        getChildren().add(high);
        getChildren().add(back);

    }
}
