package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {
    public Label label;
    public Button button;
    public void buttonClickMethod(ActionEvent actionEvent){
        button.setText("LOGIN GLA UNIVERSITY");
    }
}
