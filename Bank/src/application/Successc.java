package application;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Successc {
	public void optionmenu(){
		new Main().changeScene("OptionMenu.fxml", "Option Menu", 720, 530);
	}
}
