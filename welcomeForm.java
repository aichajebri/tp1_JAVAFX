package tp1_javaFx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class welcomeForm extends Application  {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("JavaFX Welcome");

		 primaryStage.show();
		 GridPane grid = new GridPane();
		 grid.setAlignment(Pos.CENTER);
		 grid.setHgap(10);
		 grid.setVgap(10);
		 grid.setPadding(new Insets(25, 25, 25, 25));
		 
		 Scene scene = new Scene(grid, 300, 275);
		 primaryStage.setScene(scene);
		 
		 Text scenetitle = new Text("Welcome");
		 scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL,
		 20));
		 grid.add(scenetitle, 0, 0, 2, 1);
		 
		 Label userName = new Label("User Name:");
		 grid.add(userName, 0, 1);
		 TextField userTextField = new TextField();
		 grid.add(userTextField, 1, 1);
		 
		 Label pw = new Label("Password:");
		 grid.add(pw, 0, 2);
		 PasswordField pwBox = new PasswordField();
		 grid.add(pwBox, 1, 2);
		 
		 Button btn = new Button("Sign in");
		 HBox hbBtn = new HBox(10);
		 hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		 hbBtn.getChildren().add(btn);
		 grid.add(hbBtn, 1, 4);
		 
		 Button btn1 = new Button ("exit");
		 hbBtn.getChildren().add(btn1);
		
		 final Text actiontarget = new Text();
		 grid.add(actiontarget, 1, 6);
		 
		 
		 btn.setOnAction(new EventHandler<ActionEvent>() {
			 @Override
			 public void handle(ActionEvent e) {
			 actiontarget.setFill(Color.FIREBRICK);
			 if (userTextField.getText() == "salma" || pw.getText()=="salma")
				 actiontarget.setText("welcome");
			 else 				 actiontarget.setText("wrong pwd");
}
			
			});
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			 @Override
			 public void handle(ActionEvent e) {
		            Platform.exit();
			 }
			});
		btn.setOnAction(newEventHandler<ActionEvent>() {
			 public void handle(ActionEvent e) {
		           String mot_pass =pwBox.getText()
;
		           if(mot_pass.equals("welcome")) {
		        	   actiontarget.setText("pwd correct");
		        	   actiontarget.setFill(Color,GREEN);   
		           }
		           else if (mot_pass.equals("welcome")==false){
		        	   actiontarget.setText("pwd incorrect");
		        	   actiontarget.setFill(Color,RED);   
		           }
		           else {
		        	   actiontarget.setFill(Color,BLUE);   
		        	   actiontarget.setText("sign in button pressed");

		           }
			});
		PrimaryStage.show();
		 }
	
	public static void main(String[] args) {
		 launch(args);
		 }

}
