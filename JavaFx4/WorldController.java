import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class WorldController {
	
	@FXML
	private TextField messageBox;

	public void sayHello(ActionEvent event) {
		String theMessage = messageBox.getText();
		messageBox.setText("you said \""+theMessage+"\"");
	}
}
