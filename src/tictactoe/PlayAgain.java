/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Narmeen
 */
public class PlayAgain extends AnchorPane {
    
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
    protected final Button position1;
    protected final Button position2;
    protected final Button position6;
    protected final Button position5;
    protected final Button position3;
    protected final Button position4;
    protected final Button position7;
    protected final Button position8;
    protected final Button position9;
    protected final Button gameBack;
    protected boolean turn  = true;
    private char[] board= new char[9];
    List<Integer> moves = new ArrayList<Integer>();

    protected int count;
    public PlayAgain(Stage primaryStage,List<Integer> moves) {
        
        this.moves=moves;
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
        position1 = new Button();
        position2 = new Button();
        position6 = new Button();
        position5 = new Button();
        position3 = new Button();
        position4 = new Button();
        position7 = new Button();
        position8 = new Button();
        position9 = new Button();
        gameBack = new Button();

        setId("AnchorPane");
        setPrefHeight(458.0);
        setPrefWidth(542.0);

        imageView.setFitHeight(458.0);
        imageView.setFitWidth(542.0);
        imageView.setLayoutX(0.0);
        imageView.setLayoutY(0.0);
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

        position1.setLayoutX(126.0);
        position1.setLayoutY(106.0);
        position1.setMnemonicParsing(false);
        position1.setOpacity(0.0);
        position1.setPrefHeight(92.0);
        position1.setPrefWidth(88.0);
        position1.setText("Button");
        position1.setCursor(Cursor.HAND);
//////////////////////////////////////////////////

        position2.setLayoutX(234.0);
        position2.setLayoutY(107.0);
        position2.setMnemonicParsing(false);
        position2.setOpacity(0.0);
        position2.setPrefHeight(92.0);
        position2.setPrefWidth(88.0);
        position2.setText("Button");
        position2.setCursor(Cursor.HAND);
       ///////////////////////////////////////////////
        position6.setLayoutX(338.0);
        position6.setLayoutY(217.0);
        position6.setMnemonicParsing(false);
        position6.setOpacity(0.0);
        position6.setPrefHeight(92.0);
        position6.setPrefWidth(88.0);
        position6.setText("Button");
        position6.setCursor(Cursor.HAND);
       //////////////////////////////////////////////

        position5.setLayoutX(231.0);
        position5.setLayoutY(221.0);
        position5.setMnemonicParsing(false);
        position5.setOpacity(0.0);
        position5.setPrefHeight(92.0);
        position5.setPrefWidth(88.0);
        position5.setText("Button");
        position5.setCursor(Cursor.HAND);
       /////////////////////////////////////////

        position3.setLayoutX(334.0);
        position3.setLayoutY(106.0);
        position3.setMnemonicParsing(false);
        position3.setOpacity(0.0);
        position3.setPrefHeight(92.0);
        position3.setPrefWidth(88.0);
        position3.setText("Button");
        position3.setCursor(Cursor.HAND);
       /////////////////////////////////////////
        position4.setLayoutX(126.0);
        position4.setLayoutY(217.0);
        position4.setMnemonicParsing(false);
        position4.setOpacity(0.0);
        position4.setPrefHeight(92.0);
        position4.setPrefWidth(88.0);
        position4.setText("Button");
        position4.setCursor(Cursor.HAND);
       /////////////////////////////////////////////////
        position7.setLayoutX(126.0);
        position7.setLayoutY(327.0);
        position7.setMnemonicParsing(false);
        position7.setOpacity(0.0);
        position7.setPrefHeight(92.0);
        position7.setPrefWidth(88.0);
        position7.setText("Button");
        position7.setCursor(Cursor.HAND);
       ////////////////////////////////////////////
        position8.setLayoutX(234.0);
        position8.setLayoutY(327.0);
        position8.setMnemonicParsing(false);
        position8.setOpacity(0.0);
        position8.setPrefHeight(92.0);
        position8.setPrefWidth(88.0);
        position8.setText("Button");
        position8.setCursor(Cursor.HAND);
        ///////////////////////////////////

        position9.setLayoutX(334.0);
        position9.setLayoutY(327.0);
        position9.setMnemonicParsing(false);
        position9.setOpacity(0.0);
        position9.setPrefHeight(92.0);
        position9.setPrefWidth(88.0);
        position9.setText("heleoi");
        position9.setCursor(Cursor.HAND);
      /////////////////////////////////////////////
        gameBack.setLayoutX(461.0);
        gameBack.setLayoutY(402.0);
        gameBack.setMnemonicParsing(false);
        gameBack.setOpacity(0.0);
        gameBack.setPrefHeight(40.0);
        gameBack.setPrefWidth(65.0);
        gameBack.setText("Button");
        gameBack.setCursor(Cursor.HAND);
        gameBack.setOnAction((ActionEvent event) -> {
            Parent root = new menu2Base(primaryStage);
            Scene scene1 = new Scene(root);
            primaryStage.setScene(scene1);
            primaryStage.show();
       }
       );
        
           
            new Thread(new Runnable() {
            @Override public void run() {
            for(int i=0;i<moves.size();i++){
                handleMovement(moves.get(i),primaryStage);
                try {
                     Thread.sleep(1000);
                } catch (InterruptedException ex) {
                     Logger.getLogger(PlayAgain.class.getName()).log(Level.SEVERE, null, ex);
                }
                  
            }
                       
            }}).start();
                             

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
        getChildren().add(position1);
        getChildren().add(position2);
        getChildren().add(position6);
        getChildren().add(position5);
        getChildren().add(position3);
        getChildren().add(position4);
        getChildren().add(position7);
        getChildren().add(position8);
        getChildren().add(position9);
        getChildren().add(gameBack);

    }
     public void positionsetOnAction(ImageView x,ImageView o) {
            //toFile.add(0);
            if(turn) {
                Platform.runLater(() ->x.setVisible(true)); 
                board[0]='x';
                turn = false;  
            }
            else{
               Platform.runLater(() ->o.setVisible(true)); 
                board[0]='o';
                turn = true;
            }
            count++;
           
       }

public  void handleMovement(int  move ,Stage primaryStage )
{      int input = move;
        switch (input) {
            case 0:
                positionsetOnAction(x0,o0);
                break;
            case 1:
                positionsetOnAction(x1,o1);
                break;
            case 2:
                positionsetOnAction(x2,o2);
                break;
            
            case 3:
                positionsetOnAction(x3,o3);
                break;
            case 4:
                 positionsetOnAction(x4,o4);
                break;
            case 5:
                positionsetOnAction(x5,o5);
                break;
            case 6:
                 positionsetOnAction(x6,o6);
                break;
            case 7:
                positionsetOnAction(x7,o7);
                break;
            case 8:
                positionsetOnAction(x8,o8);
                break;
            default:
                break;
        }
    }
}







