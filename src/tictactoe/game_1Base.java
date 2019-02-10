package tictactoe;

import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public abstract class game_1Base extends AnchorPane {

    protected final ImageView imageView;
    protected final ImageView x0;
    protected final ImageView o0;
    protected final ImageView x1;
    protected final ImageView o1;
    protected final ImageView x2;
    protected final ImageView o2;
    protected final ImageView x3;
    protected final ImageView o3;
    protected final ImageView x4;
    protected final ImageView o4;
    protected final ImageView x5;
    protected final ImageView o5;
    protected final ImageView x6;
    protected final ImageView o6;
    protected final ImageView x7;
    protected final ImageView o7;
    protected final ImageView x8;
    protected final ImageView o8;
    protected final Button position_1;
    protected final Button position_2;
    protected final Button position_6;
    protected final Button position_5;
    protected final Button position_3;
    protected final Button position_4;
    protected final Button position_7;
    protected final Button position_8;
    protected final Button position_9;
    protected final Button gameBack;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;

    public game_1Base() {

        imageView = new ImageView();
        x0 = new ImageView();
        o0 = new ImageView();
        x1 = new ImageView();
        o1 = new ImageView();
        x2 = new ImageView();
        o2 = new ImageView();
        x3 = new ImageView();
        o3 = new ImageView();
        x4 = new ImageView();
        o4 = new ImageView();
        x5 = new ImageView();
        o5 = new ImageView();
        x6 = new ImageView();
        o6 = new ImageView();
        x7 = new ImageView();
        o7 = new ImageView();
        x8 = new ImageView();
        o8 = new ImageView();
        position_1 = new Button();
        position_2 = new Button();
        position_6 = new Button();
        position_5 = new Button();
        position_3 = new Button();
        position_4 = new Button();
        position_7 = new Button();
        position_8 = new Button();
        position_9 = new Button();
        gameBack = new Button();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();

        setId("AnchorPane");
        setPrefHeight(458.0);
        setPrefWidth(542.0);

        imageView.setFitHeight(458.0);
        imageView.setFitWidth(542.0);
        imageView.setLayoutX(4.0);
        imageView.setLayoutY(7.0);
        imageView.setImage(new Image(getClass().getResource("game.png").toExternalForm()));

        x0.setFitHeight(84.0);
        x0.setFitWidth(88.0);
        x0.setLayoutX(126.0);
        x0.setLayoutY(115.0);
        x0.setPickOnBounds(true);
        x0.setPreserveRatio(true);
        x0.setVisible(false);
        x0.setImage(new Image(getClass().getResource("x.png").toExternalForm()));

        o0.setFitHeight(84.0);
        o0.setFitWidth(88.0);
        o0.setLayoutX(127.0);
        o0.setLayoutY(110.0);
        o0.setPickOnBounds(true);
        o0.setPreserveRatio(true);
        o0.setVisible(false);
        o0.setImage(new Image(getClass().getResource("o.png").toExternalForm()));

        x1.setFitHeight(84.0);
        x1.setFitWidth(88.0);
        x1.setLayoutX(231.0);
        x1.setLayoutY(124.0);
        x1.setPickOnBounds(true);
        x1.setPreserveRatio(true);
        x1.setVisible(false);
        x1.setImage(new Image(getClass().getResource("x.png").toExternalForm()));

        o1.setFitHeight(84.0);
        o1.setFitWidth(88.0);
        o1.setLayoutX(230.0);
        o1.setLayoutY(120.0);
        o1.setPickOnBounds(true);
        o1.setPreserveRatio(true);
        o1.setVisible(false);
        o1.setImage(new Image(getClass().getResource("o.png").toExternalForm()));

        x2.setFitHeight(84.0);
        x2.setFitWidth(88.0);
        x2.setLayoutX(339.0);
        x2.setLayoutY(115.0);
        x2.setPickOnBounds(true);
        x2.setPreserveRatio(true);
        x2.setVisible(false);
        x2.setImage(new Image(getClass().getResource("x.png").toExternalForm()));

        o2.setFitHeight(84.0);
        o2.setFitWidth(88.0);
        o2.setLayoutX(339.0);
        o2.setLayoutY(111.0);
        o2.setPickOnBounds(true);
        o2.setPreserveRatio(true);
        o2.setVisible(false);
        o2.setImage(new Image(getClass().getResource("o.png").toExternalForm()));

        x3.setFitHeight(84.0);
        x3.setFitWidth(88.0);
        x3.setLayoutX(126.0);
        x3.setLayoutY(225.0);
        x3.setPickOnBounds(true);
        x3.setPreserveRatio(true);
        x3.setVisible(false);
        x3.setImage(new Image(getClass().getResource("x.png").toExternalForm()));

        o3.setFitHeight(84.0);
        o3.setFitWidth(88.0);
        o3.setLayoutX(126.0);
        o3.setLayoutY(221.0);
        o3.setPickOnBounds(true);
        o3.setPreserveRatio(true);
        o3.setVisible(false);
        o3.setImage(new Image(getClass().getResource("o.png").toExternalForm()));

        x4.setFitHeight(84.0);
        x4.setFitWidth(88.0);
        x4.setLayoutX(234.0);
        x4.setLayoutY(225.0);
        x4.setPickOnBounds(true);
        x4.setPreserveRatio(true);
        x4.setVisible(false);
        x4.setImage(new Image(getClass().getResource("x.png").toExternalForm()));

        o4.setFitHeight(84.0);
        o4.setFitWidth(88.0);
        o4.setLayoutX(234.0);
        o4.setLayoutY(221.0);
        o4.setPickOnBounds(true);
        o4.setPreserveRatio(true);
        o4.setVisible(false);
        o4.setImage(new Image(getClass().getResource("o.png").toExternalForm()));

        x5.setFitHeight(84.0);
        x5.setFitWidth(88.0);
        x5.setLayoutX(339.0);
        x5.setLayoutY(229.0);
        x5.setPickOnBounds(true);
        x5.setPreserveRatio(true);
        x5.setVisible(false);
        x5.setImage(new Image(getClass().getResource("x.png").toExternalForm()));

        o5.setFitHeight(84.0);
        o5.setFitWidth(88.0);
        o5.setLayoutX(339.0);
        o5.setLayoutY(225.0);
        o5.setPickOnBounds(true);
        o5.setPreserveRatio(true);
        o5.setVisible(false);
        o5.setImage(new Image(getClass().getResource("o.png").toExternalForm()));

        x6.setFitHeight(84.0);
        x6.setFitWidth(88.0);
        x6.setLayoutX(126.0);
        x6.setLayoutY(335.0);
        x6.setPickOnBounds(true);
        x6.setPreserveRatio(true);
        x6.setVisible(false);
        x6.setImage(new Image(getClass().getResource("x.png").toExternalForm()));

        o6.setFitHeight(84.0);
        o6.setFitWidth(88.0);
        o6.setLayoutX(126.0);
        o6.setLayoutY(331.0);
        o6.setPickOnBounds(true);
        o6.setPreserveRatio(true);
        o6.setVisible(false);
        o6.setImage(new Image(getClass().getResource("o.png").toExternalForm()));

        x7.setFitHeight(84.0);
        x7.setFitWidth(88.0);
        x7.setLayoutX(234.0);
        x7.setLayoutY(335.0);
        x7.setPickOnBounds(true);
        x7.setPreserveRatio(true);
        x7.setVisible(false);
        x7.setImage(new Image(getClass().getResource("x.png").toExternalForm()));

        o7.setFitHeight(84.0);
        o7.setFitWidth(88.0);
        o7.setLayoutX(234.0);
        o7.setLayoutY(331.0);
        o7.setPickOnBounds(true);
        o7.setPreserveRatio(true);
        o7.setVisible(false);
        o7.setImage(new Image(getClass().getResource("o.png").toExternalForm()));

        x8.setFitHeight(84.0);
        x8.setFitWidth(88.0);
        x8.setLayoutX(338.0);
        x8.setLayoutY(331.0);
        x8.setPickOnBounds(true);
        x8.setPreserveRatio(true);
        x8.setVisible(false);
        x8.setImage(new Image(getClass().getResource("x.png").toExternalForm()));

        o8.setFitHeight(84.0);
        o8.setFitWidth(88.0);
        o8.setLayoutX(338.0);
        o8.setLayoutY(327.0);
        o8.setPickOnBounds(true);
        o8.setPreserveRatio(true);
        o8.setVisible(false);
        o8.setImage(new Image(getClass().getResource("o.png").toExternalForm()));

        position_1.setLayoutX(126.0);
        position_1.setLayoutY(106.0);
        position_1.setMnemonicParsing(false);
        position_1.setOpacity(0.0);
        position_1.setPrefHeight(92.0);
        position_1.setPrefWidth(88.0);
        position_1.setText("Button");
        position_1.setCursor(Cursor.HAND);

        position_2.setLayoutX(234.0);
        position_2.setLayoutY(107.0);
        position_2.setMnemonicParsing(false);
        position_2.setOpacity(0.0);
        position_2.setPrefHeight(92.0);
        position_2.setPrefWidth(88.0);
        position_2.setText("Button");
        position_2.setCursor(Cursor.HAND);

        position_6.setLayoutX(338.0);
        position_6.setLayoutY(217.0);
        position_6.setMnemonicParsing(false);
        position_6.setOpacity(0.0);
        position_6.setPrefHeight(92.0);
        position_6.setPrefWidth(88.0);
        position_6.setText("Button");

        position_5.setLayoutX(231.0);
        position_5.setLayoutY(221.0);
        position_5.setMnemonicParsing(false);
        position_5.setOpacity(0.0);
        position_5.setPrefHeight(92.0);
        position_5.setPrefWidth(88.0);
        position_5.setText("Button");

        position_3.setLayoutX(334.0);
        position_3.setLayoutY(106.0);
        position_3.setMnemonicParsing(false);
        position_3.setOpacity(0.0);
        position_3.setPrefHeight(92.0);
        position_3.setPrefWidth(88.0);
        position_3.setText("Button");
        position_3.setCursor(Cursor.HAND);

        position_4.setLayoutX(126.0);
        position_4.setLayoutY(217.0);
        position_4.setMnemonicParsing(false);
        position_4.setOpacity(0.0);
        position_4.setPrefHeight(92.0);
        position_4.setPrefWidth(88.0);
        position_4.setText("Button");

        position_7.setLayoutX(126.0);
        position_7.setLayoutY(327.0);
        position_7.setMnemonicParsing(false);
        position_7.setOpacity(0.0);
        position_7.setPrefHeight(92.0);
        position_7.setPrefWidth(88.0);
        position_7.setText("Button");

        position_8.setLayoutX(234.0);
        position_8.setLayoutY(327.0);
        position_8.setMnemonicParsing(false);
        position_8.setOpacity(0.0);
        position_8.setPrefHeight(92.0);
        position_8.setPrefWidth(88.0);
        position_8.setText("Button");

        position_9.setLayoutX(334.0);
        position_9.setLayoutY(327.0);
        position_9.setMnemonicParsing(false);
        position_9.setOpacity(0.0);
        position_9.setPrefHeight(92.0);
        position_9.setPrefWidth(88.0);
        position_9.setText("Button");

        gameBack.setLayoutX(461.0);
        gameBack.setLayoutY(402.0);
        gameBack.setMnemonicParsing(false);
        gameBack.setOpacity(0.0);
        gameBack.setPrefHeight(40.0);
        gameBack.setPrefWidth(65.0);
        gameBack.setText("Button");

        gridPane.setLayoutX(115.0);
        gridPane.setLayoutY(100.0);
        gridPane.setOpacity(0.0);
        gridPane.setPrefHeight(325.0);
        gridPane.setPrefWidth(319.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        getChildren().add(imageView);
        getChildren().add(x0);
        getChildren().add(o0);
        getChildren().add(x1);
        getChildren().add(o1);
        getChildren().add(x2);
        getChildren().add(o2);
        getChildren().add(x3);
        getChildren().add(o3);
        getChildren().add(x4);
        getChildren().add(o4);
        getChildren().add(x5);
        getChildren().add(o5);
        getChildren().add(x6);
        getChildren().add(o6);
        getChildren().add(x7);
        getChildren().add(o7);
        getChildren().add(x8);
        getChildren().add(o8);
        getChildren().add(position_1);
        getChildren().add(position_2);
        getChildren().add(position_6);
        getChildren().add(position_5);
        getChildren().add(position_3);
        getChildren().add(position_4);
        getChildren().add(position_7);
        getChildren().add(position_8);
        getChildren().add(position_9);
        getChildren().add(gameBack);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        getChildren().add(gridPane);

    }
}
