package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField helloMessage;

    public void displayHelloWorld(ActionEvent event){
        helloMessage.setText("Hello World");
    }
}
