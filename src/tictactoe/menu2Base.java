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

public class menu2Base extends AnchorPane {

    protected final ImageView imageView;
    protected final Button player1Button;
    protected final Button back;
    protected final Button player2Button;
    protected final Button networkButton;

    public menu2Base(Stage primaryStage) {

        imageView = new ImageView();
        player1Button = new Button();
        back = new Button();
        player2Button = new Button();
        networkButton = new Button();

        setId("AnchorPane");
        setPrefHeight(458.0);
        setPrefWidth(542.0);

        imageView.setFitHeight(458.0);
        imageView.setFitWidth(542.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("menu2.png").toExternalForm()));

        player1Button.setLayoutX(188.0);
        player1Button.setLayoutY(119.0);
        player1Button.setMnemonicParsing(false);
        player1Button.setOpacity(0.0);
        player1Button.setPrefHeight(34.0);
        player1Button.setPrefWidth(166.0);
        player1Button.setText("Button");
        player1Button.setCursor(Cursor.HAND);
        player1Button.setOnAction((ActionEvent event) -> {
            Parent root = new levelsBase(primaryStage);
            Scene scene1 = new Scene(root);
            primaryStage.setScene(scene1);
            primaryStage.show();
        });

        back.setLayoutX(191.0);
        back.setLayoutY(351.0);
        back.setMnemonicParsing(false);
        back.setOpacity(0.0);
        back.setPrefHeight(42.0);
        back.setPrefWidth(160.0);
        back.setText("Button");
        back.setCursor(Cursor.HAND);
        back.setOnAction((ActionEvent event) -> {
            Parent root = new UIBase(primaryStage);
            Scene scene1 = new Scene(root);
            primaryStage.setScene(scene1);
            primaryStage.show();
        });

        player2Button.setLayoutX(191.0);
        player2Button.setLayoutY(195.0);
        player2Button.setMnemonicParsing(false);
        player2Button.setOpacity(0.0);
        player2Button.setPrefHeight(42.0);
        player2Button.setPrefWidth(160.0);
        player2Button.setText("Button");
        player2Button.setCursor(Cursor.HAND);
        player2Button.setOnAction((ActionEvent event) -> {
            Parent root = new gameBase(primaryStage);
            Scene scene1 = new Scene(root);
            primaryStage.setScene(scene1);
            primaryStage.show();
        });

        networkButton.setLayoutX(191.0);
        networkButton.setLayoutY(272.0);
        networkButton.setMnemonicParsing(false);
        networkButton.setOpacity(0.0);
        networkButton.setPrefHeight(42.0);
        networkButton.setPrefWidth(160.0);
        networkButton.setText("Button");
        networkButton.setCursor(Cursor.HAND);
        networkButton.setOnAction((ActionEvent event) -> {
            Parent root = new loginFXMl(primaryStage);
            Scene scene1 = new Scene(root);
            primaryStage.setScene(scene1);
            primaryStage.show();
        });

        getChildren().add(imageView);
        getChildren().add(player1Button);
        getChildren().add(back);
        getChildren().add(player2Button);
        getChildren().add(networkButton);

    }
}
