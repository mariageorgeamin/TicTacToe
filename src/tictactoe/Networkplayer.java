/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Networkplayer extends AnchorPane {

    protected final Pane pane;
    protected final ImageView background1;
    protected final ImageView tictactoe;
    protected final Button bBack;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button b3;
    protected final Button b2;
    protected final Button b1;
    protected final Button b6;
    protected final Button b5;
    protected final Button b4;
    protected final Button b9;
    protected final Button b8;
    protected final Button b7;
    protected  Stage primaryStage;
    protected  String user_name;
    protected  String password;
    protected Label totalScore;

    // Indicate whether the player has the turn
    private boolean myTurn = false;
    // Indicate the token for the player
    private char myToken = ' ';
    // Indicate selected row and column by the current move
    private int rowSelected;
    private int columnSelected;
    // Wait for the player to mark a cell
    private boolean waiting = true;
    public int count = 0; //order Of Move
    public boolean flagSave = false;
    
    public Networkplayer(Stage primaryStage,String name,String pass) {
         this.primaryStage= primaryStage;
         this.user_name=name;
         this.password=pass;
        pane = new Pane();
        background1 = new ImageView();
        tictactoe = new ImageView();
        bBack = new Button();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        b3 = new Button();
        b2 = new Button();
        b1 = new Button();
        b6 = new Button();
        b5 = new Button();
        b4 = new Button();
        b9 = new Button();
        b8 = new Button();
        b7 = new Button();

        setId("AnchorPane");
        setPrefHeight(458.0);
        setPrefWidth(542.0);

        pane.setPrefHeight(458.0);
        pane.setPrefWidth(542.0);
        pane.setStyle("-fx-background-image: url ('base.jpg');");

        background1.setFitHeight(458.0);
        background1.setFitWidth(542.0);
        background1.setImage(new Image(getClass().getResource("base.jpg").toExternalForm()));
//
//        gridPane.setHgap(20.0);
//        gridPane.setLayoutX(120.0);
//        gridPane.setLayoutY(100.0);
//        gridPane.setPrefHeight(300.0);
//        gridPane.setPrefWidth(300.0);
//        gridPane.setVgap(30.0);
        totalScore=new Label();
        totalScore.setLayoutX(0.0);
        totalScore.setLayoutY(0.0);
       totalScore.setStyle("-fx-font-size:13px;");
       totalScore.setTextFill(Color.web("#f26132"));
        
        gridPane.setLayoutX(120.0);
        gridPane.setLayoutY(90.0);
        gridPane.setPrefHeight(325.0);
        gridPane.setPrefWidth(319.0);
        gridPane.setCursor(Cursor.HAND);        

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
        gridPane.setPadding(new Insets(5.0));
        
        bBack.setLayoutX(461.0);
        bBack.setLayoutY(402.0);
        bBack.setMnemonicParsing(false);
        bBack.setOpacity(0.0);
        bBack.setPrefHeight(40.0);
        bBack.setPrefWidth(65.0);
        bBack.setText("Button");
        bBack.setCursor(Cursor.HAND);
        bBack.setOnAction(new EventHandler<ActionEvent>(){
//         position_9.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
              Parent root = new menu2Base(primaryStage);
                
                Scene scene = new Scene(root);

                primaryStage.setScene(scene);
                primaryStage.show();   
            }
            
        });

        GridPane.setColumnIndex(b3, 2);
        b3.setMnemonicParsing(false);
        b3.setPrefHeight(90.0);
        b3.setPrefWidth(90.0);
        b3.setStyle("-fx-background-color: transparent  ; -fx-background-radius: 15;");
        b3.setOnAction((ActionEvent event) -> {
            System.out.println("daaas");
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (myTurn) {
                if (myToken == 'X') {
                    Platform.runLater(() -> b3.setGraphic(imageViewX));

                } else {
                    Platform.runLater(() -> b3.setGraphic(imageViewO));
                }
                if (flagSave) {
                    count++;
                    //db.saveMove(count, gameId, 0, 1, Character.toString(myToken));
                }
                myTurn = false;
                rowSelected = 0;
                columnSelected = 2;
                waiting = false; // Just completed a successful move
            }

        });

        GridPane.setColumnIndex(b2, 1);
        b2.setMnemonicParsing(false);
        b2.setPrefHeight(90.0);
        b2.setPrefWidth(90.0);
        b2.setStyle("-fx-background-color: transparent; -fx-background-radius: 15;");
        b2.setOnAction((ActionEvent event) -> {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (myTurn) {
                if (myToken == 'X') {
                    Platform.runLater(() -> b2.setGraphic(imageViewX));

                } else {
                    Platform.runLater(() -> b2.setGraphic(imageViewO));
                }
                if (flagSave) {
                    count++;
                    //db.saveMove(count, gameId, 0, 1, Character.toString(myToken));
                }
                myTurn = false;
                rowSelected = 0;
                columnSelected = 1;
                waiting = false; // Just completed a successful move
            }

        });

        b1.setMnemonicParsing(false);
        b1.setPrefHeight(90.0);
        b1.setPrefWidth(90.0);
        b1.setStyle("-fx-background-color: transparent; -fx-background-radius: 15;");
        b1.setOnAction((ActionEvent event) -> {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (myTurn) {
                if (myToken == 'X') {
                    Platform.runLater(() -> b1.setGraphic(imageViewX));

                } else {
                    Platform.runLater(() -> b1.setGraphic(imageViewO));
                }
                if (flagSave) {
                    count++;
                    //db.saveMove(count, gameId, 0, 1, Character.toString(myToken));
                }
                myTurn = false;
                rowSelected = 0;
                columnSelected = 0;
                waiting = false; // Just completed a successful move
            }

        });

        GridPane.setColumnIndex(b6, 2);
        GridPane.setRowIndex(b6, 1);
        b6.setMnemonicParsing(false);
        b6.setPrefHeight(90.0);
        b6.setPrefWidth(90.0);
        b6.setStyle("-fx-background-radius: 15; -fx-background-color: transparent;");
        b6.setOnAction((ActionEvent event) -> {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (myTurn) {
                if (myToken == 'X') {
                    Platform.runLater(() -> b6.setGraphic(imageViewX));

                } else {
                    Platform.runLater(() -> b6.setGraphic(imageViewO));
                }
                if (flagSave) {
                    count++;
                    //db.saveMove(count, gameId, 0, 1, Character.toString(myToken));
                }
                myTurn = false;
                rowSelected = 1;
                columnSelected = 2;
                waiting = false; // Just completed a successful move
            }

        });

        GridPane.setColumnIndex(b5, 1);
        GridPane.setRowIndex(b5, 1);
        b5.setMnemonicParsing(false);
        b5.setPrefHeight(90.0);
        b5.setPrefWidth(90.0);
        b5.setStyle("-fx-background-radius: 15; -fx-background-color: transparent;");
        b5.setOnAction((ActionEvent event) -> {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (myTurn) {
                if (myToken == 'X') {
                    Platform.runLater(() -> b5.setGraphic(imageViewX));

                } else {
                    Platform.runLater(() -> b5.setGraphic(imageViewO));
                }
                if (flagSave) {
                    count++;
                    //db.saveMove(count, gameId, 0, 1, Character.toString(myToken));
                }
                myTurn = false;
                rowSelected = 1;
                columnSelected = 1;
                waiting = false; // Just completed a successful move
            }

        });

        GridPane.setRowIndex(b4, 1);
        b4.setMnemonicParsing(false);
        b4.setPrefHeight(90.0);
        b4.setPrefWidth(90.0);
        b4.setStyle("-fx-background-radius: 15; -fx-background-color: transparent;");
        b4.setOnAction((ActionEvent event) -> {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (myTurn) {
                if (myToken == 'X') {
                    Platform.runLater(() -> b4.setGraphic(imageViewX));

                } else {
                    Platform.runLater(() -> b4.setGraphic(imageViewO));
                }
                if (flagSave) {
                    count++;
                    //db.saveMove(count, gameId, 0, 1, Character.toString(myToken));
                }
                myTurn = false;
                rowSelected = 1;
                columnSelected = 0;
                waiting = false; // Just completed a successful move
            }

        });

        GridPane.setColumnIndex(b9, 2);
        GridPane.setRowIndex(b9, 2);
        b9.setMnemonicParsing(false);
        b9.setPrefHeight(90.0);
        b9.setPrefWidth(90.0);
        b9.setStyle("-fx-background-radius: 15; -fx-background-color: transparent;");
        b9.setOnAction((ActionEvent event) -> {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (myTurn) {
                if (myToken == 'X') {
                    Platform.runLater(() -> b9.setGraphic(imageViewX));

                } else {
                    Platform.runLater(() -> b9.setGraphic(imageViewO));
                }
                if (flagSave) {
                    count++;
                    //db.saveMove(count, gameId, 0, 1, Character.toString(myToken));
                }
                myTurn = false;
                rowSelected = 2;
                columnSelected = 2;
                waiting = false; // Just completed a successful move
            }

        });

        GridPane.setColumnIndex(b8, 1);
        GridPane.setRowIndex(b8, 2);
        b8.setMnemonicParsing(false);
        b8.setPrefHeight(90.0);
        b8.setPrefWidth(90.0);
        b8.setStyle("-fx-background-radius: 15; -fx-background-color: transparent;");
        b8.setOnAction((ActionEvent event) -> {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (myTurn) {
                if (myToken == 'X') {
                    Platform.runLater(() -> b8.setGraphic(imageViewX));

                } else {
                    Platform.runLater(() -> b8.setGraphic(imageViewO));
                }
                if (flagSave) {
                    count++;
                    //db.saveMove(count, gameId, 0, 1, Character.toString(myToken));
                }
                myTurn = false;
                rowSelected = 2;
                columnSelected = 1;
                waiting = false; // Just completed a successful move
            }

        });

        GridPane.setRowIndex(b7, 2);
        b7.setMnemonicParsing(false);
        b7.setPrefHeight(90.0);
        b7.setPrefWidth(90.0);
        b7.setStyle("-fx-background-radius: 15; -fx-background-color: transparent;");
        b7.setOnAction((ActionEvent event) -> {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (myTurn) {
                if (myToken == 'X') {
                    Platform.runLater(() -> b7.setGraphic(imageViewX));

                } else {
                    Platform.runLater(() -> b7.setGraphic(imageViewO));
                }
                if (flagSave) {
                    count++;
                    //db.saveMove(count, gameId, 0, 1, Character.toString(myToken));
                }
                myTurn = false;
                rowSelected = 2;
                columnSelected = 0;
                waiting = false; // Just completed a successful move
            }

        });

        pane.getChildren().add(background1);
        pane.getChildren().add(tictactoe);
        pane.getChildren().add(bBack);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(b3);
        gridPane.getChildren().add(b2);
        gridPane.getChildren().add(b1);
        gridPane.getChildren().add(b6);
        gridPane.getChildren().add(b5);
        gridPane.getChildren().add(b4);
        gridPane.getChildren().add(b9);
        gridPane.getChildren().add(b8);
        gridPane.getChildren().add(b7);
        
        pane.getChildren().add(gridPane);
        getChildren().add(pane);
        getChildren().add(totalScore);
    
    getData();
    connectToServer();
     displayTotalScore();
    }
    
    // Indicate the token for the other player
    private char otherToken = ' ';


    // Input and output streams from/to server
    private DataInputStream fromServer;
    private DataOutputStream toServer;

    // Continue to play?
    private boolean continueToPlay = true;

    // Host name or ip
  private String host = "192.168.137.78";
   // private String host = "localhost";
    //DataBase db = new DataBase();
    
    public int gameId;
    public String GameName;
    public int playerId;
    public int playerId2;
    public static int PLAYER1 = 1; // Indicate player 1
    public static int PLAYER2 = 2; // Indicate player 2
    public static int PLAYER1_WON = 1; // Indicate player 1 won
    public static int PLAYER2_WON = 2; // Indicate player 2 won
    public static int DRAW = 3; // Indicate a draw
    public static int CONTINUE = 4; // Indicate to continue 
   
    private void getData() {
        
     
        
    }
    
    private void connectToServer() {

        try {
            // Create a socket to connect to the server
            Socket socket = new Socket(host, 5000);

            // Create an input stream to receive data from the server
            fromServer = new DataInputStream(socket.getInputStream());

            // Create an output stream to send data to the server
            toServer = new DataOutputStream(socket.getOutputStream());
            } catch (Exception ex) 
            {
               
            }

            // Control the game on a separate thread
            new Thread(() -> {
            try {
                // Get notification from the server
                int player = fromServer.readInt();

                // Am I player 1 or 2?
                if (player == PLAYER1) {
                    myToken = 'X';
                    otherToken = 'O';
                    // Receive startup notification from the server
                    fromServer.readInt(); // Whatever read is ignored
                    // It is my turn
                    myTurn = true;
                    } else if (player == PLAYER2) {
                        myToken = 'O';
                        otherToken = 'X';
                        
                }

                // Continue to play
                while (continueToPlay) {
                    if (player == PLAYER1) {
                        waitForPlayerAction(); // Wait for player 1 to move
                        sendMove(); // Send the move to the server
                        receiveInfoFromServer(); // Receive info from the server
                    } else if (player == PLAYER2) {
                        receiveInfoFromServer(); // Receive info from the server
                        waitForPlayerAction(); // Wait for player 2 to move
                        sendMove(); // Send player 2's move to the server
                    }
                }

            } catch (Exception ex) {
               Platform.runLater(() -> 
               {
//                Alert alert = new Alert(AlertType.CONFIRMATION);
//                alert.setTitle("Confirmation Dialog");
//                alert.setHeaderText("Server is down now");
//                alert.setContentText("Try later");
//                 alert.show();
                   
                   Stage dialog = new Stage();
                                   dialog.initModality(Modality.WINDOW_MODAL);
                          dialog.setTitle("Confirmation Dialog");
                                  VBox box = new VBox(new Text("Server is down now Try later "));
                                  box.setAlignment(Pos.CENTER);
                                 box.setPadding(new Insets(15));
                                 dialog.setScene(new Scene(box));
                                     
                  Parent root = new menu2Base(primaryStage);
                 Scene scene1 = new Scene(root);
                primaryStage.setScene(scene1);
                primaryStage.show();
                dialog.show();
               });
            }
        }).start();
    
    }
   
     /**
     * Wait for the player to mark a cell
     */
    private void waitForPlayerAction() throws InterruptedException {
        while (waiting) {
            Thread.sleep(100);
        }

        waiting = true;
    }

    /**
     * Send this player's move to the server
     */
    private void sendMove() throws IOException {

        toServer.writeInt(rowSelected); // Send the selected row
        toServer.writeInt(columnSelected); // Send the selected column
    }

    /**
     * Receive info from the server
     */
    
    private void receiveInfoFromServer() throws IOException {
        // Receive game status
        int status = fromServer.readInt();

        if (status == PLAYER1_WON) 
        {
        // Player 1 won, stop playing
            continueToPlay = false;
            if (myToken == 'X')
            {
               String winner ="X player is the winner "; 
             System.out.println( winner);
           
              Platform.runLater(() -> {   
             Parent root = new  popupBaseNetwork(primaryStage,winner,this.user_name,this.password);      
             Scene scene = new Scene(root);
             primaryStage.setScene(scene);
             primaryStage.show();  });  
              updateTotalScore();
                 

            }
            else if (myToken == 'O')
            {
               String winner ="X player is the winner "; 
             System.out.println( winner);
           
              Platform.runLater(() -> {   
             Parent root = new  popupBaseNetwork(primaryStage,winner,this.user_name,this.password);      
             Scene scene = new Scene(root);
             primaryStage.setScene(scene);
             primaryStage.show();  });   
            }
        } else if (status == PLAYER2_WON) {

            continueToPlay = false;
            if (myToken == 'O') 
            {                       
             String winner ="O player is the winner "; 
             System.out.println( winner);
             Platform.runLater(() -> {  
             Parent root = new popupBaseNetwork(primaryStage,winner,this.user_name,this.password);      
             Scene scene = new Scene(root);
             primaryStage.setScene(scene);
             primaryStage.show();
              
              });
             updateTotalScore();
            } 
            else if (myToken == 'X') 
            {
               
              String winner ="O player is the winner "; 
             System.out.println( winner);
              Platform.runLater(() -> {  
              Parent root = new popupBaseNetwork(primaryStage,winner,this.user_name,this.password);      
             Scene scene = new Scene(root);
             primaryStage.setScene(scene);
             primaryStage.show();
              
              });
            }
        } else if (status == DRAW) 
        {
       // No winner, game is over
            continueToPlay = false;
            if (myToken == 'O') 
            {
              String winner ="DRAW "; 
             System.out.println( winner);
              Platform.runLater(() -> {  
              Parent root = new popupBaseNetwork(primaryStage,winner,this.user_name,this.password);      
             Scene scene = new Scene(root);
             primaryStage.setScene(scene);
             primaryStage.show();
              
              });   
            
           }else
            {
             String winner ="DRAW "; 
             System.out.println( winner);
              Platform.runLater(() -> {  
              Parent root = new popupBaseNetwork(primaryStage,winner,this.user_name,this.password);      
             Scene scene = new Scene(root);
             primaryStage.setScene(scene);
             primaryStage.show();
              
              });   
            }
    }else
        {
            receiveMove();
            myTurn = true;
        }
  }
    private void receiveMove() throws IOException {
// Get the other player's move
         
        int row = fromServer.readInt();
        int column = fromServer.readInt();

        if (row == 0 && column == 0) {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (otherToken == 'X') {
                Platform.runLater(() -> b1.setGraphic(imageViewX));
                Platform.runLater(() -> b1.setMouseTransparent(true));
            } else {
                Platform.runLater(() -> b1.setGraphic(imageViewO));
                Platform.runLater(() -> b1.setMouseTransparent(true));
            }

            if (flagSave) {
                count++;
               // db.saveMove(count, gameId, 0, 0, Character.toString(otherToken));
            }

        } else if (row == 1 && column == 0) {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (otherToken == 'X') {
                Platform.runLater(() -> b4.setGraphic(imageViewX));
                Platform.runLater(() -> b4.setMouseTransparent(true));
            } else {
                Platform.runLater(() -> b4.setGraphic(imageViewO));
                Platform.runLater(() -> b4.setMouseTransparent(true));
            }
            if (flagSave) {
                count++;
                //db.saveMove(count, gameId, 1, 0, Character.toString(otherToken));
            }

        } else if (row == 2 && column == 0) {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (otherToken == 'X') {
                Platform.runLater(() -> b7.setGraphic(imageViewX));
                Platform.runLater(() -> b7.setMouseTransparent(true));
            } else {
                Platform.runLater(() -> b7.setGraphic(imageViewO));
                Platform.runLater(() -> b7.setMouseTransparent(true));
            }
            if (flagSave) {
                count++;
              //  db.saveMove(count, gameId, 2, 0, Character.toString(otherToken));
            }

        } else if (row == 0 && column == 1) {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (otherToken == 'X') {
                Platform.runLater(() -> b2.setGraphic(imageViewX));
                Platform.runLater(() -> b2.setMouseTransparent(true));
            } else {
                Platform.runLater(() -> b2.setGraphic(imageViewO));
                Platform.runLater(() -> b2.setMouseTransparent(true));
            }
            if (flagSave) {
                count++;
                //db.saveMove(count, gameId, 0, 1, Character.toString(otherToken));
            }

        } else if (row == 1 && column == 1) {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (otherToken == 'X') {
                Platform.runLater(() -> b5.setGraphic(imageViewX));
                Platform.runLater(() -> b5.setMouseTransparent(true));
            } else {
                Platform.runLater(() -> b5.setGraphic(imageViewO));
                Platform.runLater(() -> b5.setMouseTransparent(true));
            }
            if (flagSave) {
                count++;
                //db.saveMove(count, gameId, 1, 1, Character.toString(otherToken));
            }

        } else if (row == 2 && column == 1) {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (otherToken == 'X') {
                Platform.runLater(() -> b8.setGraphic(imageViewX));
                Platform.runLater(() -> b8.setMouseTransparent(true));
            } else {
                Platform.runLater(() -> b8.setGraphic(imageViewO));
                Platform.runLater(() -> b8.setMouseTransparent(true));
            }
            if (flagSave) {
                count++;
                //db.saveMove(count, gameId, 2, 1, Character.toString(otherToken));
            }

        } else if (row == 0 && column == 2) {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (otherToken == 'X') {
                Platform.runLater(() -> b3.setGraphic(imageViewX));
                Platform.runLater(() -> b3.setMouseTransparent(true));
            } else {
                Platform.runLater(() -> b3.setGraphic(imageViewO));
                Platform.runLater(() -> b3.setMouseTransparent(true));
            }
            if (flagSave) {
                count++;
                //db.saveMove(count, gameId, 0, 2, Character.toString(otherToken));
            }

        } else if (row == 1 && column == 2) {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (otherToken == 'X') {
                Platform.runLater(() -> b6.setGraphic(imageViewX));
                Platform.runLater(() -> b6.setMouseTransparent(true));
            } else {
                Platform.runLater(() -> b6.setGraphic(imageViewO));
                Platform.runLater(() -> b6.setMouseTransparent(true));
            }
            if (flagSave) {
                count++;
                //db.saveMove(count, gameId, 1, 2, Character.toString(otherToken));
            }

        } else if (row == 2 && column == 2) {
        ImageView imageViewX;
        ImageView imageViewO;    
        imageViewX = new ImageView(new Image(getClass().getResource("ximg.png").toExternalForm()));
        imageViewO = new ImageView(new Image(getClass().getResource("oimg.png").toExternalForm()));
        imageViewX.setFitHeight(60.0);
        imageViewX.setFitWidth(60.0);
        imageViewO.setFitHeight(60.0);
        imageViewO.setFitWidth(60.0);
            if (otherToken == 'X') {
                Platform.runLater(() -> b9.setGraphic(imageViewX));
                Platform.runLater(() -> b9.setMouseTransparent(true));
            } else {
                Platform.runLater(() -> b9.setGraphic(imageViewO));
                Platform.runLater(() -> b9.setMouseTransparent(true));
            }
            if (flagSave) {
                count++;
                //db.saveMove(count, gameId, 2, 2, Character.toString(otherToken));
            }

        }

    }
    public void updateTotalScore()
    {   try {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tic-tac-toe","root","");
        Statement stmt = conn.createStatement() ;
        String update = "UPDATE players set player_totalscore = player_totalscore+10 where player_username = '" + this.user_name+ "'and player_password ='"+this.password+"'";
        stmt.executeUpdate(update);
        stmt.close();
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Networkplayer.class.getName()).log(Level.SEVERE, null, ex);
        }
                   
    }
    public void displayTotalScore()
    {
        
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tic-tac-toe","root","");
            Statement  stmt = conn.createStatement() ;
            ResultSet  rs = stmt.executeQuery("SELECT player_totalscore FROM players where player_username = '" + this.user_name+ "'and player_password ='"+this.password+"'");
           // 
           while(rs.next())
           {  int temp=rs.getInt(1);
               totalScore.setText("Total Score:"+temp);
               System.out.println("Total Score:"+temp);
           }
           stmt.close();
           conn.close();
           //System.out.println(rs.getInt(1));
        } catch (SQLException ex) {
            Logger.getLogger(Networkplayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

