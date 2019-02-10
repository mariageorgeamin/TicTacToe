package tictactoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class UIBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Button button;
    protected final Button button0;

    public UIBase(Stage primaryStage) {

        imageView = new ImageView();
        button = new Button();
        button0 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(440.0);
        setPrefWidth(528.0);

        imageView.setFitHeight(450.0);
        imageView.setFitWidth(538.0);
        imageView.setLayoutY(0.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("menu.png").toExternalForm()));

        button.setContentDisplay(javafx.scene.control.ContentDisplay.GRAPHIC_ONLY);
        button.setId("playButton");
        button.setLayoutX(182.0);
        button.setLayoutY(188.0);
        button.setMnemonicParsing(false);
        button.setOpacity(0.0);
        button.setPrefHeight(52.0);
        button.setPrefWidth(184.0);
        button.setText("Button");
        button.setCursor(Cursor.HAND);
        button.setOnAction((ActionEvent event) -> {
            Parent root = new menu2Base(primaryStage);
            Scene scene1 = new Scene(root);
            primaryStage.setScene(scene1);
            primaryStage.show();
        });
        

        button0.setContentDisplay(javafx.scene.control.ContentDisplay.GRAPHIC_ONLY);
        button0.setId("exitButton");
        button0.setLayoutX(179.0);
        button0.setLayoutY(272.0);
        button0.setMnemonicParsing(false);
        button0.setOpacity(0.0);
        button0.setPrefHeight(52.0);
        button0.setPrefWidth(184.0);
        button0.setText("Button");
        button0.setCursor(Cursor.HAND);
        button0.setOnAction((ActionEvent event) -> {
            System.exit(0);
        });

        getChildren().add(imageView);
        getChildren().add(button);
        getChildren().add(button0);

    }
}
