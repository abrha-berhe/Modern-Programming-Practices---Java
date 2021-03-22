package Lab6;

import javax.swing.JButton;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddressForm extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Address Form");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Label userName = new Label("Name");
		Label street = new Label("Street");
		Label city = new Label("City");
		grid.add(userName, 0, 0); // Column , Row
		grid.add(street, 1, 0);
		grid.add(city, 2, 0);

		TextField userTextField = new TextField();
		TextField streetTextField = new TextField();
		TextField cityTextField = new TextField();

		grid.add(userTextField, 0, 1);
		grid.add(streetTextField, 1, 1);
		grid.add(cityTextField, 2, 1);

		Label state = new Label("State");
		Label zip = new Label("Zip");
		grid.add(state, 0, 2);
		grid.add(zip, 1, 2);

		TextField stateTextField = new TextField();
		TextField zipTextField = new TextField();

		grid.add(stateTextField, 0, 3);
		grid.add(zipTextField, 1, 3);
	 

		// grid.setGridLinesVisible(true);

		// PasswordField pwBox = new PasswordField();
		// grid.add(pwBox, 1, 2);

		Button btn = new Button("SUBMIT");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 1, 4);

		final Text actiontarget = new Text();
		grid.add(actiontarget, 1, 6);
		// btn.setOnAction(new EventHandler<ActionEvent>() {
		// @Override
		// public void handle(ActionEvent e) {
		// actiontarget.setFill(Color.FIREBRICK);
		// actiontarget.setText("Sign in button pressed");
		// }
		// });

		btn.setOnAction(evt -> {
			System.out.println(userTextField.getText());
			System.out.println(streetTextField.getText());
			System.out.println(cityTextField.getText() + ", " + stateTextField.getText() + " " + zipTextField.getText());
		});

		// Scene scene = new Scene(grid, 300, 200);
		Scene scene = new Scene(grid);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
