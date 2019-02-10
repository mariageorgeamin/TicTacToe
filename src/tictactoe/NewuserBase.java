package tictactoe;

import java.sql.*;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.web.WebEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class NewuserBase extends AnchorPane {

    protected final ImageView imageView;
    protected final TextField user_name;
    protected final Button add_user;
    protected final PasswordField password;
    protected final PasswordField con_pass;
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    

    public NewuserBase(Stage primaryStage) {

        imageView = new ImageView();
        user_name = new TextField();
        add_user = new Button();
        password = new PasswordField();
        con_pass = new PasswordField();
        

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(458.0);
        setPrefWidth(542.0);

        imageView.setFitHeight(458.0);
        imageView.setFitWidth(542.0);
        imageView.setLayoutY(1.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("newuser.png").toExternalForm()));

        user_name.setLayoutX(249.0);
        user_name.setLayoutY(149.0);
        user_name.setPrefHeight(32.0);
        user_name.setPrefWidth(160.0);
        user_name.setStyle("-fx-background-radius: 999;");
        //user_name.getStyleClass().add(".textfield");
//        user_name.getStylesheets().add("/notepad/style.css");

        add_user.setContentDisplay(javafx.scene.control.ContentDisplay.GRAPHIC_ONLY);
        add_user.setId("exitButton");
        add_user.setLayoutX(179.0);
        add_user.setLayoutY(344.0);
        add_user.setMnemonicParsing(false);
        add_user.setOpacity(0.0);
        add_user.setPrefHeight(52.0);
        add_user.setPrefWidth(184.0);
        add_user.setText("adduser");
        add_user.setCursor(Cursor.HAND);
        add_user.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
		try {  
                        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tic-tac-toe","root","");
			stmt = conn.createStatement() ;
                            String username = user_name.getText();
                            String pass = password.getText();
                            String pass2 = con_pass.getText();
                            String qstring = new String("insert into players (player_username, player_password)values('"+ username+"','"+pass+"')");
                            
                         if(!"".equals(username)&&!"".equals(pass))
                         {  
                            if (pass.equals(pass2))
                            {    try {
                                     int n = stmt.executeUpdate(qstring);
                                    } catch (SQLException ex) {
                                      Platform.runLater(() -> 
                                    {
//                                     Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//                                     alert.setTitle("Confirmation Dialog");
//                                     alert.setHeaderText("Look, a Confirmation Dialog");
//                                     alert.setContentText("this service not available now try later");
//                                     alert.show();
                                        
                                   Stage dialog = new Stage();
                                   dialog.initModality(Modality.WINDOW_MODAL);
                                   dialog.setTitle("Confirmation Dialog");
                                  VBox box = new VBox(new Text("this service not available now try later"));
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
                                  Stage dialog = new Stage();
                                dialog.initModality(Modality.WINDOW_MODAL);

                                VBox box = new VBox(new Text("user added"));
                                box.setAlignment(Pos.CENTER);
                                box.setPadding(new Insets(15));

                               
                                Parent root = new loginFXMl(primaryStage);

                                Scene scene = new Scene(root);

                                primaryStage.setScene(scene);
                                primaryStage.show();
                                
                                dialog.setScene(new Scene(box));
                                dialog.show();    
                                
                            }
                            else
                            {
                                Stage dialog = new Stage();
                                dialog.initModality(Modality.WINDOW_MODAL);

                                VBox box = new VBox(new Text("passwords not equal"));
                                box.setAlignment(Pos.CENTER);
                                box.setPadding(new Insets(15));

                                dialog.setScene(new Scene(box));
                                dialog.show();
                            }
                                
                         //   if(n > 0) {
                                
                                
                         }else
                         {
                               Stage dialog = new Stage();
                                dialog.initModality(Modality.WINDOW_MODAL);

                                VBox box = new VBox(new Text("your should chose name and password"));
                                box.setAlignment(Pos.CENTER);
                                box.setPadding(new Insets(15));

                                dialog.setScene(new Scene(box));
                                dialog.show();
                         }
                                
                        stmt.close();
                        conn.close();
                
		} catch (Exception e) {
                        Stage dialog = new Stage();
                                   dialog.initModality(Modality.WINDOW_MODAL);
                                   dialog.setTitle("Confirmation Dialog");
                                  VBox box = new VBox(new Text("this service not available now try later"));
                                  box.setAlignment(Pos.CENTER);
                                 box.setPadding(new Insets(15));
                                 dialog.setScene(new Scene(box));
                                 Parent root = new menu2Base(primaryStage);
                                      Scene scene1 = new Scene(root);
                                      primaryStage.setScene(scene1);
                                      primaryStage.show();
                                      dialog.show();
		} 
    

                    }
            
        });

        password.setLayoutX(249.0);
        password.setLayoutY(212.0);
        password.setPrefHeight(32.0);
        password.setPrefWidth(160.0);
        password.setStyle("-fx-background-radius: 999;");
        password.getStyleClass().add(".textfield");
        password.getStylesheets().add("/notepad/style.css");

        con_pass.setLayoutX(249.0);
        con_pass.setLayoutY(276.0);
        con_pass.setPrefHeight(32.0);
        con_pass.setPrefWidth(160.0);
        con_pass.setStyle("-fx-background-radius: 999;");
        con_pass.getStyleClass().add(".textfield");
        con_pass.getStylesheets().add("/notepad/style.css");

        getChildren().add(imageView);
        getChildren().add(user_name);
        getChildren().add(add_user);
        getChildren().add(password);
        getChildren().add(con_pass);

    }
}
