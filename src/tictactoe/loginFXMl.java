package tictactoe;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class loginFXMl extends AnchorPane {

    protected final ImageView imageView;
    protected final Button loginNewUser;
    protected final Button loginBack;
    protected final TextField loginUsername;
    protected final PasswordField loginPassword;
    protected final Button login;
    protected  String user_name;
    protected  String password;
    
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    boolean exist = false;

    public loginFXMl(Stage primaryStage) {

        imageView = new ImageView();
        loginNewUser = new Button();
        loginBack = new Button();
        loginUsername = new TextField();
        loginPassword = new PasswordField();
        login = new Button();

        setId("AnchorPane");
        setPrefHeight(458.0);
        setPrefWidth(542.0);

        imageView.setFitHeight(458.0);
        imageView.setFitWidth(542.0);
        imageView.setImage(new Image(getClass().getResource("network.png").toExternalForm()));

        loginNewUser.setLayoutX(291.0);
        loginNewUser.setLayoutY(289.0);
        loginNewUser.setMnemonicParsing(false);
        loginNewUser.setOpacity(0.0);
        loginNewUser.setPrefHeight(30.0);
        loginNewUser.setPrefWidth(120.0);
        loginNewUser.setText("Button");
        loginNewUser.setCursor(Cursor.HAND);
         loginNewUser.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
          
                Parent root = new NewuserBase(primaryStage);
                
                Scene scene = new Scene(root);

                primaryStage.setScene(scene);
                primaryStage.show();

                    }
            
        });

        loginBack.setLayoutX(174.0);
        loginBack.setLayoutY(355.0);
        loginBack.setMnemonicParsing(false);
        loginBack.setOpacity(0.0);
        loginBack.setPrefHeight(45.0);
        loginBack.setPrefWidth(194.0);
        loginBack.setText("Button");
        loginBack.setCursor(Cursor.HAND);
        loginBack.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
                
                Parent root = new menu2Base(primaryStage);
                
                Scene scene = new Scene(root);

                primaryStage.setScene(scene);
                primaryStage.show();

                    }
            
        });

        loginUsername.setLayoutX(245.0);
        loginUsername.setLayoutY(152.0);
        loginUsername.setPrefHeight(30.0);
        loginUsername.setPrefWidth(166.0);

        loginPassword.setLayoutX(245.0);
        loginPassword.setLayoutY(214.0);
        loginPassword.setPrefHeight(30.0);
        loginPassword.setPrefWidth(166.0);

        login.setLayoutX(140.0);
        login.setLayoutY(292.0);
        login.setMnemonicParsing(false);
        login.setOpacity(0.0);
        login.setPrefHeight(30.0);
        login.setPrefWidth(120.0);
        login.setText("Button");
        login.setCursor(Cursor.HAND);
        login.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
          
             
                try {
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tic-tac-toe","root","");
                    stmt = conn.createStatement() ;
                     rs = stmt.executeQuery("SELECT player_username, player_password FROM players");
 
                    while (rs.next())
                    {
                        String x = loginUsername.getText();
                        String y = loginPassword.getText();
                        
                        if (x.equals(rs.getString("player_username")))
                        {  
                            if (y.equals(rs.getString("player_password")))
                            {  
                                   exist = true;
                                  user_name=rs.getString("player_username");
                                  password=rs.getString("player_password");
                                  break;
                            } else 
                            {
                                exist = false;
                            }
                        } else 
                        {
                                exist = false;
                        }                             
                    }
                    
                 if(exist)
                  {      Parent root = new Networkplayer(primaryStage,user_name, password);
                         Scene scene = new Scene(root);
                         primaryStage.setScene(scene);
                         primaryStage.show(); 
                         }else
                         {
                                 
                                  Stage dialog = new Stage();
                                   dialog.initModality(Modality.WINDOW_MODAL);
                                  VBox box = new VBox(new Text("Your password or username is wrong"));
                                  box.setAlignment(Pos.CENTER);
                                 box.setPadding(new Insets(15));
                                 dialog.setScene(new Scene(box));
                                dialog.show(); 
                                 
                           }
                        
                         
                  
                   

                    stmt.close();
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
        

        getChildren().add(imageView);
        getChildren().add(loginNewUser);
        getChildren().add(loginBack);
        getChildren().add(loginUsername);
        getChildren().add(loginPassword);
        getChildren().add(login);

    }
}
