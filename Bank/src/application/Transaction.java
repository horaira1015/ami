package application;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Transaction {
	@FXML
	private Button okButton;

	public void transactionComplete() {
		new Main().changeScene("OptionMenu.fxml", "Option Menu", 720, 530);
	}
}
