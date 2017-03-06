package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import sample.Read.ReadData;

import java.util.HashMap;
import java.util.Map;

public class Controller {

    @FXML
    private TextField textImput;

    @FXML
    private TextArea response;

    @FXML
    private ToggleGroup locale;


    private Map<String,String>ltMap=new HashMap<>();
    private Map<String,String>enMap=new HashMap<>();

    public void translate (ActionEvent event){
        ReadData.readFile(ltMap,enMap);
        String text = ltMap.get(textImput.getText());
        if (isLtLocale()){
            text = enMap.get(textImput.getText());


        }
        response.setText(text);

    }
    private boolean isLtLocale(){
        boolean val = true;
        RadioButton radioButton = (RadioButton) locale.getSelectedToggle();
        if (!radioButton.getText().equals("LT")) {
            val = false;
        }
        return val;
    }
}
